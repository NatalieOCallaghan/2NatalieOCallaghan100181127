package CW1;

public class Song {
    private String songName;
    private String artistName;
    private int playCount;

    // Constructor
    public Song(String songName, String artistName, int playCount) {
        this.songName = songName;
        this.artistName = artistName;
        this.playCount = playCount;
    }
   
    // Getter and Setter for Song name    
    public String getSongName(){
        return this.songName;
    }

    public setSongName(string songName){

    }

    // Getter and setter for Artist's name
    public String getArtistName(){
        return this.artistName;
    }

    public setArtistName(string artistName){

    }

    // Getter and setter for Play count
    public int getPlayCount(){
        return this.playCount;
    }

    public setPlayCount(int playCount){

    }

}
