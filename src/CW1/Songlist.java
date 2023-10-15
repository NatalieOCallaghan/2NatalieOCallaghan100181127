package CW1;
import java.util.ArrayList;

public class Songlist {

   // Will be an arraylist of Songs.
   private ArrayList<Song> songlist;
   
   public Songlist() {
    songlist = new ArrayList<Song>();
   }
   // Populate songlist
   

   // Add a new song to the songlist, 
   public void addSongToSonglist(Song song){
    songlist.add(song);
   }

   // Remove a song from the songlist, 
    public void removeSongFromSonglist(){
    
   }

   // Print the songlist
   public void printSonglist(Songlist songlist){
    System.out.println(songlist);
}

   // Print songs that have over a given number of plays 
    // Potentially an if statement that runs through all the song instances and compares them to the given number


}
