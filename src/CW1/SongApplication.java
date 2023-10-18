package CW1;
// Imports InputReader
import helpers.InputReader;


public class SongApplication{
    public static void main(String[] args) {
        // Creates songlist
        Songlist songlist = new Songlist();
        
        // Default songs of songlist
        Song song1 = new Song("Disco Inferno", "The Trammps", 122958376);
        Song song2 = new Song("Working My Way Back To You", "Frankie Valli & The Four Seasons", 12609313);
        Song song3 = new Song("Hold the Line", "Toto", 654539932);
        Song song4 = new Song("It's My Life", "Bon Jovi", 753010952);
        Song song5 = new Song("I Gotta Feeling", "Black Eyed Peas", 1210979111);
        Song song6 = new Song("Uptown Funk", "Mark Ronson", 1814204607);
        Song song7 = new Song("Still into You", "Paramore", 662054821);
        Song song8 = new Song("Blank Space", "Taylor Swift", 1544159026);
        Song song9 = new Song("It's Time", "Imagine Dragons", 647013657);
        Song song10 = new Song("Firework", "Katy Perry", 919050169);

        // Populate Songlist with the default songs
        songlist.addSongToSonglist(song1);
        songlist.addSongToSonglist(song2);
        songlist.addSongToSonglist(song3);
        songlist.addSongToSonglist(song4);
        songlist.addSongToSonglist(song5);
        songlist.addSongToSonglist(song6);
        songlist.addSongToSonglist(song7);
        songlist.addSongToSonglist(song8);
        songlist.addSongToSonglist(song9);
        songlist.addSongToSonglist(song10);

        // Defaults the menu choice to 0, as a value is needed for the "do while" loop to start
        int menuChoice=0;
        do {
            
            // Menu options
            System.out.println("");
            System.out.println("--- Music Application ---");
            System.out.println("-------- Options --------");
            System.out.println("1. Add a song to songlist");
            System.out.println("2. Remove a song from the songlist");
            System.out.println("3. Print current songlist");
            System.out.println("4. Filter songs that have over an amount of playcounts");
            System.out.println("5. Quit application");
            System.out.println("");

            // User enters their choice
            menuChoice=InputReader.getInt("Please enter your choice: ");
        
            switch(menuChoice) {
                // Allows the user to add a song to the songlist
                case 1:
                    System.out.println("Choice 1");
                    // User enters information about the song they would like to add
                    String songName=InputReader.getString("Song Name: ");
                    String artistName=InputReader.getString("Artist Name: ");
                    int playCount=InputReader.getInt("Playcount: ");
                    // Creates a new song instance with the information the user entered
                    Song songToAdd = new Song(songName, artistName, playCount);
                    // Runs the method "addSongToSonglist" which then adds the song to the songlist
                    songlist.addSongToSonglist(songToAdd);
                    // Outputs confirmation to the user
                    System.out.println("Song added!");
                    break;
                
                // Allows the user to remove a song from the songlist
                case 2:
                    System.out.println("Choice 2");
                    // User inputs the song name and artist of the song they would like to remove
                    String songNameToRemove = InputReader.getString("Song name: ");
                    String artistNameToRemove = InputReader.getString("Artist name: ");
                    // These values are put into the removeSongFromSongList method which will remove the song from the songlist
                    songlist.removeSongFromSonglist(songNameToRemove, artistNameToRemove);
                    break;
                
                // Will output the whole songlist
                case 3:
                    System.out.println("Choice 3");
                    songlist.printSonglist();
                    break;

                // Will filter the songlist by a playcount that the user provides
                case 4:
                    System.out.println("Choice 4");
                    // User inputs the amount of playcounts they wish to filter the playlist by
                    int playCountFilter=InputReader.getInt("Please enter an amount: ");
                    songlist.songsOverGivenPlayCount(playCountFilter);
                    break;
    
                // Informs the user that the program is stopping (the "do while" loop will stop looping)
                case 5:
                    System.out.println("Exiting application...");
                    break;
    
                // Will output this to the user if they input anything that isn't a menu option
                default:
                    System.out.println("Please select a valid choice (1/2/3/4/5)");
            }
        // Ensures that the program will repeat until option 5 (or "Quit application") is selected
        } while(menuChoice != 5);
    }
}
