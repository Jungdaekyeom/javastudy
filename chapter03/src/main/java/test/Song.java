package test;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public Song() {
		this("A", "B", "C", "D", 8, 9);
	}
	

	public Song(String artist, String title) {
		this(title, artist, "ㅁㄴㅇㄹ", "1111", 2009, 777);
		
	}

	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.print(title);
		System.out.print(artist);
		System.out.print(album);
		System.out.print(composer);
		System.out.print(year);
		System.out.println(track);
	}

}
