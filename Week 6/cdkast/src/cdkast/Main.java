package cdkast;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD queen = new CD("Queen", 10);
		
		Song song1 = new Song(10, "Artist1", "Song1");
		Song song2 = new Song(40, "Artist2", "Song2");
		Song song3 = new Song(10, "Artist3", "Song3");
		Song song4 = new Song(20, "Artist4", "Song4");
		queen.addSong(song1);
		queen.addSong(song2);
		queen.addSong(song3);
		queen.addSong(song4);
		
		queen.printLongestTrack();
		queen.printInfo();
	}

}
