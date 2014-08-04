package net.inkbunny.mobile;

/**
 * A Session-Scoped bean to hold session info
 */
public class IMSession {

	private String username;
	private String ssid;
	private Integer userId;

	public String getUsername() {
		return this.username;
	}
	
	public void setUsername( String username ) {
		this.username = username;
	}
	
	public String getSSID() {
		return this.ssid;
	}
	
	public void setSSID( String ssid ) {
		this.ssid = ssid;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId( Integer userId ) {
		this.userId = userId;
	}


}