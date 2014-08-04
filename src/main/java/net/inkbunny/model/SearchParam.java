package net.inkbunny.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Entity bean for JSON bindings
 */
public class SearchParam {

	/*
	 * Bean properties
	 */

	@JsonProperty("param_name")
	private String name;
	
	@JsonProperty("param_value")
	private String value;

	/*
	 * Default constructor
	 */

	public SearchParam(){}

	/*
	 * Getters and Setters
	 */

	public String getName() {
		return this.name;
	}
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public void setValue( String value ) {
		this.value = value;
	}

}