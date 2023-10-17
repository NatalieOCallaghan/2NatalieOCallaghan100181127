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
