package ro.pao.model.audioContents;

import ro.pao.model.abstracts.AbstractAudioContent;
import ro.pao.model.enums.AudioContentType;
import ro.pao.service.audioContentsServices.Playable;

import java.time.LocalTime;
import java.util.Date;

public class Audiobook extends AbstractAudioContent implements Playable {
    private static int idAudiobookCounter = 0;
    private String author;
    private String narrator;
    private boolean hasBackgroundMusic;
    private String publisher;
    private String genre;

    private Audiobook(Builder builder) {
        super(builder.title, builder.releaseDate, builder.duration, AudioContentType.AUDIOBOOK);
        this.author = builder.author;
        this.narrator = builder.narrator;
        this.hasBackgroundMusic = builder.hasBackgroundMusic;
        this.publisher = builder.publisher;
        this.genre = builder.genre;
        idAudiobookCounter++;
    }

    public static int getIdAudiobookCounter() {
        return idAudiobookCounter;
    }

    //GETTERS
    public String getAuthor() {
        return author;
    }

    //SETTERS
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public boolean isHasBackgroundMusic() {
        return hasBackgroundMusic;
    }

    public void setHasBackgroundMusic(boolean hasBackgroundMusic) {
        this.hasBackgroundMusic = hasBackgroundMusic;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //METHODS
    @Override
    public void play() {
        System.out.println("Audiobook is playing");
    }

    public static class Builder {
        private String title;
        private Date releaseDate;
        private LocalTime duration;
        private String author;
        private String narrator;
        private boolean hasBackgroundMusic;
        private String publisher;
        private String genre;

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

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setNarrator(String narrator) {
            this.narrator = narrator;
            return this;
        }

        public Builder setHasBackgroundMusic(boolean hasBackgroundMusic) {
            this.hasBackgroundMusic = hasBackgroundMusic;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Audiobook build() {
            return new Audiobook(this);
        }
    }
    // other methods remain the same
}
