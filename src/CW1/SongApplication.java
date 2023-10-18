package CW1;
// Imports ConsoleColours (Used for themes)
import helpers.ConsoleColours;
// Imports InputReader (Used for user inputs)
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

        // Defaults the theme of the application to "none"
        System.out.println(ConsoleColours.ANSI_RESET);
        String theme="none";
        // Defaults the menu choice to 0, as a value is needed for the "do while" loop to start
        int menuChoice=0;
        do {
            // Conditional statements to check and set the theme of the program. It will be none as default but then will change if the user decides to change it
            // This is checked with every loop to ensure that what the user is seeing is up to date with the theme they want
            if (theme.equalsIgnoreCase("Black")) {
                // Makes use of the "ConsoleColours" helper to set the theme to the correct colour
                System.out.println(ConsoleColours.ANSI_BLACK);
            } else if (theme.equalsIgnoreCase("White")) {
                System.out.println(ConsoleColours.ANSI_WHITE);
            } else if (theme.equalsIgnoreCase("Red")) {
                System.out.println(ConsoleColours.ANSI_RED);
            } else if (theme.equalsIgnoreCase("Green")) {
                System.out.println(ConsoleColours.ANSI_GREEN);
            } else if (theme.equalsIgnoreCase("Yellow")) {
                System.out.println(ConsoleColours.ANSI_YELLOW);
            } else if (theme.equalsIgnoreCase("Blue")) {
                System.out.println(ConsoleColours.ANSI_BLUE);
            } else if (theme.equalsIgnoreCase("Purple")) {
                System.out.println(ConsoleColours.ANSI_PURPLE);
            } else if (theme.equalsIgnoreCase("Cyan")) {
                System.out.println(ConsoleColours.ANSI_CYAN);       
            }
            else {
                // If the theme is none then it outputs the default colour (or performs a "reset" on the theme)
                System.out.println(ConsoleColours.ANSI_RESET);
            }
            
            // Menu options
            System.out.println("");
            System.out.println("--- Music Application ---");
            System.out.println("-------- Options --------");
            System.out.println("1. Add a song to songlist");
            System.out.println("2. Remove a song from the songlist");
            System.out.println("3. Print current songlist");
            System.out.println("4. Filter songs that have over an amount of playcounts");
            System.out.println("5. Change theme");
            System.out.println("6. Quit application");
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
                
                case 5:
                    System.out.println("Choice 5");
                    // Outputs the options to the user and defaults validation to "false"
                    System.out.println("Themes: Black, White, Red, Green, Yellow, Blue, Purple, Cyan");
                    Boolean themeValid=false;
                    // "Do while" loop to ensure that the user selects a valid theme before the program continues
                    do { 
                        // User inputs the theme they would like to use
                        theme = InputReader.getString("What theme would you like to choose?: ");
                        // If the theme entered equals any of the available themes, the validator, themeValid, becomes true
                        if (theme.equalsIgnoreCase("Black") || theme.equalsIgnoreCase("White") || theme.equalsIgnoreCase("Red") || theme.equalsIgnoreCase("Green") || theme.equalsIgnoreCase("Yellow") || theme.equalsIgnoreCase("Blue") || theme.equalsIgnoreCase("Purple") || theme.equalsIgnoreCase("Cyan")) {
                            themeValid=true;
                        // If the theme entered doesn't equal any of the available themes, it will output an error message and keep the validator false
                        } else {
                            System.out.println("Theme invalid. Please try again.");
                            themeValid=false;
                        }
                    // Will continue to loop until the theme entered is valid
                    } while (themeValid == false);
                    break;

                // Informs the user that the program is stopping (the "do while" loop will stop looping)
                case 6:
                    System.out.println("Exiting application...");
                    break;
    
                // Will output this to the user if they input anything that isn't a menu option
                default:
                    System.out.println("Please select a valid choice (1/2/3/4/5)");
            }
        // Ensures that the program will repeat until option 6 (or "Quit application") is selected
        } while(menuChoice != 6);
    }
}
