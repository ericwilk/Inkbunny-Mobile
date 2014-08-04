package net.inkbunny.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Entity bean for JSON bindings
 */
public class Pool {

	/*
	 * Bean properties
	 */

	@JsonProperty("pool_id")
	private Integer id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("count")
	private Integer count;
	
	@JsonProperty("submission_left_submission_id")
	private Integer submissionLeftSubId;
	
	@JsonProperty("submission_right_submission_id")
	private Integer submissionRightSubId;
	
	@JsonProperty("submission_left_file_name")
	private String submissionLeftFileName;
	
	@JsonProperty("submission_right_file_name")
	private String submissionRightFileName;
	
	@JsonProperty("submission_left_thumbnail_url_small")
	private String submissionLeftThumbUrlSmall;
	
	@JsonProperty("submission_left_thumbnail_url_medium")
	private String submissionLeftThumbUrlMedium;
	
	@JsonProperty("submission_left_thumbnail_url_large")
	private String submissionLeftThumbUrlLarge;
	
	@JsonProperty("submission_right_thumbnail_url_small")
	private String submissionRightThumbUrlSmall;
	
	@JsonProperty("submission_right_thumbnail_url_medium")
	private String submissionRightThumbUrlMedium;
	
	@JsonProperty("submission_right_thumbnail_url_large")
	private String submissionRightThumbUrlLarge;
	
	@JsonProperty("submission_left_thumbnail_url_small_noncustom")
	private String submissionLeftThumbUrlSmallNoncustom;
	
	@JsonProperty("submission_left_thumbnail_url_medium_noncustom")
	private String submissionLeftThumbUrlMediumNoncustom;
	
	@JsonProperty("submission_left_thumbnail_url_large_noncustom")
	private String submissionLeftThumbUrlLargeNoncustom;
	
	@JsonProperty("submission_right_thumbnail_url_small_noncustom")
	private String submissionRightThumbUrlSmallNoncustom;
	
	@JsonProperty("submission_right_thumbnail_url_medium_noncustom")
	private String submissionRightThumbUrlMediumNoncustom;
	
	@JsonProperty("submission_right_thumbnail_url_large_noncustom")
	private String submissionRightThumbUrlLargeNoncustom;
	
	@JsonProperty("submission_left_thumb_small_x")
	private Integer submissionLeftThumbSmallX;
	
	@JsonProperty("submission_left_thumb_medium_x")
	private Integer submissionLeftThumbMediumX;
	
	@JsonProperty("submission_left_thumb_large_x")
	private Integer submissionLeftThumbLargeX;
	
	@JsonProperty("submission_right_thumb_small_x")
	private Integer submissionRightThumbSmallX;
	
	@JsonProperty("submission_right_thumb_medium_x")
	private Integer submissionRightThumbMediumX;
	
	@JsonProperty("submission_right_thumb_large_x")
	private Integer submissionRightThumbLargeX;
	
	@JsonProperty("submission_left_thumb_small_y")
	private Integer submissionLeftThumbSmallY;
	
	@JsonProperty("submission_left_thumb_medium_y")
	private Integer submissionLeftThumbMediumY;
	
	@JsonProperty("submission_left_thumb_large_y")
	private Integer submissionLeftThumbLargeY;
	
	@JsonProperty("submission_right_thumb_small_y")
	private Integer submissionRightThumbSmallY;
	
	@JsonProperty("submission_right_thumb_medium_y")
	private Integer submissionRightThumbMediumY;
	
	@JsonProperty("submission_right_thumb_large_y")
	private Integer submissionRightThumbLargeY;
	
	@JsonProperty("submission_left_thumb_small_noncustom_x")
	private Integer submissionLeftThumbSmallNoncustomX;
	
	@JsonProperty("submission_left_thumb_medium_noncustom_x")
	private Integer submissionLeftThumbMediumNoncustomX;
	
	@JsonProperty("submission_left_thumb_large_noncustom_x")
	private Integer submissionLeftThumbLargeNoncustomX;
	
	@JsonProperty("submission_right_thumb_small_noncustom_x")
	private Integer submissionRightThumbSmallNoncustomX;
	
	@JsonProperty("submission_right_thumb_medium_noncustom_x")
	private Integer submissionRightThumbMediumNoncustomX;
	
	@JsonProperty("submission_right_thumb_large_noncustom_x")
	private Integer submissionRightThumbLargeNoncustomX;
	
	@JsonProperty("submission_left_thumb_small_noncustom_y")
	private Integer submissionLeftThumbSmallNoncustomY;
	
	@JsonProperty("submission_left_thumb_medium_noncustom_y")
	private Integer submissionLeftThumbMediumNoncustomY;
	
	@JsonProperty("submission_left_thumb_large_noncustom_y")
	private Integer submissionLeftThumbLargeNoncustomY;
	
	@JsonProperty("submission_right_thumb_small_noncustom_y")
	private Integer submissionRightThumbSmallNoncustomY;
	
	@JsonProperty("submission_right_thumb_medium_noncustom_y")
	private Integer submissionRightThumbMediumNoncustomY;
	
	@JsonProperty("submission_right_thumb_large_noncustom_y")
	private Integer submissionRightThumbLargeNoncustomY;
	


	/*
	 * Default constructor
	 */

	public Pool(){}

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
	
	public Integer getCount() {
		return this.count;
	}
	
	public void setCount( Integer count ) {
		this.count = count;
	}
	
	public Integer getSubmissionLeftSubId() {
		return this.submissionLeftSubId;
	}
	
	public void setSubmissionLeftSubId( Integer submissionLeftSubId ) {
		this.submissionLeftSubId = submissionLeftSubId;
	}
	
	public Integer getSubmissionRightSubId() {
		return this.submissionRightSubId;
	}
	
	public void setSubmissionRightSubId( Integer submissionRightSubId ) {
		this.submissionRightSubId = submissionRightSubId;
	}
	
	public String getSubmissionLeftFileName() {
		return this.submissionLeftFileName;
	}
	
	public void setSubmissionLeftFileName( String submissionLeftFileName ) {
		this.submissionLeftFileName = submissionLeftFileName;
	}
	
	public String getSubmissionRightFileName() {
		return this.submissionRightFileName;
	}
	
	public void setSubmissionRightFileName( String submissionRightFileName ) {
		this.submissionRightFileName = submissionRightFileName;
	}
	
	public String getSubmissionLeftThumbUrlSmall() {
		return this.submissionLeftThumbUrlSmall;
	}
	
	public void setSubmissionLeftThumbUrlSmall( String submissionLeftThumbUrlSmall ) {
		this.submissionLeftThumbUrlSmall = submissionLeftThumbUrlSmall;
	}
	
	public String getSubmissionLeftThumbUrlMedium() {
		return this.submissionLeftThumbUrlMedium;
	}
	
	public void setSubmissionLeftThumbUrlMedium( String submissionLeftThumbUrlMedium ) {
		this.submissionLeftThumbUrlMedium = submissionLeftThumbUrlMedium;
	}
	
	public String getSubmissionLeftThumbUrlLarge() {
		return this.submissionLeftThumbUrlLarge;
	}
	
	public void setSubmissionLeftThumbUrlLarge( String submissionLeftThumbUrlLarge ) {
		this.submissionLeftThumbUrlLarge = submissionLeftThumbUrlLarge;
	}
	
	public String getSubmissionRightThumbUrlSmall() {
		return this.submissionRightThumbUrlSmall;
	}
	
	public void setSubmissionRightThumbUrlSmall( String submissionRightThumbUrlSmall ) {
		this.submissionRightThumbUrlSmall = submissionRightThumbUrlSmall;
	}
	
	public String getSubmissionRightThumbUrlMedium() {
		return this.submissionRightThumbUrlMedium;
	}
	
	public void setSubmissionRightThumbUrlMedium( String submissionRightThumbUrlMedium ) {
		this.submissionRightThumbUrlMedium = submissionRightThumbUrlMedium;
	}
	
	public String getSubmissionRightThumbUrlLarge() {
		return this.submissionRightThumbUrlLarge;
	}
	
	public void setSubmissionRightThumbUrlLarge( String submissionRightThumbUrlLarge ) {
		this.submissionRightThumbUrlLarge = submissionRightThumbUrlLarge;
	}
	
	public String getSubmissionLeftThumbUrlSmallNoncustom() {
		return this.submissionLeftThumbUrlSmallNoncustom;
	}
	
	public void setSubmissionLeftThumbUrlSmallNoncustom( String submissionLeftThumbUrlSmallNoncustom ) {
		this.submissionLeftThumbUrlSmallNoncustom = submissionLeftThumbUrlSmallNoncustom;
	}
	
	public String getSubmissionLeftThumbUrlMediumNoncustom() {
		return this.submissionLeftThumbUrlMediumNoncustom;
	}
	
	public void setSubmissionLeftThumbUrlMediumNoncustom( String submissionLeftThumbUrlMediumNoncustom ) {
		this.submissionLeftThumbUrlMediumNoncustom = submissionLeftThumbUrlMediumNoncustom;
	}
	
	public String getSubmissionLeftThumbUrlLargeNoncustom() {
		return this.submissionLeftThumbUrlLargeNoncustom;
	}
	
	public void setSubmissionLeftThumbUrlLargeNoncustom( String submissionLeftThumbUrlLargeNoncustom ) {
		this.submissionLeftThumbUrlLargeNoncustom = submissionLeftThumbUrlLargeNoncustom;
	}
	
	public String getSubmissionRightThumbUrlSmallNoncustom() {
		return this.submissionRightThumbUrlSmallNoncustom;
	}
	
	public void setSubmissionRightThumbUrlSmallNoncustom( String submissionRightThumbUrlSmallNoncustom ) {
		this.submissionRightThumbUrlSmallNoncustom = submissionRightThumbUrlSmallNoncustom;
	}
	
	public String getSubmissionRightThumbUrlMediumNoncustom() {
		return this.submissionRightThumbUrlMediumNoncustom;
	}
	
	public void setSubmissionRightThumbUrlMediumNoncustom( String submissionRightThumbUrlMediumNoncustom ) {
		this.submissionRightThumbUrlMediumNoncustom = submissionRightThumbUrlMediumNoncustom;
	}
	
	public String getSubmissionRightThumbUrlLargeNoncustom() {
		return this.submissionRightThumbUrlLargeNoncustom;
	}
	
	public void setSubmissionRightThumbUrlLargeNoncustom( String submissionRightThumbUrlLargeNoncustom ) {
		this.submissionRightThumbUrlLargeNoncustom = submissionRightThumbUrlLargeNoncustom;
	}
	
	public Integer getSubmissionLeftThumbSmallX() {
		return this.submissionLeftThumbSmallX;
	}
	
	public void setSubmissionLeftThumbSmallX( Integer submissionLeftThumbSmallX ) {
		this.submissionLeftThumbSmallX = submissionLeftThumbSmallX;
	}
	
	public Integer getSubmissionLeftThumbMediumX() {
		return this.submissionLeftThumbMediumX;
	}
	
	public void setSubmissionLeftThumbMediumX( Integer submissionLeftThumbMediumX ) {
		this.submissionLeftThumbMediumX = submissionLeftThumbMediumX;
	}
	
	public Integer getSubmissionLeftThumbLargeX() {
		return this.submissionLeftThumbLargeX;
	}
	
	public void setSubmissionLeftThumbLargeX( Integer submissionLeftThumbLargeX ) {
		this.submissionLeftThumbLargeX = submissionLeftThumbLargeX;
	}
	
	public Integer getSubmissionRightThumbSmallX() {
		return this.submissionRightThumbSmallX;
	}
	
	public void setSubmissionRightThumbSmallX( Integer submissionRightThumbSmallX ) {
		this.submissionRightThumbSmallX = submissionRightThumbSmallX;
	}
	
	public Integer getSubmissionRightThumbMediumX() {
		return this.submissionRightThumbMediumX;
	}
	
	public void setSubmissionRightThumbMediumX( Integer submissionRightThumbMediumX ) {
		this.submissionRightThumbMediumX = submissionRightThumbMediumX;
	}
	
	public Integer getSubmissionRightThumbLargeX() {
		return this.submissionRightThumbLargeX;
	}
	
	public void setSubmissionRightThumbLargeX( Integer submissionRightThumbLargeX ) {
		this.submissionRightThumbLargeX = submissionRightThumbLargeX;
	}
	
	public Integer getSubmissionLeftThumbSmallY() {
		return this.submissionLeftThumbSmallY;
	}
	
	public void setSubmissionLeftThumbSmallY( Integer submissionLeftThumbSmallY ) {
		this.submissionLeftThumbSmallY = submissionLeftThumbSmallY;
	}
	
	public Integer getSubmissionLeftThumbMediumY() {
		return this.submissionLeftThumbMediumY;
	}
	
	public void setSubmissionLeftThumbMediumY( Integer submissionLeftThumbMediumY ) {
		this.submissionLeftThumbMediumY = submissionLeftThumbMediumY;
	}
	
	public Integer getSubmissionLeftThumbLargeY() {
		return this.submissionLeftThumbLargeY;
	}
	
	public void setSubmissionLeftThumbLargeY( Integer submissionLeftThumbLargeY ) {
		this.submissionLeftThumbLargeY = submissionLeftThumbLargeY;
	}
	
	public Integer getSubmissionRightThumbSmallY() {
		return this.submissionRightThumbSmallY;
	}
	
	public void setSubmissionRightThumbSmallY( Integer submissionRightThumbSmallY ) {
		this.submissionRightThumbSmallY = submissionRightThumbSmallY;
	}
	
	public Integer getSubmissionRightThumbMediumY() {
		return this.submissionRightThumbMediumY;
	}
	
	public void setSubmissionRightThumbMediumY( Integer submissionRightThumbMediumY ) {
		this.submissionRightThumbMediumY = submissionRightThumbMediumY;
	}
	
	public Integer getSubmissionRightThumbLargeY() {
		return this.submissionRightThumbLargeY;
	}
	
	public void setSubmissionRightThumbLargeY( Integer submissionRightThumbLargeY ) {
		this.submissionRightThumbLargeY = submissionRightThumbLargeY;
	}
	
	public Integer getSubmissionLeftThumbSmallNoncustomX() {
		return this.submissionLeftThumbSmallNoncustomX;
	}
	
	public void setSubmissionLeftThumbSmallNoncustomX( Integer submissionLeftThumbSmallNoncustomX ) {
		this.submissionLeftThumbSmallNoncustomX = submissionLeftThumbSmallNoncustomX;
	}
	
	public Integer getSubmissionLeftThumbMediumNoncustomX() {
		return this.submissionLeftThumbMediumNoncustomX;
	}
	
	public void setSubmissionLeftThumbMediumNoncustomX( Integer submissionLeftThumbMediumNoncustomX ) {
		this.submissionLeftThumbMediumNoncustomX = submissionLeftThumbMediumNoncustomX;
	}
	
	public Integer getSubmissionLeftThumbLargeNoncustomX() {
		return this.submissionLeftThumbLargeNoncustomX;
	}
	
	public void setSubmissionLeftThumbLargeNoncustomX( Integer submissionLeftThumbLargeNoncustomX ) {
		this.submissionLeftThumbLargeNoncustomX = submissionLeftThumbLargeNoncustomX;
	}
	
	public Integer getSubmissionRightThumbSmallNoncustomX() {
		return this.submissionRightThumbSmallNoncustomX;
	}
	
	public void setSubmissionRightThumbSmallNoncustomX( Integer submissionRightThumbSmallNoncustomX ) {
		this.submissionRightThumbSmallNoncustomX = submissionRightThumbSmallNoncustomX;
	}
	
	public Integer getSubmissionRightThumbMediumNoncustomX() {
		return this.submissionRightThumbMediumNoncustomX;
	}
	
	public void setSubmissionRightThumbMediumNoncustomX( Integer submissionRightThumbMediumNoncustomX ) {
		this.submissionRightThumbMediumNoncustomX = submissionRightThumbMediumNoncustomX;
	}
	
	public Integer getSubmissionRightThumbLargeNoncustomX() {
		return this.submissionRightThumbLargeNoncustomX;
	}
	
	public void setSubmissionRightThumbLargeNoncustomX( Integer submissionRightThumbLargeNoncustomX ) {
		this.submissionRightThumbLargeNoncustomX = submissionRightThumbLargeNoncustomX;
	}
	
	public Integer getSubmissionLeftThumbSmallNoncustomY() {
		return this.submissionLeftThumbSmallNoncustomY;
	}
	
	public void setSubmissionLeftThumbSmallNoncustomY( Integer submissionLeftThumbSmallNoncustomY ) {
		this.submissionLeftThumbSmallNoncustomY = submissionLeftThumbSmallNoncustomY;
	}
	
	public Integer getSubmissionLeftThumbMediumNoncustomY() {
		return this.submissionLeftThumbMediumNoncustomY;
	}
	
	public void setSubmissionLeftThumbMediumNoncustomY( Integer submissionLeftThumbMediumNoncustomY ) {
		this.submissionLeftThumbMediumNoncustomY = submissionLeftThumbMediumNoncustomY;
	}
	
	public Integer getSubmissionLeftThumbLargeNoncustomY() {
		return this.submissionLeftThumbLargeNoncustomY;
	}
	
	public void setSubmissionLeftThumbLargeNoncustomY( Integer submissionLeftThumbLargeNoncustomY ) {
		this.submissionLeftThumbLargeNoncustomY = submissionLeftThumbLargeNoncustomY;
	}
	
	public Integer getSubmissionRightThumbSmallNoncustomY() {
		return this.submissionRightThumbSmallNoncustomY;
	}
	
	public void setSubmissionRightThumbSmallNoncustomY( Integer submissionRightThumbSmallNoncustomY ) {
		this.submissionRightThumbSmallNoncustomY = submissionRightThumbSmallNoncustomY;
	}
	
	public Integer getSubmissionRightThumbMediumNoncustomY() {
		return this.submissionRightThumbMediumNoncustomY;
	}
	
	public void setSubmissionRightThumbMediumNoncustomY( Integer submissionRightThumbMediumNoncustomY ) {
		this.submissionRightThumbMediumNoncustomY = submissionRightThumbMediumNoncustomY;
	}
	
	public Integer getSubmissionRightThumbLargeNoncustomY() {
		return this.submissionRightThumbLargeNoncustomY;
	}
	
	public void setSubmissionRightThumbLargeNoncustomY( Integer submissionRightThumbLargeNoncustomY ) {
		this.submissionRightThumbLargeNoncustomY = submissionRightThumbLargeNoncustomY;
	}

}