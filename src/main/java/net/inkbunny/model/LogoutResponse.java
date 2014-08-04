package net.inkbunny.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Entity bean for JSON bindings
 */
public class LogoutResponse extends BaseMarshallingObject {

	/*
	 * Bean properties
	 */

	@JsonProperty("sid")
	private String sid;
	
	@JsonProperty("logout")
	private String logoutMsg;

	/*
	 * Default constructor
	 */

	public LogoutResponse(){}

	/*
	 * Getters and Setters
	 */

	public String getSid() {
		return this.sid;
	}
	
	public void setSid( String sid ) {
		this.sid = sid;
	}

	public String getLogoutMsg() {
		return this.logoutMsg;
	}
	
	public void setLogoutMsg( String logoutMsg ) {
		this.logoutMsg = logoutMsg;
	}

}