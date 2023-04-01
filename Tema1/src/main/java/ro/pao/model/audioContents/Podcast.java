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

    protected Podcast(String title, Date year, LocalTime duration, AudioContentType type, String genre, String[] guests, String[] topics) {
        super(title, year, duration, type);
        this.genre = genre;
        this.guests = guests;
        this.topics = topics;
    }

    @Override
    public void play() {
        System.out.println("Playing podcast");
    }
}
