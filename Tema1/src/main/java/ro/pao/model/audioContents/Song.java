package ro.pao.model.audioContents;

import ro.pao.model.abstracts.AbstractAudioContent;
import ro.pao.model.enums.AudioContentType;

import java.time.LocalTime;
import java.util.Date;

public class Song extends AbstractAudioContent {
    private String genre;
    private String album;
    private String artist;
    private String lyrics;
    private static int idSongCounter;


    static {
        idSongCounter = 0;
    }

    {
        idSongCounter++;
    }

    public Song(String title, Date year, LocalTime duration, AudioContentType type, String genre, String album, String lyrics) {
        super(title, year, duration, type);
        this.genre = genre;
        this.album = album;
        this.lyrics = lyrics;
    }

    //GETTERS
    public String getGenre() {
        return genre;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public String getLyrics() {
        return lyrics;
    }

    //SETTERS
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    //M
    @Override
    public void play() {

    }
}
