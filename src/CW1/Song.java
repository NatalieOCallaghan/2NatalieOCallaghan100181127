package CW1;

public class Song {
    private String songName;
    private String artistName;
    private int playCount;
    private int songLength;

    // Constructor
    public Song(String songName, String artistName, int playCount, int songLength) {
        this.songName = songName;
        this.artistName = artistName;
        this.playCount = playCount;
        this.songLength = songLength;
    }
   
    // Getter and Setter for Song name    
    public String getSongName(){
        return this.songName;
    }

    public void setSongName(String songName){
        this.songName = songName;
    }

    // Getter and setter for Artist's name
    public String getArtistName(){
        return this.artistName;
    }

    public void setArtistName(String artistName){
        this.artistName = artistName;
    }

    // Getter and setter for Play count
    public int getPlayCount(){
        return this.playCount;
    }

    public void setPlayCount(int playCount){
        this.playCount = playCount;
    }

    // Getter and setter for song length
    public int getSongLength(){
        return this.songLength;
    }

    public void setSongLength(int songLength){
        this.songLength = songLength;
    }

}
