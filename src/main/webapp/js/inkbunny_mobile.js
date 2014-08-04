///////////////////////////////////////////////
// Main JS included in the JQM landing page.//
/////////////////////////////////////////////

// GLOBALS GO HERE

// This is a global struct to hold search results. The main key is the search type since multiple searches can
// be applicable at once (for example, user does a custom search, drills down to a result and goes to the
// artist, looks at the results and then goes back to the custom search results. The ID's are all appended with
// the search type to differentiate the elements and JQuery Mobile to cache the page DOM.
__IB_currentSearchResults = {};

//////////////////////////////////////////
// On client mobile application init...//
////////////////////////////////////////

$(function() {
	// See if the user is logged in so we can display the login box the first time if they are not
	// This is rather cheesy but easier than setting up more controllers to do the same thing
	$.ajax({
		url: '/mvc/session/login/',
		dataType: 'text',
		success: function(data) {
			if( data.indexOf("You are not logged in.") != -1 ) {
				setTimeout( function() {
					$.mobile.changePage( "/mvc/session/login/", {transition: 'pop', role: 'dialog'});
				}, 1000 );
			}
		}
	});
});

//////////////////////////////////////
// On every page and dialog init...//
////////////////////////////////////

$('div[data-role="page"],div[data-role="dialog"]').live("pageinit", function() {

	$( "#guestLoginForm" ).submit( function() {
		var boolAllIsChecked = (
			$('#login_page_guestTOS1').attr('checked') &&
			$('#login_page_guestTOS2').attr('checked') &&
			$('#login_page_guestTOS3').attr('checked') );
		if ( !boolAllIsChecked ) {
			alert( "You must agree to the terms and conditions before signing in as guest." );
			return false;
		}
		return true;
	});

});

///////////////////////////////////
// Image preview -> description //
/////////////////////////////////

$("#submission_view_image_preview").live( "click", function( evt ) {
	$.mobile.changePage( $("#submission_description_view") );
});

//////////////////////////////////////
// The search results page logic...//
////////////////////////////////////

$('.search-results-page').live("pageinit", function() {

	var pageSearchType = this.id.match(/search_results_(.+)/)[1];
	var lstFirstSetOfIds = $( "#firstSetOfIds_" + pageSearchType ).val();
	var lstRemainingSetOfIds = $( "#remainingSetOfIds_" + pageSearchType ).val();
	
	if ( !lstFirstSetOfIds ) {
		$.mobile.changePage( $("#nosearchresults_dialog") );
	}

	addChunkToSearchList( pageSearchType, lstFirstSetOfIds );
	
	$(window).bind('scrollstop', function ( evt ) {
		var boolWindowIsNearBottom = ( $("#search_results_view_list_" + pageSearchType).height() - $(window).scrollTop() < 700 )
		if ( lstRemainingSetOfIds && boolWindowIsNearBottom ) {
			$.mobile.showPageLoadingMsg();
			var lstNextChunk = lstRemainingSetOfIds.substring( 0, lstFirstSetOfIds.length );
			lstRemainingSetOfIds = lstRemainingSetOfIds.substring( lstFirstSetOfIds.length );
			addChunkToSearchList( pageSearchType, lstFirstSetOfIds );
		}

	});
	
});


///////////////////////////////////
// Previous and next buttons... //
/////////////////////////////////

$('#submission_view_prev_button').live("click", function() {
	var pageSearchType = $("#submission_view_image_preview").attr("pagesearchtype");
	var searchIndex = $("#submission_view_image_preview").attr("searchindex");
	searchIndex = parseInt( searchIndex, 10 );
	searchIndex = searchIndex - 1;
	if ( searchIndex >= 0 ) {
		$.mobile.showPageLoadingMsg();
		updateSubmissionViewFromGlobal( pageSearchType, searchIndex );
	}
	return false;
});

$('#submission_view_next_button').live("click", function() {
	var pageSearchType = $("#submission_view_image_preview").attr("pagesearchtype");
	var searchIndex = $("#submission_view_image_preview").attr("searchindex");
	searchIndex = parseInt( searchIndex, 10 );
	searchIndex = searchIndex + 1;
	if ( searchIndex <= ( __IB_currentSearchResults[pageSearchType].length - 1 ) ) {
		$.mobile.showPageLoadingMsg();
		updateSubmissionViewFromGlobal( pageSearchType, searchIndex );
	}
	return false;
});

/////////////////
// Helpers... //
///////////////

updateSubmissionViewFromGlobal = function( searchType, index ) {
	
	$("#submission_view_image_preview").attr( "src", __IB_currentSearchResults[searchType][index]["prevImgUrl"] );
	// do this on image load so we don't have an annoying delay
	$("#submission_view_image_preview").bind( "load", function(){
		$("#submission_view_image_preview").attr( "pagesearchtype", searchType );
		$("#submission_view_image_preview").attr( "searchindex", index );
		$("#submission_view_title_text").html( __IB_currentSearchResults[searchType][index]["title"] );
		// JQM adds this SPAN stuff to the element the first time.  After this we must add it so the styles stay consistent.
		if ( $("#submission_view_artist_name").html() == 'Artist Name' ) {
			$("#submission_view_artist_name").html( __IB_currentSearchResults[searchType][index]["artist"] );
		} else {
			$("#submission_view_artist_name").html( "<span class=\"ui-btn-inner ui-btn-corner-all\"><span class=\"ui-btn-text\">" + __IB_currentSearchResults[searchType][index]["artist"] + "</span></span>" );
		}
		$("#submission_view_artist_name").attr( "href", "/mvc/search/byartist/" + __IB_currentSearchResults[searchType][index]["artistId"] );
		$("#submission_view_description_container").html( __IB_currentSearchResults[searchType][index]["description"] );
		$.mobile.hidePageLoadingMsg();
	});

}

addChunkToSearchList = function( pageSearchType, ids ){

	$.get("/mvc/search/detailedsearch_json?ids=" + ids, function(data){
	
		__IB_currentSearchResults[pageSearchType] = [];
	
		for( var i in data.submissions) { // array of submissions
		
			for ( var file in data.submissions[i].files ) {

				var index = __IB_currentSearchResults[pageSearchType].length;
				__IB_currentSearchResults[pageSearchType][index] = {};
				__IB_currentSearchResults[pageSearchType][index]["id"] = data.submissions[i]["submission_id"];
				__IB_currentSearchResults[pageSearchType][index]["artist"] = data.submissions[i]["username"];
				__IB_currentSearchResults[pageSearchType][index]["artistId"] = data.submissions[i]["user_id"];
				__IB_currentSearchResults[pageSearchType][index]["title"] = data.submissions[i]["title"];
				__IB_currentSearchResults[pageSearchType][index]["description"] = data.submissions[i]["description"].replace(/\[[a-zA-Z]+\](.+)\[\/[a-zA-Z]+\]/g,"$1"); // strip bbcode
				__IB_currentSearchResults[pageSearchType][index]["thumbUrl"] = data.submissions[i]["files"][file]["thumbnail_url_medium"];
				__IB_currentSearchResults[pageSearchType][index]["screenImgUrl"] = data.submissions[i]["files"][file]["file_url_screen"];
				__IB_currentSearchResults[pageSearchType][index]["prevImgUrl"] = data.submissions[i]["files"][file]["file_url_preview"];

				var elNewLi = document.createElement("li");
				var elNewAnchor = document.createElement("a");
				var elNewImage = document.createElement("img");
				var elNewTitle = document.createElement("h3");
				var elNewAuthor = document.createElement("p");
				
				elNewTitle.innerHTML = __IB_currentSearchResults[pageSearchType][index]["title"];
				elNewAuthor.innerHTML = __IB_currentSearchResults[pageSearchType][index]["artist"];
				
				elNewImage.src = __IB_currentSearchResults[pageSearchType][index]["thumbUrl"];
				
				var anchorId = pageSearchType + "_anchor_" + index;
				elNewAnchor.id = anchorId;
				elNewAnchor.href = __IB_currentSearchResults[pageSearchType][index]["screenImgUrl"];
				elNewAnchor.onclick = function() {
					var pageSearchType = this.id.match(/(.+)_anchor.+/)[1];
					var searchIndex = this.id.match(/(.+)_anchor_([0-9]+)/)[2];
					searchIndex = parseInt( searchIndex, 10 );
					updateSubmissionViewFromGlobal( pageSearchType, searchIndex );
					$.mobile.changePage( $("#submission_view") );
					return false;
				}

				elNewAnchor.appendChild( elNewImage );
				elNewAnchor.appendChild( elNewTitle );
				elNewAnchor.appendChild( elNewAuthor );
				elNewLi.appendChild( elNewAnchor );
				
				$( "#search_results_view_list_" + pageSearchType ).append( elNewLi );

			}
		}
		
		$( "#search_results_view_list_" + pageSearchType ).listview('refresh');
		
		$.mobile.hidePageLoadingMsg();

	});
	
}