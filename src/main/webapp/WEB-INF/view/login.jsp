<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div data-role="dialog" id="login_page">
<c:choose>
	<c:when test="${ empty inkbunnyMobileSession.username }">
		<!-- // Header -->
		<div data-role="header">
			<h1>Login</h1>
		</div>
		<!-- // Content -->
		<div data-role="content">	
			<h2>You are not logged in.</h2>
			<div data-role="collapsible">
				<h3>Login as user</h3>
				<form id="userLoginForm" action="/mvc/session/userlogin/" method="POST">
					<label for="login_page_username" class="ui-hidden-accessible">Username:</label>
					<input type="text" name="username" id="login_page_username" placeholder="Username" />
					<label for="login_page_password" class="ui-hidden-accessible">Password:</label>
					<input type="password" name="password" id="login_page_password" placeholder="Password" />
					<input type="submit" value="Login" />
				</form>
			</div>
			<div data-role="collapsible">
				<h3>Login as guest</h3>
				<form id="guestLoginForm" action="/mvc/session/guestlogin/" method="POST">
					<h3>Login as guest</h3>
					<div data-role="fieldcontain">
						<fieldset data-role="controlgroup">
							<legend>Set allowed ratings:</legend>
							<label><input type="checkbox" name="guestrating2" id="login_page_guestrating2" /> Nonsexual nudity </label>
							<label><input type="checkbox" name="guestrating3" id="login_page_guestrating3" /> Mild violence </label>
							<label><input type="checkbox" name="guestrating4" id="login_page_guestrating4" /> Sexual Themes </label>
							<label><input type="checkbox" name="guestrating5" id="login_page_guestrating5" /> Strong Violence </label>
						</fieldset>
					</div>
					<div data-role="fieldcontain">
						<fieldset data-role="controlgroup">
							<legend>Agree to the terms:</legend>
							<label><input type="checkbox" name="guestTOS1" id="login_page_guestTOS1" /> I am at least 18 years old and I am a legal adult in my state/country </label>
							<label><input type="checkbox" name="guestTOS2" id="login_page_guestTOS2" /> I understand and agree with the Inkbunny Philosophy </label>
							<label><input type="checkbox" name="guestTOS3" id="login_page_guestTOS3" /> I understand and agree with the Terms of Service </label>
						</fieldset>
					</div>
					<input type="submit" value="Login as guest" />
				</form>
			</div>
			<p><a href="#home_page" data-role="button" data-inline="true" data-icon="back">Back to menu.</a></p>	
		</div>
	</c:when>
	<c:otherwise>
		<!-- // Header -->
		<div data-role="header">
			<h1>Current Session</h1>
		</div>
		<!-- // Content -->
		<div data-role="content">	
			<h2>You are logged in as: <c:out value="${inkbunnyMobileSession.username}"/></h2>
			<p><a href="/mvc/session/logout/" data-role="button" data-inline="true">Logout.</a></p>
			<p><a href="#home_page" data-role="button" data-inline="true" data-icon="back">Back to menu.</a></p>	
		</div>
	</c:otherwise>
</c:choose>
</div>