package net.inkbunny.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Base marshalling object for JSON bindings.
 */
public class BaseMarshallingObject {

	@JsonProperty("error_code") 
	private Integer errorCode;
	
	@JsonProperty("error_message")
	private String errorMessage;

	public BaseMarshallingObject(){}

	public Integer getErrorCode() {
		return this.errorCode;
	}
	
	public void setErrorCode( Integer errorCode ) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
	
	public void setErrorMessage( String errorMessage ) {
		this.errorMessage = errorMessage;
	}

}