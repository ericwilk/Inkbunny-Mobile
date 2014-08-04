package net.inkbunny.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Entity bean for JSON bindings
 */
public class LoginResponse extends BaseMarshallingObject {

	/*
	 * Bean properties
	 */

	@JsonProperty("sid")
	private String sid;
	
	@JsonProperty("user_id")
	private Integer userId;
	
	@JsonProperty("ratingsmask")
	private Integer ratingsmask;

	/*
	 * Default constructor
	 */

	public LoginResponse(){}

	/*
	 * Getters and Setters
	 */

	public String getSid() {
		return this.sid;
	}
	
	public void setSid( String sid ) {
		this.sid = sid;
	}

	public Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId( Integer userId ) {
		this.userId = userId;
	}

	public Integer getRatingsmask() {
		return this.ratingsmask;
	}
	
	public void setRatingsmask( Integer ratingsmask ) {
		this.ratingsmask = ratingsmask;
	}

}