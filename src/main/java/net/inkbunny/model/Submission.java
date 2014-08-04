package net.inkbunny.model;

import net.inkbunny.model.File;
import net.inkbunny.model.Pool;
import net.inkbunny.model.Rating;
import net.inkbunny.model.Print;
import net.inkbunny.model.Keyword;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Entity bean for JSON bindings
 */
public class Submission {

	public enum SubmissionType {

		PICTURE_OR_PINUP( 1, "Picture/Pinup" ),
		SKETCH( 2, "Sketch" ),
		PICTURE_SERIES( 3, "Picture Series" ),
		COMIC( 4, "Comic" ),
		PORTFOLIO( 5, "Portfolio" ),
		SHOCKWAVE_OR_FLASH_ANIMATION( 6, "Shockwave/Flash - Animation" ),
		SHOCKWAVE_OR_FLASH_INTERACTIVE( 7, "Shockwave/Flash - Interactive" ),
		VIDEO_FEATURE_LENGTH( 8, "Video - Feature Length" ),
		VIDEO_ANIMATION_3D_CGI( 9, "Video - Animation/3D/CGI" ),
		MUSIC_SINGLE_TRACK( 10, "Music - Single Track" ),
		MUSIC_ALBUM( 11, "Music - Album" ),
		WRITING_DOCUMENT( 12, "Writing - Document" ),
		CHARACTER_SHEET( 13, "Character Sheet" ),
		PHOTOGRAPHY( 14, "Photography - Fursuit/Sculpture/Jewelry/etc" );
 
		private Integer code;
		private String desc;
 
		private SubmissionType(Integer code, String desc) {
			this.code = code;
			this.desc = desc;
		}
 
		public int getCode() {
			return this.code;
		}
		
		public String getDescr() {
			return this.desc;
		}
		
	}

	/*
	 * Bean properties
	 */

	@JsonProperty("submission_id")
	private Integer submissionId;

	@JsonProperty("hidden")
	private String hidden;

	@JsonProperty("username")
	private String username;

	@JsonProperty("user_id")
	private Integer userId;

	@JsonProperty("create_datetime")
	private String createDatetime;

	@JsonProperty("create_datetime_usertime")
	private String createDatetimeUsertime;

	@JsonProperty("last_file_update_datetime")
	private String lastFileUpdateDatetime;

	@JsonProperty("last_file_update_datetime_usertime")
	private String lastFileUpdateDatetimeUsertime;

	@JsonProperty("unread_datetime")
	private String unreadDatetime;

	@JsonProperty("unread_datetime_usertime")
	private String unreadDatetimeUsertime;

	@JsonProperty("updated")
	private String updated;

	@JsonProperty("stars")
	private Integer stars;

	@JsonProperty("file_name")
	private String fileName;

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
	
	@JsonProperty("latest_file_name")
	private String latestFileName;

	@JsonProperty("latest_thumbnail_url_small")
	private String latestThumbUrlSmall;
	
	@JsonProperty("latest_thumbnail_url_medium")
	private String latestThumbUrlMedium;
	
	@JsonProperty("latest_thumbnail_url_large")
	private String latestThumbUrlLarge;
	
	@JsonProperty("latest_thumbnail_url_small_noncustom")
	private String latestThumbUrlSmallNoncustom;
	
	@JsonProperty("latest_thumbnail_url_medium_noncustom")
	private String latestThumbUrlMediumNoncustom;
	
	@JsonProperty("latest_thumbnail_url_large_noncustom")
	private String latestThumbUrlLargeNoncustom;
	
	@JsonProperty("latest_thumb_large_x")
	private Integer latestThumbLargeX;
	
	@JsonProperty("latest_thumb_large_y")
	private Integer latestThumbLargeY;
	
	@JsonProperty("latest_thumb_medium_x")
	private Integer latestThumbMediumX;
	
	@JsonProperty("latest_thumb_medium_y")
	private Integer latestThumbMediumY;
	
	@JsonProperty("latest_thumb_small_x")
	private Integer latestThumbSmallX;
	
	@JsonProperty("latest_thumb_small_y")
	private Integer latestThumbSmallY;
	
	@JsonProperty("latest_thumb_large_noncustom_x")
	private Integer latestThumbLargeNoncustomX;
	
	@JsonProperty("latest_thumb_large_noncustom_y")
	private Integer latestThumbLargeNoncustomY;
	
	@JsonProperty("latest_thumb_medium_noncustom_x")
	private Integer latestThumbMediumNoncustomX;
	
	@JsonProperty("latest_thumb_medium_noncustom_y")
	private Integer latestThumbMediumNoncustomY;
	
	@JsonProperty("latest_thumb_small_noncustom_x")
	private Integer latestThumbSmallNoncustomX;
	
	@JsonProperty("latest_thumb_small_noncustom_y")
	private Integer latestThumbSmallNoncustomY;
	
	@JsonProperty("title")
	private String title;

	@JsonProperty("deleted")
	private String deleted;

	@JsonProperty("public")
	private String pub;

	@JsonProperty("mimetype")
	private String mimeType;

	@JsonProperty("pagecount")
	private Integer pageCount;

	@JsonProperty("latest_mimetype")
	private String latestMimeType;

	@JsonProperty("rating_id")
	private Integer ratingId;
	
	@JsonProperty("rating_name")
	private String ratingName;

	@JsonProperty("thumb_small_x")
	private Integer thumbSmallX;

	@JsonProperty("thumb_small_y")
	private Integer thumbSmallY;

	@JsonProperty("thumb_medium_x")
	private Integer thumbMediumX;

	@JsonProperty("thumb_medium_y")
	private Integer thumbMediumY;

	@JsonProperty("thumb_large_x")
	private Integer thumbLargeX;

	@JsonProperty("thumb_large_y")
	private Integer thumbLargeY;

	@JsonProperty("thumb_small_noncustom_x")
	private Integer thumbSmallNoncustomX;

	@JsonProperty("thumb_small_noncustom_y")
	private Integer thumbSmallNoncustomY;

	@JsonProperty("thumb_medium_noncustom_x")
	private Integer thumbMediumNoncustomX;

	@JsonProperty("thumb_medium_noncustom_y")
	private Integer thumbMediumNoncustomY;

	@JsonProperty("thumb_large_noncustom_x")
	private Integer thumbLargeNoncustomX;

	@JsonProperty("thumb_large_noncustom_y")
	private Integer thumbLargeNoncustomY;

	@JsonProperty("submission_type_id")
	private Integer submissionTypeId;

	@JsonProperty("type_name")
	private String submissionTypeName;

	@JsonProperty("digitalsales")
	private String digitalSales;

	@JsonProperty("printsales")
	private String printSales;

	@JsonProperty("guest_block")
	private String guestBlock;

	@JsonProperty("scraps")
	private String scraps;
	
	@JsonProperty("favorite")
	private String favorite;
	
	@JsonProperty("favorites_count")
	private Integer favCount;
	
	@JsonProperty("user_icon_file_name")
	private String userIconFileName;
	
	@JsonProperty("user_icon_url_small")
	private String userIconUrlSmall;
	
	@JsonProperty("user_icon_url_medium")
	private String userIconUrlMedium;
	
	@JsonProperty("user_icon_url_large")
	private String userIconUrlLarge;
	
	@JsonProperty("file_url_full")
	private String fileUrlFull;
	
	@JsonProperty("file_url_screen")
	private String fileUrlScreen;
	
	@JsonProperty("file_url_preview")
	private String fileUrlPreview;
	
	@JsonProperty("latest_file_url_full")
	private String latestFileUrlFull;
	
	@JsonProperty("latest_file_url_screen")
	private String latestFileUrlScreen;
	
	@JsonProperty("latest_file_url_preview")
	private String latestFileUrlPreview;
	
	@JsonProperty("files")
	private List<File> files;
	
	@JsonProperty("pools")
	private List<Pool> pools;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("description_bbcode_parsed")
	private String descriptionParsedBBCode;
	
	@JsonProperty("writing")
	private String writing;
	
	@JsonProperty("writing_bbcode_parsed")
	private String writingParsedBBCode;
	
	@JsonProperty("pools_count")
	private Integer poolsCount;
	
	@JsonProperty("ratings")
	private List<Rating> ratings;
	
	@JsonProperty("friends_only")
	private String friendsOnly;
	
	@JsonProperty("comments_count")
	private Integer commentsCount;
	
	@JsonProperty("sales_description")
	private String salesDescription;
	
	@JsonProperty("forsale")
	private String forSale;
	
	@JsonProperty("digital_price")
	private Float digitalPrice;
	
	@JsonProperty("prints")
	private List<Print> prints;
	
	@JsonProperty("keywords")
	private List<Keyword> keywords;

	/*
	 * Default constructor
	 */

	public Submission(){}

	/*
	 * Getters and Setters
	 */

	public Integer getSubmissionId() {
		return this.submissionId;
	}

	public void setSubmissionId( Integer submissionId ) {
		this.submissionId = submissionId;
	}
	
	public String getHidden() {
		return this.hidden;
	}

	public void setHidden( String hidden ) {
		this.hidden = hidden;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername( String username ) {
		this.username = username;
	}

	public Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId( Integer userId ) {
		this.userId = userId;
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

	public String getLastFileUpdateDatetime() {
		return this.lastFileUpdateDatetime;
	}

	public void setLastFileUpdateDatetime( String lastFileUpdateDatetime ) {
		this.lastFileUpdateDatetime = lastFileUpdateDatetime;
	}

	public String getLastFileUpdateDatetimeUsertime() {
		return this.lastFileUpdateDatetimeUsertime;
	}

	public void setLastFileUpdateDatetimeUsertime( String lastFileUpdateDatetimeUsertime ) {
		this.lastFileUpdateDatetimeUsertime = lastFileUpdateDatetimeUsertime;
	}

	public String getUnreadDatetime() {
		return this.unreadDatetime;
	}

	public void setUnreadDatetime( String unreadDatetime ) {
		this.unreadDatetime = unreadDatetime;
	}

	public String getUnreadDatetimeUsertime() {
		return this.unreadDatetimeUsertime;
	}

	public void setUnreadDatetimeUsertime( String unreadDatetimeUsertime ) {
		this.unreadDatetimeUsertime = unreadDatetimeUsertime;
	}

	public String getUpdated() {
		return this.updated;
	}

	public void setUpdated( String updated ) {
		this.updated = updated;
	}

	public Integer getStars() {
		return this.stars;
	}

	public void setStars( Integer stars ) {
		this.stars = stars;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName( String fileName ) {
		this.fileName = fileName;
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
	
	public String getLatestFileName() {
		return this.latestFileName;
	}

	public void setLatestFileName( String latestFileName ) {
		this.latestFileName = latestFileName;
	}
	
	public String getLatestThumbUrlSmall() {
		return this.latestThumbUrlSmall;
	}

	public void setLatestThumbUrlSmall( String latestThumbUrlSmall ) {
		this.latestThumbUrlSmall = latestThumbUrlSmall;
	}
	
	public String getLatestThumbUrlMedium() {
		return this.latestThumbUrlMedium;
	}

	public void setLatestThumbUrlMedium( String latestThumbUrlMedium ) {
		this.latestThumbUrlMedium = latestThumbUrlMedium;
	}
	
	public String getLatestThumbUrlLarge() {
		return this.latestThumbUrlLarge;
	}

	public void setLatestThumbUrlLarge( String latestThumbUrlLarge ) {
		this.latestThumbUrlLarge = latestThumbUrlLarge;
	}
	
	public String getLatestThumbUrlSmallNoncustom() {
		return this.latestThumbUrlSmallNoncustom;
	}

	public void setLatestThumbUrlSmallNoncustom( String latestThumbUrlSmallNoncustom ) {
		this.latestThumbUrlSmallNoncustom = latestThumbUrlSmallNoncustom;
	}
	
	public String getLatestThumbUrlMediumNoncustom() {
		return this.latestThumbUrlMediumNoncustom;
	}

	public void setLatestThumbUrlMediumNoncustom( String latestThumbUrlMediumNoncustom ) {
		this.latestThumbUrlMediumNoncustom = latestThumbUrlMediumNoncustom;
	}
	
	public String getLatestThumbUrlLargeNoncustom() {
		return this.latestThumbUrlLargeNoncustom;
	}

	public void setLatestThumbUrlLargeNoncustom( String latestThumbUrlLargeNoncustom ) {
		this.latestThumbUrlLargeNoncustom = latestThumbUrlLargeNoncustom;
	}
	
	public Integer getLatestThumbLargeX() {
		return this.latestThumbLargeX;
	}

	public void setLatestThumbLargeX( Integer latestThumbLargeX ) {
		this.latestThumbLargeX = latestThumbLargeX;
	}
	
	public Integer getLatestThumbLargeY() {
		return this.latestThumbLargeY;
	}

	public void setLatestThumbLargeY( Integer latestThumbLargeY ) {
		this.latestThumbLargeY = latestThumbLargeY;
	}
	
	public Integer getLatestThumbMediumX() {
		return this.latestThumbMediumX;
	}

	public void setLatestThumbMediumX( Integer latestThumbMediumX ) {
		this.latestThumbMediumX = latestThumbMediumX;
	}
	
	public Integer getLatestThumbMediumY() {
		return this.latestThumbMediumY;
	}

	public void setLatestThumbMediumY( Integer latestThumbMediumY ) {
		this.latestThumbMediumY = latestThumbMediumY;
	}
	
	public Integer getLatestThumbSmallX() {
		return this.latestThumbSmallX;
	}

	public void setLatestThumbSmallX( Integer latestThumbSmallX ) {
		this.latestThumbSmallX = latestThumbSmallX;
	}
	
	public Integer getLatestThumbSmallY() {
		return this.latestThumbSmallY;
	}

	public void setLatestThumbSmallY( Integer latestThumbSmallY ) {
		this.latestThumbSmallY = latestThumbSmallY;
	}
	
	public Integer getLatestThumbLargeNoncustomX() {
		return this.latestThumbLargeNoncustomX;
	}

	public void setLatestThumbLargeNoncustomX( Integer latestThumbLargeNoncustomX ) {
		this.latestThumbLargeNoncustomX = latestThumbLargeNoncustomX;
	}
	
	public Integer getLatestThumbLargeNoncustomY() {
		return this.latestThumbLargeNoncustomY;
	}

	public void setLatestThumbLargeNoncustomY( Integer latestThumbLargeNoncustomY ) {
		this.latestThumbLargeNoncustomY = latestThumbLargeNoncustomY;
	}
	
	public Integer getLatestThumbMediumNoncustomX() {
		return this.latestThumbMediumNoncustomX;
	}

	public void setLatestThumbMediumNoncustomX( Integer latestThumbMediumNoncustomX ) {
		this.latestThumbMediumNoncustomX = latestThumbMediumNoncustomX;
	}
	
	public Integer getLatestThumbMediumNoncustomY() {
		return this.latestThumbMediumNoncustomY;
	}

	public void setLatestThumbMediumNoncustomY( Integer latestThumbMediumNoncustomY ) {
		this.latestThumbMediumNoncustomY = latestThumbMediumNoncustomY;
	}
	
	public Integer getLatestThumbSmallNoncustomX() {
		return this.latestThumbSmallNoncustomX;
	}

	public void setLatestThumbSmallNoncustomX( Integer latestThumbSmallNoncustomX ) {
		this.latestThumbSmallNoncustomX = latestThumbSmallNoncustomX;
	}
	
	public Integer getLatestThumbSmallNoncustomY() {
		return this.latestThumbSmallNoncustomY;
	}

	public void setLatestThumbSmallNoncustomY( Integer latestThumbSmallNoncustomY ) {
		this.latestThumbSmallNoncustomY = latestThumbSmallNoncustomY;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle( String title ) {
		this.title = title;
	}
	
	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted( String deleted ) {
		this.deleted = deleted;
	}
	
	public String getPub() {
		return this.pub;
	}

	public void setPub( String pub ) {
		this.pub = pub;
	}

	public String getMimeType() {
		return this.mimeType;
	}

	public void setMimeType( String mimeType ) {
		this.mimeType = mimeType;
	}
	
	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount( Integer pageCount ) {
		this.pageCount = pageCount;
	}
	
	public String getLatestMimeType() {
		return this.latestMimeType;
	}

	public void setLatestMimeType( String latestMimeType ) {
		this.latestMimeType = latestMimeType;
	}

	public Integer getRatingId() {
		return this.ratingId;
	}

	public void setRatingId( Integer ratingId ) {
		this.ratingId = ratingId;
	}
	
	public String getRatingName() {
		return this.ratingName;
	}

	public void setRatingName( String ratingName ) {
		this.ratingName = ratingName;
	}
	
	public Integer getThumbSmallX() {
		return this.thumbSmallX;
	}

	public void setThumbSmallX( Integer thumbSmallX ) {
		this.thumbSmallX = thumbSmallX;
	}

	public Integer getThumbSmallY() {
		return this.thumbSmallY;
	}

	public void setThumbSmallY( Integer thumbSmallY ) {
		this.thumbSmallY = thumbSmallY;
	}
	
	public Integer getThumbMediumX() {
		return this.thumbMediumX;
	}

	public void setThumbMediumX( Integer thumbMediumX ) {
		this.thumbMediumX = thumbMediumX;
	}
	
	public Integer getThumbMediumY() {
		return this.thumbMediumY;
	}

	public void setThumbMediumY( Integer thumbMediumY ) {
		this.thumbMediumY = thumbMediumY;
	}
	
	public Integer getThumbLargeX() {
		return this.thumbLargeX;
	}

	public void setThumbLargeX( Integer thumbLargeX ) {
		this.thumbLargeX = thumbLargeX;
	}
	
	public Integer getThumbLargeY() {
		return this.thumbLargeY;
	}

	public void setThumbLargeY( Integer thumbLargeY ) {
		this.thumbLargeY = thumbLargeY;
	}
	
	public Integer getThumbSmallNoncustomX() {
		return this.thumbSmallNoncustomX;
	}

	public void setThumbSmallNoncustomX( Integer thumbSmallNoncustomX ) {
		this.thumbSmallNoncustomX = thumbSmallNoncustomX;
	}

	public Integer getThumbSmallNoncustomY() {
		return this.thumbSmallNoncustomY;
	}

	public void setThumbSmallNoncustomY( Integer thumbSmallNoncustomY ) {
		this.thumbSmallNoncustomY = thumbSmallNoncustomY;
	}
	
	public Integer getThumbMediumNoncustomX() {
		return this.thumbMediumNoncustomX;
	}

	public void setThumbMediumNoncustomX( Integer thumbMediumNoncustomX ) {
		this.thumbMediumNoncustomX = thumbMediumNoncustomX;
	}
	
	public Integer getThumbMediumNoncustomY() {
		return this.thumbMediumNoncustomY;
	}

	public void setThumbMediumNoncustomY( Integer thumbMediumNoncustomY ) {
		this.thumbMediumNoncustomY = thumbMediumNoncustomY;
	}
	
	public Integer getThumbLargeNoncustomX() {
		return this.thumbLargeNoncustomX;
	}

	public void setThumbLargeNoncustomX( Integer thumbLargeNoncustomX ) {
		this.thumbLargeNoncustomX = thumbLargeNoncustomX;
	}
	
	public Integer getThumbLargeNoncustomY() {
		return this.thumbLargeNoncustomY;
	}

	public void setThumbLargeNoncustomY( Integer thumbLargeNoncustomY ) {
		this.thumbLargeNoncustomY = thumbLargeNoncustomY;
	}

	public Integer getSubmissionTypeId() {
		return this.submissionTypeId;
	}

	public void setSubmissionTypeId( Integer submissionTypeId ) {
		this.submissionTypeId = submissionTypeId;
	}
	
	public String getSubmissionTypeName() {
		return this.submissionTypeName;
	}

	public void setSubmissionTypeName( String submissionTypeName ) {
		this.submissionTypeName = submissionTypeName;
	}
	
	public String getDigitalSales() {
		return this.digitalSales;
	}

	public void setDigitalSales( String digitalSales ) {
		this.digitalSales = digitalSales;
	}
	
	public String getPrintSales() {
		return this.printSales;
	}

	public void setPrintSales( String printSales ) {
		this.printSales = printSales;
	}
	
	public String getGuestBlock() {
		return this.guestBlock;
	}

	public void setGuestBlock( String guestBlock ) {
		this.guestBlock = guestBlock;
	}
	
	public String getScraps() {
		return this.scraps;
	}

	public void setScraps( String scraps ) {
		this.scraps = scraps;
	}
	
	public String getFavorite() {
		return this.favorite;
	}

	public void setFavorite( String favorite ) {
		this.favorite = favorite;
	}
	
	public Integer getFavCount() {
		return this.favCount;
	}

	public void setFavCount( Integer favCount ) {
		this.favCount = favCount;
	}
	
	public String getUserIconFileName() {
		return this.userIconFileName;
	}

	public void setUserIconFileName( String userIconFileName ) {
		this.userIconFileName = userIconFileName;
	}
	
	public String getUserIconUrlSmall() {
		return this.userIconUrlSmall;
	}

	public void setUserIconUrlSmall( String userIconUrlSmall ) {
		this.userIconUrlSmall = userIconUrlSmall;
	}
	
	public String getUserIconUrlMedium() {
		return this.userIconUrlMedium;
	}

	public void setUserIconUrlMedium( String userIconUrlMedium ) {
		this.userIconUrlMedium = userIconUrlMedium;
	}
	
	public String getUserIconUrlLarge() {
		return this.userIconUrlLarge;
	}

	public void setUserIconUrlLarge( String userIconUrlLarge ) {
		this.userIconUrlLarge = userIconUrlLarge;
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
	
	public String getLatestFileUrlFull() {
		return this.latestFileUrlFull;
	}

	public void setLatestFileUrlFull( String latestFileUrlFull ) {
		this.latestFileUrlFull = latestFileUrlFull;
	}
	
	public String getLatestFileUrlScreen() {
		return this.latestFileUrlScreen;
	}

	public void setLatestFileUrlScreen( String latestFileUrlScreen ) {
		this.latestFileUrlScreen = latestFileUrlScreen;
	}
	
	public String getLatestFileUrlPreview() {
		return this.latestFileUrlPreview;
	}

	public void setLatestFileUrlPreview( String latestFileUrlPreview ) {
		this.latestFileUrlPreview = latestFileUrlPreview;
	}
	
	public List<File> getFiles() {
		return this.files;
	}
	
	public void setFiles( List<File> files ) {
		this.files = files;
	}
	
	public List<Pool> getPools() {
		return this.pools;
	}
	
	public void setPools( List<Pool> pools ) {
		this.pools = pools;
	}
	
	public List<Rating> getRatings() {
		return this.ratings;
	}
	
	public void setRatings( List<Rating> ratings ) {
		this.ratings = ratings;
	}
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription( String description ) {
		this.description = description;
	}
	
	public String getDescriptionParsedBBCode() {
		return this.descriptionParsedBBCode;
	}

	public void setDescriptionParsedBBCode( String descriptionParsedBBCode ) {
		this.descriptionParsedBBCode = descriptionParsedBBCode;
	}
	
	public String getWriting() {
		return this.writing;
	}

	public void setWriting( String writing ) {
		this.writing = writing;
	}
	
	public String getWritingParsedBBCode() {
		return this.writingParsedBBCode;
	}

	public void setWritingParsedBBCode( String writingParsedBBCode ) {
		this.writingParsedBBCode = writingParsedBBCode;
	}

	public Integer getPoolsCount() {
		return this.poolsCount;
	}

	public void setPoolsCount( Integer poolsCount ) {
		this.poolsCount = poolsCount;
	}

	public String getFriendsOnly() {
		return this.friendsOnly;
	}

	public void setFriendsOnly( String friendsOnly ) {
		this.friendsOnly = friendsOnly;
	}

	public Integer getCommentsCount() {
		return this.commentsCount;
	}

	public void setCommentsCount( Integer commentsCount ) {
		this.commentsCount = commentsCount;
	}

	public String getSalesDescription() {
		return this.salesDescription;
	}

	public void setSalesDescription( String salesDescription ) {
		this.salesDescription = salesDescription;
	}

	public String getForSale() {
		return this.forSale;
	}

	public void setForSale( String forSale ) {
		this.forSale = forSale;
	}

	public Float getDigitalPrice() {
		return this.digitalPrice;
	}

	public void setDigitalPrice( Float digitalPrice ) {
		this.digitalPrice = digitalPrice;
	}

	public List<Print> getPrints() {
		return this.prints;
	}

	public void setPrints( List<Print> prints ) {
		this.prints = prints;
	}
	
	public List<Keyword> getKeywords() {
		return this.keywords;
	}

	public void setKeywords( List<Keyword> keywords ) {
		this.keywords = keywords;
	}

}