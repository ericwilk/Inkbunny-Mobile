package net.inkbunny.mobile.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import net.inkbunny.mobile.IMSession;
import net.inkbunny.model.SearchResults;
import net.inkbunny.model.Submission;
import net.inkbunny.model.SubmissionDetails;

import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

/**
 * Controller for Search Functionality
 */
@Controller
@RequestMapping("/search")
public class SearchController {

	static Logger log = Logger.getLogger(SessionController.class.getName());
	
	/**
	* Max results per page.  The first page is sent to the view and the rest as a list of ID's.
	*/
	private static final Integer MAX_SEARCH_RESULTS_PER_PAGE = 20;
	
	/**
	* Max pages. Only the fist page is sent to the view but the complete list of ID's is, as well.
	*/
	private static final Integer MAX_SEARCH_PAGES_RETURNED = 10;

	@Autowired
	private IMSession session;
	
	public enum CannedSearch {

		NEW_SUBMISSIONS() {
			@Override
			public Map<String,String> getUrlParamMap() {
				Map<String,String> map = new HashMap<String,String>();
				map.put( "unread_submissions", "yes" );
				return map;
			}		
		},
		FAVORITES() {
			@Override
			public Map<String,String> getUrlParamMap() {
				// Need user ID from session.
				// Since an enum is implicitly static we will do that later.
				return null;
			}
		},
		POPULAR() {
			@Override
			public Map<String,String> getUrlParamMap() {
				Map<String,String> map = new HashMap<String,String>();
				map.put( "dayslimit", "3" );
				map.put( "orderby", "views" );
				map.put( "type", "1,2,3,4" );
				return map;
			}
		},
		RECENT_PICS() {
			@Override
			public Map<String,String> getUrlParamMap() {
				Map<String,String> map = new HashMap<String,String>();
				map.put( "dayslimit", "1" );
				map.put( "orderby", "create_datetime" );
				map.put( "type", "1,2,3,4" );
				return map;
			}
		},
		RECENT_STORIES() {
			@Override
			public Map<String,String> getUrlParamMap() {
				Map<String,String> map = new HashMap<String,String>();
				map.put( "dayslimit", "7" );
				map.put( "orderby", "create_datetime" );
				map.put( "type", "12" );			
				return map;
			}
		};
		
		private CannedSearch() {}
		public abstract Map<String,String> getUrlParamMap();
		
	}
	
	
	/**
	 * Displays the custom search page
	 */
	@RequestMapping( method = RequestMethod.GET )
    public String getSearchForm() {
        return "search";
    }
	
	/**
	 * Preform a custom search and send results to view
	 */
	@RequestMapping( method = RequestMethod.POST, value = "/custom" )
    public String doCustomSearch(
		ModelMap m,
		@RequestParam("customSearchString") String searchString,
		@RequestParam("searchType") String searchType,
		@RequestParam( required = false, value = "searchInKeywords" ) Boolean useKeywords,
		@RequestParam( required = false, value = "searchInTitle" ) Boolean useTitle,
		@RequestParam( required = false, value = "searchInDescriptionOrStory") Boolean useDescStory,
		@RequestParam( required = false, value = "searchInMD5") Boolean useMD5,
		@RequestParam( required = false, value = "searchByType") List<Integer> byType,
		@RequestParam("artistName") String artistName,
		@RequestParam("numberOfDays") Integer numberDays
	){
	
		String searchTypesCommaSep = "";
		if ( byType != null ) {
			for ( Integer i : byType ) {
				searchTypesCommaSep += ( byType.indexOf( i ) < byType.size() - 1 ) ? ( i + "," ) : i;
			}
		}
		
		Map<String,String> urlVars = new HashMap<String,String>();
		if ( searchString.trim().length() > 0 ) urlVars.put( "text", searchString );
		if ( searchType.trim().length() > 0 ) urlVars.put( "string_join_type", searchType.toLowerCase() );
		if ( useKeywords != null ) urlVars.put( "keywords", yesNo(useKeywords) );
		if ( useTitle != null ) urlVars.put( "title", yesNo(useTitle) );
		if ( useDescStory != null ) urlVars.put( "description", yesNo(useDescStory) );
		if ( useMD5 != null ) urlVars.put( "md5", yesNo(useMD5) );
		if ( byType != null ) urlVars.put( "type", searchTypesCommaSep );
		if ( artistName.trim().length() > 0 ) urlVars.put( "username", artistName );
		if ( numberDays != null && numberDays > 0 ) urlVars.put( "dayslimit", numberDays.toString() );
		
		List<SearchResults> resultsList = preformIdSearchForUrlMap( urlVars );
		List<Integer> firstSetOfIds = new ArrayList<Integer>();
		List<Integer> remainingSetOfIds = new ArrayList<Integer>();
		
		for ( int i = 0; i < resultsList.size(); i++ ) {
			for ( Submission s : resultsList.get(i).getSubmissions() ) {
				if ( i == 0 ) {
					firstSetOfIds.add(s.getSubmissionId());
				} else {
					remainingSetOfIds.add(s.getSubmissionId());
				}
			}
		}

		m.addAttribute( "searchType", "custom" );
		m.addAttribute( "firstSetOfIds", commaSep(firstSetOfIds) );
		m.addAttribute( "remainingSubmissionIds", commaSep(remainingSetOfIds) );
		m.addAttribute( "searchRid", resultsList.get(0).getRid() );
		
		return "search_results";

    }
	
	/**
	 * Run a canned search and send results to view
	 */
	@RequestMapping( method = RequestMethod.GET, value = "/canned/{searchType}" )
    public String getCannedSearchResults( @PathVariable CannedSearch searchType, ModelMap m ) {

		List<SearchResults> resultsList = null;

		if ( searchType == CannedSearch.FAVORITES ) {
			Map<String,String> urlMapFavs = new HashMap<String,String>();
			urlMapFavs.put( "favs_user_id", session.getUserId().toString() );
			resultsList = preformIdSearchForUrlMap( urlMapFavs );
		} else {
			resultsList = preformIdSearchForUrlMap( searchType.getUrlParamMap() );
		}

		List<Integer> firstSetOfIds = new ArrayList<Integer>();
		List<Integer> remainingSetOfIds = new ArrayList<Integer>();
		
		for ( int i = 0; i < resultsList.size(); i++ ) {
			for ( Submission s : resultsList.get(i).getSubmissions() ) {
				if ( i == 0 ) {
					firstSetOfIds.add(s.getSubmissionId());
				} else {
					remainingSetOfIds.add(s.getSubmissionId());
				}
			}
		}
		
		m.addAttribute( "searchType", searchType.toString() );
		m.addAttribute( "firstSetOfIds", commaSep(firstSetOfIds) );
		m.addAttribute( "remainingSubmissionIds", commaSep(remainingSetOfIds) );
		m.addAttribute( "searchRid", resultsList.get(0).getRid() );
		
		return "search_results";

    }

	
	/**
	 * Search by artist and send results to view
	 */
	@RequestMapping( method = RequestMethod.GET, value = "/byartist/{userId}" )
    public String getArtistSubmissionsById( @PathVariable Integer userId, ModelMap m ) {
	
		Map<String,String> urlVars = new HashMap<String,String>();
		urlVars.put( "user_id", userId.toString() );
	
		List<SearchResults> resultsList = preformIdSearchForUrlMap( urlVars );
		
		List<Integer> firstSetOfIds = new ArrayList<Integer>();
		List<Integer> remainingSetOfIds = new ArrayList<Integer>();
		
		for ( int i = 0; i < resultsList.size(); i++ ) {
			for ( Submission s : resultsList.get(i).getSubmissions() ) {
				if ( i == 0 ) {
					firstSetOfIds.add(s.getSubmissionId());
				} else {
					remainingSetOfIds.add(s.getSubmissionId());
				}
			}
		}
		
		m.addAttribute( "searchType", "artist" );
		m.addAttribute( "firstSetOfIds", commaSep(firstSetOfIds) );
		m.addAttribute( "remainingSubmissionIds", commaSep(remainingSetOfIds) );
		m.addAttribute( "searchRid", resultsList.get(0).getRid() );
		
		return "search_results";

    }
	
	/**
	 * REST request to get detailed {@code Submission} results from the corresponding IDs.
	 *
	 * @param ids a {@code List} of ids to search
	 * @return a {@code SubmissionDetails} containing the submission info
	 */
	@RequestMapping( method = RequestMethod.GET, value = "/detailedsearch_json" )
	public @ResponseBody SubmissionDetails getDetailedSearchForIds( @RequestParam("ids") List<Integer> ids ) {

		String idsCommaSeparated = commaSep(ids);
		
		Map urlVars = new HashMap<String,String>();
		urlVars.put( "sid", session.getSSID() );
		urlVars.put( "submission_ids", idsCommaSeparated );

		String parameterizedRestURL = "https://inkbunny.net/api_submissions.php?sid={sid}&submission_ids={submission_ids}&show_description=yes";

		ResponseEntity<SubmissionDetails> response = new RestTemplate().getForEntity(
			parameterizedRestURL,
			SubmissionDetails.class,
			urlVars
		);
		
		SubmissionDetails resultDetails = response.getBody();
		resultDetails.setSid(null);
		return resultDetails;	
	}

	
	/**
	 * REST request to get ids.
	 *
	 * @param urlVars a {@code Map} of URL vars
	 * @return a {@code List} of {@code SearchResults} object containing the ids and search metadata
	 */
	 private List<SearchResults> preformIdSearchForUrlMap( Map<String,String> urlVars ) {
	 
		List<SearchResults> resultingList = new ArrayList<SearchResults>();
		
		String parameterizedRestURL = "https://inkbunny.net/api_search.php?sid={sid}&submission_ids_only=yes";
		parameterizedRestURL += "&submissions_per_page=" + MAX_SEARCH_RESULTS_PER_PAGE;
		
		for ( String key : urlVars.keySet() ) {
			parameterizedRestURL += ( "&" + key + "={" + key + "}" );
		}
		
		urlVars.put( "sid", session.getSSID() );
		
		ResponseEntity<SearchResults> firstResponse = new RestTemplate().getForEntity(
			parameterizedRestURL + "&get_rid=yes",
			SearchResults.class,
			urlVars
		);
		
		SearchResults firstSearchResults = firstResponse.getBody();
		
		if ( firstSearchResults != null ) {
		
			resultingList.add( firstSearchResults );
			
			int pagesCompleted = 1;
			int pagesTotal = ( firstSearchResults.getPagesCount() < MAX_SEARCH_PAGES_RETURNED ) ?
				firstSearchResults.getPagesCount() : MAX_SEARCH_PAGES_RETURNED;
			urlVars.put( "rid", firstSearchResults.getRid() );
			parameterizedRestURL += "&rid={rid}";

			// Get the remaining pages and add to our List.
			for ( Integer i = 2; i <= pagesTotal; i++ ) {
				resultingList.add(
					( new RestTemplate().getForEntity(
						parameterizedRestURL + "&page=" + i,
						SearchResults.class,
						urlVars
						)
					).getBody()
				);
			}
			
		} // null check
		
		return resultingList;
	 }
	
	/**
	 * Convert Boolean to yes or no
	 */
	private String yesNo( Boolean b ) {
		return ( b == null || !b ) ? "no" : "yes";
	}
	
	/**
	 * Convert List<Integer> to comma separated list
	 */
	private String commaSep( List<Integer> ids ) {
		String idsCommaSeparated = "";
		int counter = 1;
		for ( Integer id : ids ) {
			idsCommaSeparated += ( counter ++ < ids.size() ) ? ( id + "," ) : id;
		}
		return idsCommaSeparated;
	}

}