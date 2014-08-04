package net.inkbunny.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Entity bean for JSON bindings
 */
public class RatingsResponse extends BaseMarshallingObject {

	/*
	 * Bean properties
	 */

	@JsonProperty("sid")
	private String sid;

	/*
	 * Default constructor
	 */

	public RatingsResponse(){}

	/*
	 * Getters and Setters
	 */

	public String getSid() {
		return this.sid;
	}
	
	public void setSid( String sid ) {
		this.sid = sid;
	}

}