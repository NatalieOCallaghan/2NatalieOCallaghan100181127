package CW1;
import java.util.ArrayList;

public class Songlist {

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
    public void removeSongFromSonglist(){
    
   }

   // Print the songlist
    public void printSonglist(){
        // Line for spacing purposes
        System.out.println();
        // For loop that accounts for the size of the current songlist length and runs it that many times
        for (int i = 0; i < songlist.size(); i++) {
            // Gets the song data for the current element in the arraylist
            Song song = songlist.get(i);
            // Prints out the song name, artist name and playcount for the currently indexed song
            System.out.println(song.getSongName() + ", " + song.getArtistName() + ", " + song.getPlayCount());
    }
}

   // Print songs that have over a given number of plays 
    public void songsOverGivenPlaycount(int playCountFilter){
        System.out.println();
        // For loop that accounts for the size of the current songlist length and runs it that many times
        for (int i = 0; i < songlist.size(); i++) {
            // Gets the song data for the current element in the arraylist
            Song song = songlist.get(i);
            if (song.getPlayCount() > playCountFilter) {   
            // Prints out the song name, artist name and playcount if the currently indexed song has over the given number of plays.
                System.out.println(song.getSongName() + ", " + song.getArtistName() + ", " + song.getPlayCount());    
            }
        }
    }
}
