/**
 * Author: Natalie O'Callaghan
 * Date: November 03, 2023
 * Description: This is a class for the songlist, holding the constructor and methods for adding a song to the songlist, removing a song from the songlist, printing the songlist, filtering the songlist and calculating the songlist length.
 */

package CW1;
// Imports arrayList (used for creating the songlist)
import java.util.ArrayList;

public class Songlist {
    // The songlist will need to make use of the song class to manipulate data within the list
    Song song;
   
    // Sets up the arraylist of Songs (called Songlist)
   private ArrayList<Song> songlist;
   public Songlist() {
    songlist = new ArrayList<Song>();
   }
   
   // Adds a new song to the songlist
   public void addSongToSonglist(Song song){
    songlist.add(song);
   }

   // Removes a song from the songlist depending upon information that the user has input
    public void removeSongFromSonglist(String songNameToRemove, String artistNameToRemove){
        // Line for spacing purposes
        System.out.println();
        // "For" loop that accounts for the size of the current songlist length and runs it that many times
        for (int i = 0; i < songlist.size(); i++) {
            // Retrieves (or gets) the song data for the current element in the arraylist
            Song song = songlist.get(i);
            // Takes the values that the user has given and compares them to the values within the currently indexed song instance
            // If the user-input names are equal with the currently indexed song (ignoring case) then it continues with the "if" statement
            if (song.getArtistName().equalsIgnoreCase(artistNameToRemove) && song.getSongName().equalsIgnoreCase(songNameToRemove)) {
                // If the currently indexed song matches, then it removes the song from the songlist
                songlist.remove(song);
                // Prints out a confirmation to the user so they are aware that the song they wanted to remove is gone from the songlist
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
        // Setting up the column titles for the table. The values %-(num)(datatype) is used for setting up spacing
        System.out.println(String.format("%-30s%-35s%-15s%-15s", "Song Name", "Artist Name", "Play Count", "Song Length (s)"));
        // "For" loop that accounts for the size of the current songlist length and runs it that many times
        for (int i = 0; i < songlist.size(); i++) {
            // Retrieves (or gets) the song data for the current element in the arraylist
            Song song = songlist.get(i);
            // Prints out the song name, artist name, playcount and length for the currently indexed song
            // Setting up how the values will be output in the table format. The values %-(num)(datatype) is used for setting up spacing
            System.out.println(String.format("%-30s%-35s%-15d%-15d", song.getSongName(), song.getArtistName(), song.getPlayCount(), song.getSongLength()));
        }
    }

   // Print songs that have over a given number of plays 
    public void songsOverGivenPlayCount(int playCountFilter){
        // Line for spacing purposes
        System.out.println();
        // Setting up the column titles for the table. The values %-(num)(datatype) is used for setting up spacing
        System.out.println(String.format("%-30s%-35s%-15s%-15s", "Song Name", "Artist Name", "Play Count", "Song Length (s)"));
        // For loop that accounts for the size of the current songlist length and runs it that many times
        for (int i = 0; i < songlist.size(); i++) {
            // Gets the song data for the current element in the arraylist
            Song song = songlist.get(i);
            if (song.getPlayCount() > playCountFilter) {   
                // Prints out the song name, artist name and playcount if the currently indexed song has over the given number of plays
                // Setting up how the values will be output in the table format. The values %-(num)(datatype) is used for setting up spacing
                System.out.println(String.format("%-30s%-35s%-15d%-15d", song.getSongName(), song.getArtistName(), song.getPlayCount(), song.getSongLength()));
            }
        }
    }

    // Calculates the length of the songlist
    public int songlistLength(){
        // Defaults the length of the songlist to 0 
        int songlistLength = 0;
        // "For" loop that accounts for the size of the current songlist length and runs it that many times
        for (int i = 0; i < songlist.size(); i++) {
            // Retrieves (or gets) the song data for the current element in the arraylist
            Song song = songlist.get(i);
            // Adds the length of the currently indexed song to the total length of the songlist
            songlistLength = songlistLength + song.getSongLength();
        }
        return songlistLength;
    }
}

