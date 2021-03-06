package songs;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int track2;
	private int year;
	
	public Song() {
	}
	
	public Song( String title, String artist ) {
		this( title, artist, "", "", 0, 0);
	}
	
	public Song( String title, String artist, String album, String composer, int year, int track) {
       this.title = title;
       this.artist = artist;
       this.album = album;
       this.composer = composer;
       this.track2 = track;
       this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public int getTrack() {
		return track2;
	}
	
	public void setTrack(int track) {
		this.track2 = track;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void show(){
		System.out.println( 
			artist + 
			" " + title +
			"(" + album +
			"," + year + 
			"," + track2 + "번 track" +
			"," + composer + "작곡)"
		);
	}
}






