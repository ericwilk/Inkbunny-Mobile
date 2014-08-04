package net.inkbunny.model;

import org.codehaus.jackson.annotate.JsonProperty;
import net.inkbunny.model.Submission;
import java.util.List;

/**
 * Entity bean for JSON bindings
 */
public class SubmissionDetails extends BaseMarshallingObject {

	/*
	 * Bean properties
	 */
	
	@JsonProperty("sid")
	private String sid;
	
	@JsonProperty("results_count")
	private Integer count;
	
	@JsonProperty("user_location")
	private String userLocation;
	
	@JsonProperty("submissions")
	private List<Submission> submissions;

	/*
	 * Default constructor
	 */

	public SubmissionDetails(){}

	/*
	 * Getters and Setters
	 */
	
	public String getSid() {
		return this.sid;
	}
	
	public void setSid( String sid ) {
		this.sid = sid;
	}
	
	public Integer getCount() {
		return this.count;
	}
	
	public void setCount( Integer count ) {
		this.count = count;
	}
	
	public String getUserLocation() {
		return this.userLocation;
	}
	
	public void setUserLocation( String userLocation ) {
		this.userLocation = userLocation;
	}
	
	public List<Submission> getSubmissions() {
		return this.submissions;
	}
	
	public void setSubmissions( List<Submission> submissions ) {
		this.submissions = submissions;
	}

}