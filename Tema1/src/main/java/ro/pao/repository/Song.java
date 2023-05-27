package ro.pao.repository;

import ro.pao.model.abstracts.AbstractAudioContent;
import ro.pao.model.enums.AudioContentType;
import ro.pao.service.interfaces.Playable;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Song extends AbstractAudioContent implements Playable {
    private String genre;
    private String album;
    private String artist;
    private String lyrics;

    private Song(Builder builder) {
        super(builder.title, builder.releaseDate, builder.duration, AudioContentType.SONG);
        this.genre = builder.genre;
        this.album = builder.album;
        this.artist = builder.artist;
        this.lyrics = builder.lyrics;
    }

    public String getGenre() {
        return genre;
    }

    //SETTERS
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public int getYear() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.getReleaseDate());
        return cal.get(Calendar.YEAR);
    }

    public String getTime() {
        return this.getDuration().toString();
    }

    @Override
    public void play() {
        System.out.println("Now playing: " + this.getTitle());
        System.out.println("Artist: " + this.getArtist());
        System.out.println("Album: " + this.getAlbum());
        System.out.println("Genre: " + this.getGenre());
        System.out.println("Duration: " + this.getDuration().toString());
    }

    public static class Builder {
        private String title;
        private Date releaseDate;
        private LocalTime duration;
        private String genre;
        private String album;
        private String artist;
        private String lyrics;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder setDuration(LocalTime duration) {
            this.duration = duration;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setAlbum(String album) {
            this.album = album;
            return this;
        }

        public Builder setArtist(String artist) {
            this.artist = artist;
            return this;
        }

        public Builder setLyrics(String lyrics) {
            this.lyrics = lyrics;
            return this;
        }

        public Song build() {
            return new Song(this);
        }
    }
}



