package cdkast;

public class Song {
	int length;
	String artist;
	String title;
	
	
	public Song(int length, String artist, String title) {
		this.length = length;
		this.artist= artist;
		this.title = title;
	}
	
	// set length of song
	public void setLength(int length) {
		this.length = length;
	}
	
	// set artist of song
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	// set title of song
	public void setTitle(String title) {
		this.title = title;
	}
	
	// return length of song
	public int getLength() {
		return length;
	}
	
	// return artist of song
	public String getArtist() {
		return artist;
	}
	
	// return title of song
	public String getTitle() {
		return title;
	}
}
