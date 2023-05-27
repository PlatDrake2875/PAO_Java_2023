package ro.pao.model.audioContents;

import ro.pao.model.abstracts.AbstractAudioContent;
import ro.pao.model.enums.AudioContentType;
import ro.pao.service.audioContentsServices.Playable;

import java.time.LocalTime;
import java.util.Date;

public class Podcast extends AbstractAudioContent implements Playable {
    private static int idPodcastCounter = 0;
    private String genre;
    private String[] guests;
    private String[] topics;


    private Podcast(Builder builder) {
        super(builder.title, builder.releaseDate, builder.duration, AudioContentType.PODCAST);
        this.genre = builder.genre;
        this.guests = builder.guests;
        this.topics = builder.topics;
        idPodcastCounter++;
    }

    //Getters
    public String getGenre() {
        return genre;
    }

    //Setters
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String[] getGuests() {
        return guests != null ? guests : new String[0];
    }

    public void setGuests(String[] guests) {
        this.guests = guests;
    }

    public String[] getTopics() {
        return topics;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    @Override
    public void play() {
        System.out.println("Playing podcast");
    }

    public static class Builder {
        private String title;
        private Date releaseDate;
        private LocalTime duration;
        private String genre;
        private String[] guests;
        private String[] topics;

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

        public Builder setGuests(String[] guests) {
            this.guests = guests;
            return this;
        }

        public Builder setTopics(String[] topics) {
            this.topics = topics;
            return this;
        }

        public Podcast build() {
            return new Podcast(this);
        }
    }

    // other methods remain the same
}
