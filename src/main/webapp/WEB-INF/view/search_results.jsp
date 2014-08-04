<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*,net.inkbunny.model.Submission,net.inkbunny.model.SubmissionDetails" %>
<!DOCTYPE html>
<html>
<head><title>Search Results</title></head>
<body>
<div data-role="page" id="search_results_<c:out value='${searchType}'/>" class="search-results-page" data-dom-cache="true">

	<!-- // Header -->
	<div data-role="header" data-id="mainToolbarTop" data-position="fixed">
		<h1>Search Results</h1>
		<a href="#home_page" data-icon="home" class="ui-btn-left" data-iconpos="notext">Home</a>
		<a href="/mvc/session/login/" data-icon="gear" class="ui-btn-right" data-rel="dialog" data-transition="pop" id="loginTextToChange" data-iconpos="notext">Login</a>
	</div>

	<!-- // Content -->
	<div data-role="content">
	
		<div>
			<ul data-role="listview" id="search_results_view_list_<c:out value='${searchType}'/>"></ul>
		</div>

	</div>
	
	<input type="hidden" name="firstSetOfIds" id="firstSetOfIds_<c:out value='${searchType}'/>" value="<c:out value='${firstSetOfIds}'/>" />
	<input type="hidden" name="remainingSetOfIds" id="remainingSetOfIds_<c:out value='${searchType}'/>" value="<c:out value='${remainingSubmissionIds}'/>" />
	<input type="hidden" name="searchRid" id="searchRid_<c:out value='${searchType}'/>" value="<c:out value='${searchRid}'/>" />

	<!-- // Footer
	<div data-role="footer" data-id="mainToolbarBottom" data-position="fixed">
		<h1>&nbsp;</h1>
		<a data-icon="back" class="ui-btn-left" data-iconpos="notext">Back</a>
		<a data-icon="forward" class="ui-btn-right" data-iconpos="notext">Forward</a>
	</div> -->

</div>
</body>
</html>