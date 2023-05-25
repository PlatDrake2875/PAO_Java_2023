package ro.pao.model.abstracts;

import ro.pao.model.enums.AudioContentType;

import java.time.LocalTime;
import java.util.Date;

//TODO: Add audio file handling

public abstract class AbstractAudioContent {
    private String title;
    private Date releaseDate;
    private LocalTime duration;
    private final AudioContentType type;

    private static int idCounter;

    static {
        idCounter = 0;
    }

    {
        idCounter++;
    }

    protected AbstractAudioContent(String title, Date releaseDate, LocalTime duration, AudioContentType type) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.type = type;
    }

    public AbstractAudioContent() {
        this.title = "No title";
        this.releaseDate = new Date();
        this.duration = LocalTime.of(0, 0);
        this.type = AudioContentType.SONG;
    }

    // GETTERS
    public String getTitle() {
        return title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public AudioContentType getType() {
        return type;
    }

    // SETTERS
    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(Date year) {
        this.releaseDate = year;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public abstract void play();
}
