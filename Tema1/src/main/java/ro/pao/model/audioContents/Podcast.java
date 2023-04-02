package ro.pao.model.audioContents;

import ro.pao.model.abstracts.AbstractAudioContent;
import ro.pao.model.enums.AudioContentType;

import java.time.LocalTime;
import java.util.Date;

public class Podcast extends AbstractAudioContent {
    private String genre;
    private String[] guests;
    private String[] topics;

    private static int idPodcastCounter;

    static {
        idPodcastCounter = 0;
    }

    {
        idPodcastCounter++;
    }

    public Podcast(String title, Date year, LocalTime duration, AudioContentType type, String genre, String[] guests, String[] topics) {
        super(title, year, duration, type);
        this.genre = genre;
        this.guests = guests;
        this.topics = topics;
    }

    //Getters
    public String getGenre() {
        return genre;
    }

    public String[] getGuests() {
        return guests;
    }

    public String[] getTopics() {
        return topics;
    }

    //Setters
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setGuests(String[] guests) {
        this.guests = guests;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    @Override
    public void play() {
        System.out.println("Playing podcast");
    }
}
