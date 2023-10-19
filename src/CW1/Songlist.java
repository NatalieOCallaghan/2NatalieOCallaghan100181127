package CW1;
// Imports arrayList (used for creating the songlist)
import java.util.ArrayList;

public class Songlist {
    Song song;
   // Will be an arraylist of Songs.
   private ArrayList<Song> songlist;
   
   public Songlist() {
    songlist = new ArrayList<Song>();
   }
   
   // Add a new song to the songlist, 
   public void addSongToSonglist(Song song){
    songlist.add(song);
   }

   // Remove a song from the songlist, 
    public void removeSongFromSonglist(String songNameToRemove, String artistNameToRemove){
        // Line for spacing purposes
        System.out.println();
        // For loop that accounts for the size of the current songlist length and runs it that many times
        for (int i = 0; i < songlist.size(); i++) {
            // Gets the song data for the current element in the arraylist
            Song song = songlist.get(i);
            // Takes the values that the user has given and compares them to the values within the currently indexed song instance. If the user-input names are equal with the currently indexed song (ignoring case)
            if (song.getArtistName().equalsIgnoreCase(artistNameToRemove) && song.getSongName().equalsIgnoreCase(songNameToRemove)) {
                // If the currently indexed song matches, then it removes the song from the songlist
                songlist.remove(song);
                // Prints out a confirmation to the user
                System.out.println(songNameToRemove + " by " + artistNameToRemove + " removed from the songlist.");
                return;
            }
        }
        // If the song isn't found in the songlist, it outputs this information to the user
        System.out.println("Song not found.");
    }

   // Print the songlist
    public void printSonglist(){
        // Line for spacing purposes
        System.out.println();
        // For loop that accounts for the size of the current songlist length and runs it that many times
        for (int i = 0; i < songlist.size(); i++) {
            // Gets the song data for the current element in the arraylist
            Song song = songlist.get(i);
            // Prints out the song name, artist name, playcount and length for the currently indexed song
            System.out.println(song.getSongName() + ", " + song.getArtistName() + ", " + song.getPlayCount() + ", " + song.getSongLength());
        }
    }

   // Print songs that have over a given number of plays 
    public void songsOverGivenPlayCount(int playCountFilter){
        System.out.println();
        // For loop that accounts for the size of the current songlist length and runs it that many times
        for (int i = 0; i < songlist.size(); i++) {
            // Gets the song data for the current element in the arraylist
            Song song = songlist.get(i);
            if (song.getPlayCount() > playCountFilter) {   
            // Prints out the song name, artist name and playcount if the currently indexed song has over the given number of plays.
                System.out.println(song.getSongName() + ", " + song.getArtistName() + ", " + song.getPlayCount() + song.getSongLength());    
            }
        }
    }

    // Calculates the length of the songlist
    public int songlistLength(){
        // Defaults the length of the songlist to 0 
        int songlistLength = 0;
        // For loop that accounts for the size of the current songlist length and runs it that many times
        for (int i = 0; i < songlist.size(); i++) {
            // Gets the song data for the current element in the arraylist
            Song song = songlist.get(i);
            // Adds the length of the currently indexed song to the total length of the songlist
            songlistLength = songlistLength + song.getSongLength();
        }
        return songlistLength;
    }
}

