package net.inkbunny.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Entity bean for JSON bindings
 */
public class File {

	/*
	 * Bean properties
	 */

	@JsonProperty("file_id")
	private Integer id;
	
	@JsonProperty("file_name")
	private String name;
	
	@JsonProperty("thumbnail_url_small")
	private String thumbUrlSmall;
	
	@JsonProperty("thumbnail_url_medium")
	private String thumbUrlMedium;
	
	@JsonProperty("thumbnail_url_large")
	private String thumbUrlLarge;
	
	@JsonProperty("thumbnail_url_small_noncustom")
	private String thumbUrlSmallNoncustom;
	
	@JsonProperty("thumbnail_url_medium_noncustom")
	private String thumbUrlMediumNoncustom;
	
	@JsonProperty("thumbnail_url_large_noncustom")
	private String thumbUrlLargeNoncustom;
	
	@JsonProperty("file_url_full")
	private String fileUrlFull;
	
	@JsonProperty("file_url_screen")
	private String fileUrlScreen;
	
	@JsonProperty("file_url_preview")
	private String fileUrlPreview;
	
	@JsonProperty("mimetype")
	private String mimeType;
	
	@JsonProperty("submission_id")
	private Integer submissionId;
	
	@JsonProperty("user_id")
	private Integer userId;
	
	@JsonProperty("submission_file_order")
	private Integer submissionFileOrder;
	
	@JsonProperty("full_size_x")
	private Integer fullSizeX;
	
	@JsonProperty("screen_size_x")
	private Integer screenSizeX;
	
	@JsonProperty("preview_size_x")
	private Integer previewSizeX;
	
	@JsonProperty("full_size_y")
	private Integer fullSizeY;
	
	@JsonProperty("screen_size_y")
	private Integer screenSizeY;
	
	@JsonProperty("preview_size_y")
	private Integer previewSizeY;
	
	@JsonProperty("thumb_large_x")
	private Integer thumbLargeX;
	
	@JsonProperty("thumb_medium_x")
	private Integer thumbMediumX;
	
	@JsonProperty("thumb_small_x")
	private Integer thumbSmallX;
	
	@JsonProperty("thumb_large_y")
	private Integer thumbLargeY;
	
	@JsonProperty("thumb_medium_y")
	private Integer thumbMediumY;
	
	@JsonProperty("thumb_small_y")
	private Integer thumbSmallY;
	
	@JsonProperty("thumb_large_noncustom_x")
	private Integer thumbLargeNoncustomX;
	
	@JsonProperty("thumb_medium_noncustom_x")
	private Integer thumbMediumNoncustomX;
	
	@JsonProperty("thumb_small_noncustom_x")
	private Integer thumbSmallNoncustomX;
	
	@JsonProperty("thumb_large_noncustom_y")
	private Integer thumbLargeNoncustomY;
	
	@JsonProperty("thumb_medium_noncustom_y")
	private Integer thumbMediumNoncustomY;
	
	@JsonProperty("thumb_small_noncustom_y")
	private Integer thumbSmallNoncustomY;
	
	@JsonProperty("initial_file_md5")
	private String initialFileMD5;
	
	@JsonProperty("full_file_md5")
	private String fullFileMD5;
	
	@JsonProperty("large_file_md5")
	private String largeFileMD5;
	
	@JsonProperty("small_file_md5")
	private String smallFileMD5;
	
	@JsonProperty("thumbnail_md5")
	private String thumbnailMD5;
	
	@JsonProperty("deleted")
	private String deleted;
	
	@JsonProperty("create_datetime")
	private String createDatetime;
	
	@JsonProperty("create_datetime_usertime")
	private String createDatetimeUsertime;

	/*
	 * Default constructor
	 */

	public File(){}

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
	
	public String getThumbUrlSmall() {
		return this.thumbUrlSmall;
	}
	
	public void setThumbUrlSmall( String thumbUrlSmall ) {
		this.thumbUrlSmall = thumbUrlSmall;
	}
	
	public String getThumbUrlMedium() {
		return this.thumbUrlMedium;
	}
	
	public void setThumbUrlMedium( String thumbUrlMedium ) {
		this.thumbUrlMedium = thumbUrlMedium;
	}
	
	public String getThumbUrlLarge() {
		return this.thumbUrlLarge;
	}
	
	public void setThumbUrlLarge( String thumbUrlLarge ) {
		this.thumbUrlLarge = thumbUrlLarge;
	}
	
	public String getThumbUrlSmallNoncustom() {
		return this.thumbUrlSmallNoncustom;
	}
	
	public void setThumbUrlSmallNoncustom( String thumbUrlSmallNoncustom ) {
		this.thumbUrlSmallNoncustom = thumbUrlSmallNoncustom;
	}
	
	public String getThumbUrlMediumNoncustom() {
		return this.thumbUrlMediumNoncustom;
	}
	
	public void setThumbUrlMediumNoncustom( String thumbUrlMediumNoncustom ) {
		this.thumbUrlMediumNoncustom = thumbUrlMediumNoncustom;
	}
	
	public String getThumbUrlLargeNoncustom() {
		return this.thumbUrlLargeNoncustom;
	}
	
	public void setThumbUrlLargeNoncustom( String thumbUrlLargeNoncustom ) {
		this.thumbUrlLargeNoncustom = thumbUrlLargeNoncustom;
	}

	public String getFileUrlFull() {
		return this.fileUrlFull;
	}
	
	public void setFileUrlFull( String fileUrlFull ) {
		this.fileUrlFull = fileUrlFull;
	}
	
	public String getFileUrlScreen() {
		return this.fileUrlScreen;
	}
	
	public void setFileUrlScreen( String fileUrlScreen ) {
		this.fileUrlScreen = fileUrlScreen;
	}
	
	public String getFileUrlPreview() {
		return this.fileUrlPreview;
	}
	
	public void setFileUrlPreview( String fileUrlPreview ) {
		this.fileUrlPreview = fileUrlPreview;
	}
	
	public String getMimeType() {
		return this.mimeType;
	}
	
	public void setMimeType( String mimeType ) {
		this.mimeType = mimeType;
	}
	
	public Integer getSubmissionId() {
		return this.submissionId;
	}
	
	public void setSubmissionId( Integer submissionId ) {
		this.submissionId = submissionId;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId( Integer userId ) {
		this.userId = userId;
	}
	
	public Integer getSubmissionFileOrder() {
		return this.submissionFileOrder;
	}
	
	public void setSubmissionFileOrder( Integer submissionFileOrder ) {
		this.submissionFileOrder = submissionFileOrder;
	}
	
	public Integer getFullSizeX() {
		return this.fullSizeX;
	}
	
	public void setFullSizeX( Integer fullSizeX ) {
		this.fullSizeX = fullSizeX;
	}
	
	public Integer getScreenSizeX() {
		return this.screenSizeX;
	}
	
	public void setScreenSizeX( Integer screenSizeX ) {
		this.screenSizeX = screenSizeX;
	}
	
	public Integer getPreviewSizeX() {
		return this.previewSizeX;
	}
	
	public void setPreviewSizeX( Integer previewSizeX ) {
		this.previewSizeX = previewSizeX;
	}
	
	public Integer getFullSizeY() {
		return this.fullSizeY;
	}
	
	public void setFullSizeY( Integer fullSizeY ) {
		this.fullSizeY = fullSizeY;
	}
	
	public Integer getScreenSizeY() {
		return this.screenSizeY;
	}
	
	public void setScreenSizeY( Integer screenSizeY ) {
		this.screenSizeY = screenSizeY;
	}
	
	public Integer getPreviewSizeY() {
		return this.previewSizeY;
	}
	
	public void setPreviewSizeY( Integer previewSizeY ) {
		this.previewSizeY = previewSizeY;
	}

	public Integer getThumbLargeX() {
		return this.thumbLargeX;
	}
	
	public void setThumbLargeX( Integer thumbLargeX ) {
		this.thumbLargeX = thumbLargeX;
	}
	
	public Integer getThumbMediumX() {
		return this.thumbMediumX;
	}
	
	public void setThumbMediumX( Integer thumbMediumX ) {
		this.thumbMediumX = thumbMediumX;
	}
	
	public Integer getThumbSmallX() {
		return this.thumbSmallX;
	}
	
	public void setThumbSmallX( Integer thumbSmallX ) {
		this.thumbSmallX = thumbSmallX;
	}

	public Integer getThumbLargeY() {
		return this.thumbLargeY;
	}
	
	public void setThumbLargeY( Integer thumbLargeY ) {
		this.thumbLargeY = thumbLargeY;
	}
	
	public Integer getThumbMediumY() {
		return this.thumbMediumY;
	}
	
	public void setThumbMediumY( Integer thumbMediumY ) {
		this.thumbMediumY = thumbMediumY;
	}
	
	public Integer getThumbSmallY() {
		return this.thumbSmallY;
	}
	
	public void setThumbSmallY( Integer thumbSmallY ) {
		this.thumbSmallY = thumbSmallY;
	}

	public Integer getThumbLargeNoncustomX() {
		return this.thumbLargeNoncustomX;
	}
	
	public void setThumbLargeNoncustomX( Integer thumbLargeNoncustomX ) {
		this.thumbLargeNoncustomX = thumbLargeNoncustomX;
	}
	
	public Integer getThumbMediumNoncustomX() {
		return this.thumbMediumNoncustomX;
	}
	
	public void setThumbMediumNoncustomX( Integer thumbMediumNoncustomX ) {
		this.thumbMediumNoncustomX = thumbMediumNoncustomX;
	}
	
	public Integer getThumbSmallNoncustomX() {
		return this.thumbSmallNoncustomX;
	}
	
	public void setThumbSmallNoncustomX( Integer thumbSmallNoncustomX ) {
		this.thumbSmallNoncustomX = thumbSmallNoncustomX;
	}

	public Integer getThumbLargeNoncustomY() {
		return this.thumbLargeNoncustomY;
	}
	
	public void setThumbLargeNoncustomY( Integer thumbLargeNoncustomY ) {
		this.thumbLargeNoncustomY = thumbLargeNoncustomY;
	}
	
	public Integer getThumbMediumNoncustomY() {
		return this.thumbMediumNoncustomY;
	}
	
	public void setThumbMediumNoncustomY( Integer thumbMediumNoncustomY ) {
		this.thumbMediumNoncustomY = thumbMediumNoncustomY;
	}
	
	public Integer getThumbSmallNoncustomY() {
		return this.thumbSmallNoncustomY;
	}
	
	public void setThumbSmallNoncustomY( Integer thumbSmallNoncustomY ) {
		this.thumbSmallNoncustomY = thumbSmallNoncustomY;
	}

	public String getInitialFileMD5() {
		return this.initialFileMD5;
	}
	
	public void setInitialFileMD5( String initialFileMD5 ) {
		this.initialFileMD5 = initialFileMD5;
	}

	public String getFullFileMD5() {
		return this.fullFileMD5;
	}
	
	public void setFullFileMD5( String fullFileMD5 ) {
		this.fullFileMD5 = fullFileMD5;
	}

	public String getLargeFileMD5() {
		return this.largeFileMD5;
	}
	
	public void setLargeFileMD5( String largeFileMD5 ) {
		this.largeFileMD5 = largeFileMD5;
	}
	
	public String getSmallFileMD5() {
		return this.smallFileMD5;
	}
	
	public void setSmallFileMD5( String smallFileMD5 ) {
		this.smallFileMD5 = smallFileMD5;
	}

	public String getThumbnailMD5() {
		return this.thumbnailMD5;
	}
	
	public void setThumbnailMD5( String thumbnailMD5 ) {
		this.thumbnailMD5 = thumbnailMD5;
	}

	public String getDeleted() {
		return this.deleted;
	}
	
	public void setDeleted( String deleted ) {
		this.deleted = deleted;
	}

	public String getCreateDatetime() {
		return this.createDatetime;
	}
	
	public void setCreateDatetime( String createDatetime ) {
		this.createDatetime = createDatetime;
	}

	public String getCreateDatetimeUsertime() {
		return this.createDatetimeUsertime;
	}
	
	public void setCreateDatetimeUsertime( String createDatetimeUsertime ) {
		this.createDatetimeUsertime = createDatetimeUsertime;
	}

}