package CW1;
// Imports InputReader
import helpers.InputReader;


public class SongApplication{
    public static void main(String[] args) {
        // Creates songlist
        Songlist songlist = new Songlist();
        
        // Default songs of songlist
        Song song1 = new Song("Halo", "Beyonce", 991888598);
        Song song2 = new Song("", "", 1);

        // Populate Songlist with the default songs
        songlist.addSongToSonglist(song1);
        songlist.addSongToSonglist(song2);
    
        // Menu to output to the user + User menu choice
        int menuChoice=0;
        do {
            
            System.out.println("");
            System.out.println("--- Music Application ---");
            System.out.println("-------- Options --------");
            System.out.println("1. Add a song to songlist");
            System.out.println("2. Remove a song from the songlist");
            System.out.println("3. Print current songlist");
            System.out.println("4. Filter songs that have over an amount of playcounts");
            System.out.println("5. Quit application");
            System.out.println("");

            menuChoice=InputReader.getInt("Please enter your choice: ");
        
            switch(menuChoice) {
                // Allows the user to add a song to the songlist
                case 1:
                    System.out.println("Choice 1");
                    String songName=InputReader.getString("Song Name: ");
                    String artistName=InputReader.getString("Artist Name: ");
                    int playCount=InputReader.getInt("Playcount: ");
                    Song songToAdd = new Song(songName, artistName, playCount);
                    songlist.addSongToSonglist(songToAdd);
                    System.out.println("Song added!");
                    break;
                case 2:
                    System.out.println("Choice 2");
                    break;
                // Will output the whole songlist
                case 3:
                    System.out.println("Choice 3");
                    songlist.printSonglist();
                    break;
                // Will filter the songlist by a playcount that the user provides
                case 4:
                    System.out.println("Choice 4");
                    int playCountFilter=InputReader.getInt("Please enter an amount: ");
                    songlist.songsOverGivenPlaycount(playCountFilter);
                    break;
                case 5:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Please select a valid choice (1/2/3/4/5)");
            }
        // Ensures that the program will repeat until option 5 (or "Quit application") is selected
        } while(menuChoice != 5);
    }
}
