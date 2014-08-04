package net.inkbunny.mobile.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import net.inkbunny.model.LoginResponse;
import net.inkbunny.model.LogoutResponse;
import net.inkbunny.model.RatingsResponse;
import net.inkbunny.mobile.IMSession;

import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

/**
 * Controller for Session Management
 */
@Controller
@RequestMapping("/session")
public class SessionController {

	static Logger log = Logger.getLogger(SessionController.class.getName());

	@Autowired
	private IMSession session;
	
	/**
	 * Displays the login page or session info with logout option
	 */
	@RequestMapping( method = RequestMethod.GET, value = "/login" )
    public String getLoginPage() {
        return "login";
    }
	
	/**
	 * Logout
	 */
	@RequestMapping( method = RequestMethod.GET, value = "/logout" )
    public String getLogout() {
		LogoutResponse response = preformUserLogout( session.getSSID() );
		session.setSSID( null );
		session.setUserId( null );
		session.setUsername( null );
        return "login";
    }
	
	/**
	 * Login as a user and populate the SSID in the session
	 */
	@RequestMapping( method = RequestMethod.POST, value = "/userlogin" )
    public String doUserLogin( ModelMap m, @RequestParam("username") String un, @RequestParam("password") String pass ) {
		LoginResponse response = preformUserLogin( un, pass );
		m.addAttribute( "loginResponse", response );
		if ( response.getErrorMessage() == null ){
			if ( log.isInfoEnabled() ) {
				log.info( "SessionController: Succesful login for user " + un );
				log.info( "SessionController: User " + un + " has sid of " + response.getSid() + ": adding to session." );
			}
			session.setSSID( response.getSid() );
			session.setUsername( un );
			session.setUserId( response.getUserId() );
		} else {
			if ( log.isInfoEnabled() ) {
				log.info( "SessionController: Login for user " + un + " gave error " + response.getErrorCode() + ": " + response.getErrorMessage() );
			}
		}
        return "login";
    }
	
	/**
	 * Login as a guest and populate the SSID in the session
	 */
	@RequestMapping( method = RequestMethod.POST, value = "/guestlogin" )
    public String doGuestLogin(
			@RequestParam( required = false, value = "guestrating2" ) Boolean r2,
			@RequestParam( required = false, value = "guestrating3" ) Boolean r3,
			@RequestParam( required = false, value = "guestrating4" ) Boolean r4,
			@RequestParam( required = false, value = "guestrating5" ) Boolean r5 ) {

		LoginResponse response = preformGuestLogin();
		session.setSSID( response.getSid() );
		session.setUsername( "guest" );
		session.setUserId( 0 );

		// Set the ratings
		RatingsResponse rResponse = setGuestRatings( session.getSSID(), r2, r3, r4, r5 );
		if ( rResponse.getErrorMessage() != null ){
			throw new RuntimeException( "Set guest ratings threw error: " + rResponse.getErrorMessage() );
		}

        return "login";

    }
	
	/**
	 * Helper method that makes REST request
	 */
	private LoginResponse preformUserLogin( String un, String pass ){
		Map urlVars = new HashMap<String,String>();
		urlVars.put( "username", un );
		urlVars.put( "password", pass );
		ResponseEntity<LoginResponse> response = new RestTemplate().getForEntity(
			"https://inkbunny.net/api_login.php?username={username}&password={password}",
			LoginResponse.class,
			urlVars
		);
		return response.getBody();	
	}
	
	/**
	 * Helper method that makes REST request
	 */
	private LogoutResponse preformUserLogout( String sid ){
		Map urlVars = new HashMap<String,String>();
		urlVars.put( "sid", sid );
		ResponseEntity<LogoutResponse> response = new RestTemplate().getForEntity(
			"https://inkbunny.net/api_logout.php?sid={sid}",
			LogoutResponse.class,
			urlVars
		);
		return response.getBody();	
	}
	
	/**
	 * Helper method that makes REST request
	 */
	private LoginResponse preformGuestLogin(){
		ResponseEntity<LoginResponse> response = new RestTemplate().getForEntity(
			"https://inkbunny.net/api_login.php?username=guest",
			LoginResponse.class
		);
		return response.getBody();	
	}
	
	/**
	 * Helper method that makes REST request
	 */
	private RatingsResponse setGuestRatings( String sid, Boolean r2, Boolean r3, Boolean r4, Boolean r5 ){
		Map urlVars = new HashMap<String,String>();
		urlVars.put( "sid", sid );
		urlVars.put( "tag[2]", yesNo(r2) );
		urlVars.put( "tag[3]", yesNo(r3) );
		urlVars.put( "tag[4]", yesNo(r4) );
		urlVars.put( "tag[5]", yesNo(r5) );
		ResponseEntity<RatingsResponse> response = new RestTemplate().getForEntity(
			"https://inkbunny.net/api_userrating.php?sid={sid}&tag[2]={tag[2]}&tag[3]={tag[3]}&tag[4]={tag[4]}&tag[5]={tag[5]}",
			RatingsResponse.class,
			urlVars
		);
		return response.getBody();	
	}
	
	/**
	 * Convert Boolean to yes or no
	 */
	private String yesNo( Boolean b ) {
		return ( b == null || !b ) ? "no" : "yes";
	}

}