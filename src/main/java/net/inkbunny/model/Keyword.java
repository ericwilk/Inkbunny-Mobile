package net.inkbunny.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Entity bean for JSON bindings
 */
public class Keyword {

	/*
	 * Bean properties
	 */

	@JsonProperty("keyword_id")
	private Integer id;
	
	@JsonProperty("keyword_name")
	private String name;
	
	@JsonProperty("submissions_count")
	private Integer count;
	
	@JsonProperty("contributed")
	private String contrib;

	/*
	 * Default constructor
	 */

	public Keyword(){}

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
	
	public Integer getCount() {
		return this.count;
	}
	
	public void setCount( Integer count ) {
		this.count = count;
	}
	
	public String getContrib() {
		return this.contrib;
	}
	
	public void setContrib( String contrib ) {
		this.contrib = contrib;
	}

}