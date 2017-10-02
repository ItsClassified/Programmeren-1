package cdkast;

public class CD {
	// Variables
	Song[] songs;
	String title;
	
	// Constructor to create our CD with Title and amount of songs on it
	public CD(String title, int songs) {
		// Create a songs according to the given variable
		this.songs = new Song[songs];
		// set title of the CD according to given title
		this.title = title;
	}
	
	// Function to add a Song to our CD (Objectgeorienteerd)
	public void addSong(Song song) { // Song song is given song -> Example: cd.addSong(Song1);
		// Loop trough each of the spots on our CD to check if its empty
		for (int i = 0; i < songs.length; i++) {
			// If a spot is empty -> place the givin song in that spot
			if (songs[i] == null) {
				// Place the song in the spot that is empty
				songs[i] = song;
				// Return so it stops the for loop and only places it in the first empty spot.
				return;
			}
		}
		// If the loop gets completed, this means there are 0 spots because return is not called
		System.out.println("There are already 10 songs on the disc!");
	}
	
	// function to set Title of the CD
	public void setTitle(String title) {
		this.title = title;
	}
	
	// Returns title of the CD
	public String getTitle() {
		return title;
	}
	
	// Returns total length of all the sogns combined on the CD
	public int getLength() {
		// Create a variable to count all the song lengths
		int totalLength = 0;
		// Loop trough each spot to som the lengths
		for (int i = 0; i < songs.length; i++) {
			// if there is a song in the spot
			if (songs[i] != null) {
				// Add song length to totalLenght
				totalLength += songs[i].getLength();
			}
		}
		// Return totalLength
		return totalLength;
	}
	
	// Function to print Info of the CD (Songs and name and total length)
	public void printInfo() {
		// Variable to keep track of what song we are on (in case we got empty spots in between songs)
		int number = 1;
		// Normal info about CD
		System.out.println("*** CD Information ***");
		System.out.println("CD: " + title + ", Total Length: " + getLength() + " sec.");
		// Loop trough all the songs to print info for each of m'
		for (int i = 0; i < songs.length; i++) {
			// if the spot is not empty
			if (songs[i] != null) {
				// Print the info of the song
				System.out.println("Track " + number + ": " + songs[i].getTitle() + ", " + songs[i].getArtist() + ", " + songs[i].getLength() + " sec.");
				number++; // Add 1 to the number for the next time we print a song
			}
		}
		System.out.println(""); // Blank line to make it look better
	}
	
	// Function to print info of the longest track on the CD
	public void printLongestTrack() {
		// Create a Song longest and make it null
		Song longest = null;
		// To keep track of the number we are on
		int number = 0;
		
		// Check for the first song on the CD with a loop
		for (int i = 0; i < songs.length; i++) {
			// If the spot is not empty
			if (songs[i] != null) {
				// Save current song in the longest variable we made earlier
				longest = songs[i];
				// End the for loop by jumping to the last loop ;)
				i = songs.length;
			}
		}
		
		// If there are 0 songs on the CD the variable wil still be null (Song longest = null)
		// So if not ->
		if (longest != null) {
			// Loop trough all the spots on the CD
			for (int i = 0; i < songs.length; i++) {
				// If the spot is not empty
				if(songs[i] != null) {
					// If this spot is bigger as the current longest one
					if(longest.getLength() < songs[i].getLength()) {
						// Safe the current song as longest
						longest = songs[i];
						number = i + 1; // add 1 to the number in the array
					}
				}
			}
			// Print longest.info :)
			System.out.println("*** Longest Track on CD: " + longest.getTitle() + " ***");
			System.out.println("Track " + number + ": " + longest.getTitle() + ", " + longest.getArtist() + ", " + longest.getLength() + " sec.");
		} else {
			System.out.println("There are no tracks on this disc");
		}
		System.out.println("");
	}
}
