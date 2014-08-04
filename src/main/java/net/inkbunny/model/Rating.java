package net.inkbunny.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Entity bean for JSON bindings
 */
public class Rating {

	/*
	 * Bean properties
	 */

	@JsonProperty("rating_id")
	private Integer id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("description")
	private String description;

	/*
	 * Default constructor
	 */

	public Rating(){}

	/*
	 * Getters and Setters
	 */

	public Integer getId() {
		return this.id;
	}
	
	public void setId( Integer id ) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription( String description ) {
		this.description = description;
	}

}