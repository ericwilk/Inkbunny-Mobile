<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html>
<html>
<head><title>Search</title></head>
<body>
<div data-role="page" id="search_page">
	<!-- // Header -->
	<div data-role="header" data-id="mainToolbarTop" data-position="fixed">
		<h1>Search</h1>
		<a href="#home_page" data-icon="home" class="ui-btn-left" data-iconpos="notext">Home</a>
		<a href="/mvc/session/login/" data-icon="gear" class="ui-btn-right" data-rel="dialog" data-transition="pop" id="loginTextToChange" data-iconpos="notext">Login</a>
	</div>
	<!-- // Content -->
	<div data-role="content">	
		<form id="customSearchForm" action="/mvc/search/custom/" method="POST">
			<label for="search_page_customSearchString" class="ui-hidden-accessible">Search Text:</label>
			<input type="search" name="customSearchString" id="search_page_customSearchString" placeholder="Enter Search Text..." />
			<div data-role="fieldcontain">
				<fieldset data-role="controlgroup" data-type="horizontal" data-mini="true">
					<input type="radio" name="searchType" id="search_page_searchTypeAnd" checked />
					<label for="search_page_searchTypeAnd">And</label>
					<input type="radio" name="searchType" id="search_page_searchTypeOr" />
					<label for="search_page_searchTypeOr">Or</label>
					<input type="radio" name="searchType" id="search_page_searchTypePhrase" />
					<label for="search_page_searchTypePhrase">Phrase</label>
				</fieldset>
			</div>
			<div data-role="fieldcontain">
				<fieldset data-role="controlgroup" data-type="horizontal" data-mini="true">
					<input type="checkbox" name="searchInKeywords" id="search_page_searchInKeywords" />
					<label for="search_page_searchInKeywords">Keywords</label>
					<input type="checkbox" name="searchInTitle" id="search_page_searchInTitle" />
					<label for="search_page_searchInTitle">Title</label>
					<input type="checkbox" name="searchInDescriptionOrStory" id="search_page_searchInDescriptionOrStory" />
					<label for="search_page_searchInDescriptionOrStory">Description</label>
					<input type="checkbox" name="searchInMD5" id="search_page_searchInMD5" />
					<label for="search_page_searchInMD5">MD5</label>
				</fieldset>
			</div>
			<label for="search_page_searchByType" class="ui-hidden-accessible">Submission Type:</label>
			<select id="search_page_searchByType" name="searchByType" data-native-menu="false" multiple="multiple">
				<option value="1" selected disabled>Submission Type</option>
				<option value="1">Picture/Pinup</option>
				<option value="2">Sketch</option>
				<option value="3">Picture Series</option>
				<option value="4">Comic</option>
				<option value="5">Portfolio</option>
				<option value="6">Shockwave/Flash - Animation</option>
				<option value="7">Shockwave/Flash - Interactive</option>
				<option value="8">Video - Feature Length</option>
				<option value="9">Video - Animation/3D/CGI</option>
				<option value="10">Music - Single Track</option>
				<option value="11">Music - Album</option>
				<option value="12">Writing - Document</option>
				<option value="13">Character Sheet</option>
				<option value="14">Photography - Fursuit/Sculpture/Jewelry/etc</option>
			</select>
			<label for="search_page_numberOfDays" class="ui-hidden-accessible">Number Of Days:</label>
			<input type="range" min="1" max="365" name="numberOfDays" id="search_page_numberOfDays" placeholder="Days" />
			<input type="search" name="artistName" id="search_page_artistName" placeholder="Artist Name" />
			<br />
			<p><input type="submit" value="Search" data-icon="search" /></p>
		</form>	
	</div>
	<!-- // Footer
	<div data-role="footer" data-id="mainToolbarBottom" data-position="fixed">
		<h1>&nbsp;</h1>
		<a data-icon="back" class="ui-btn-left" data-iconpos="notext">Back</a>
		<a data-icon="forward" class="ui-btn-right" data-iconpos="notext">Forward</a>
	</div> -->
</div>
</body>
</html>