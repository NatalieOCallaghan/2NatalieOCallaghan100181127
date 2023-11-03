/**
 * Author: Natalie O'Callaghan
 * Date: November 03, 2023
 * Description: This is a class for setting up songs that will go into the songlist. It features a constructor and getters and setters for the song's properties.
 */

package CW1;

public class Song {
    // Sets up the song's properties to their correct datatypes
    private String songName;
    private String artistName;
    private int playCount;
    private int songLength;

    // Constructor for the song, setting up how the song will be structured
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

    // Getter and setter for the PlayCount
    public int getPlayCount(){
        return this.playCount;
    }

    public void setPlayCount(int playCount){
        this.playCount = playCount;
    }

    // Getter and setter for Song length
    public int getSongLength(){
        return this.songLength;
    }

    public void setSongLength(int songLength){
        this.songLength = songLength;
    }

}
