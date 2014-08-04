package net.inkbunny.model;

import java.util.List;

import net.inkbunny.model.Keyword;
import net.inkbunny.model.Submission;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Entity bean for JSON bindings
 */
public class SearchResults extends BaseMarshallingObject {

	/*
	 * Bean properties
	 */

	@JsonProperty("sid")
	private String sid;
	
	@JsonProperty("user_location")
	private String userLocation;
	
	@JsonProperty("results_count_all")
	private Integer resultsCountAll;
	
	@JsonProperty("results_count_thispage")
	private Integer resultsCountThisPage;
	
	@JsonProperty("pages_count")
	private Integer pagesCount;
	
	@JsonProperty("page")
	private Integer page;
	
	@JsonProperty("rid")
	private String rid;
	
	@JsonProperty("rid_ttl")
	private String ridTTL;
	
	@JsonProperty("search_params")
	private List<SearchParam> searchParams;
	
	@JsonProperty("keyword_list")
	private List<Keyword> keywordList;
	
	@JsonProperty("submissions")
	private List<Submission> submissions;

	/*
	 * Default constructor
	 */

	public SearchResults(){}

	/*
	 * Getters and Setters
	 */

	public String getSid() {
		return this.sid;
	}
	
	public void setSid( String sid ) {
		this.sid = sid;
	}
	
	public String getUserLocation() {
		return this.userLocation;
	}
	
	public void setUserLocation( String userLocation ) {
		this.userLocation = userLocation;
	}
	
	public Integer getResultsCountAll() {
		return this.resultsCountAll;
	}

	public void setResultsCountAll( Integer resultsCountAll ) {
		this.resultsCountAll = resultsCountAll;
	}
	
	public Integer getResultsCountThisPage() {
		return this.resultsCountThisPage;
	}

	public void setResultsCountThisPage( Integer resultsCountThisPage ) {
		this.resultsCountThisPage = resultsCountThisPage;
	}
	
	public Integer getPagesCount() {
		return this.pagesCount;
	}

	public void setPagesCount( Integer pagesCount ) {
		this.pagesCount = pagesCount;
	}
	
	public Integer getPage() {
		return this.page;
	}

	public void setPage( Integer page ) {
		this.page = page;
	}
	
	public String getRid() {
		return this.rid;
	}

	public void setRid( String rid ) {
		this.rid = rid;
	}
	
	public String getRidTTL() {
		return this.ridTTL;
	}
	
	public void setRidTTL( String ridTTL ) {
		this.ridTTL = ridTTL;
	}
	
	public List<SearchParam> getSearchParams() {
		return this.searchParams;
	}
	
	public void setSearchParams( List<SearchParam> searchParams ) {
		this.searchParams = searchParams;
	}
	
	public List<Keyword> getKeywordList() {
		return this.keywordList;
	}
	
	public void setKeywordList( List<Keyword> keywordList ) {
		this.keywordList = keywordList;
	}
	
	public List<Submission> getSubmissions() {
		return this.submissions;
	}
	
	public void setSubmissions( List<Submission> submissions ) {
		this.submissions = submissions;
	}

}