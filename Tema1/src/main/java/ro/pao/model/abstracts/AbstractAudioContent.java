package ro.pao.model.abstracts;

import ro.pao.model.enums.AudioContentType;

import java.time.LocalTime;
import java.util.Date;

public abstract class AbstractAudioContent {
    private static int idCounter = 0;
    private final AudioContentType type;
    private String title;
    private Date releaseDate;
    private LocalTime duration;

    protected AbstractAudioContent(String title, Date releaseDate, LocalTime duration, AudioContentType type) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.type = type;
        idCounter++;
    }

    protected AbstractAudioContent() {
        this.title = "No title";
        this.releaseDate = new Date();
        this.duration = LocalTime.of(0, 0);
        this.type = AudioContentType.SONG;
    }

    public String getTitle() {
        return title;
    }

    // SETTERS
    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date year) {
        this.releaseDate = year;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public AudioContentType getType() {
        return type;
    }

    public abstract void play();

}
