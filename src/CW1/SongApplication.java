package CW1;
// Imports InputReader
import helpers.InputReader;

public class SongApplication{
    public static void main(String[] args) {
        // Creates songlist
        Songlist songlist = new Songlist();
        
        // Default songs of songlist
        Song song1 = new Song("Halo", "Beyonce", 991888598);

        // Populate Songlist with the default songs
        songlist.addSongToSonglist(song1);
    
        // Menu to output to the user + User menu choice, could be a "do while" loop? could use switch and case statements.
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
                case 1:
                    System.out.println("Choice 1");
                    break;
                case 2:
                    System.out.println("Choice 2");
                    break;
                case 3:
                    System.out.println("Choice 3");
                    songlist.printSonglist(songlist);
                    break;
                case 4:
                    System.out.println("Choice 4");
                    break;
                case 5:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Please select a valid choice (1/2/3/4/5)");
            }
        } while(menuChoice != 5);
    }
}
