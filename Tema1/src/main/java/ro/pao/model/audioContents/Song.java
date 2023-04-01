package ro.pao.model.audioContents;

import ro.pao.model.abstracts.AbstractAudioContent;
import ro.pao.model.enums.AudioContentType;

import java.time.LocalTime;
import java.util.Date;

public class Song extends AbstractAudioContent {
    private String genre;
    private String album;

    private static int idSongCounter;

    static{
        idSongCounter = 0;
    }

    {
        idSongCounter++;
    }
    protected Song(String title, Date year, LocalTime duration, AudioContentType type, String genre, String album) {
        super(title, year, duration, type);
        this.genre = genre;
        this.album = album;
    }

    //GETTERS
    public String getGenre() {
        return genre;
    }

    public String getAlbum() {
        return album;
    }

    //SETTERS
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    //M
    @Override
    public void play() {

    }
}
