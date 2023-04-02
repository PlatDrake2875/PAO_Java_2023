package ro.pao.model.audioContents;

import ro.pao.model.abstracts.AbstractAudioContent;
import ro.pao.model.enums.AudioContentType;

import java.time.LocalTime;
import java.util.Date;

public class Audiobook extends AbstractAudioContent {

    private String author;
    private String narrator;
    private String publisher;
    private boolean hasBackgroundMusic;
    private String genre;
    private static int idAudiobookCounter;

    static {
        idAudiobookCounter = 0;
    }

    {
        idAudiobookCounter++;
    }

    public Audiobook(String title, Date year, LocalTime duration, AudioContentType type, String author, String narrator, boolean hasBackgroundMusic, String publisher, String genre) {
        super(title, year, duration, type);
        this.author = author;
        this.narrator = narrator;
        this.hasBackgroundMusic = hasBackgroundMusic;
        this.publisher = publisher;
        this.genre = genre;
    }

    public static int getIdAudiobookCounter() {
        return idAudiobookCounter;
    }

    //GETTERS
    public String getAuthor() {
        return author;
    }

    public String getNarrator() {
        return narrator;
    }

    public boolean isHasBackgroundMusic() {
        return hasBackgroundMusic;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    //SETTERS
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public void setHasBackgroundMusic(boolean hasBackgroundMusic) {
        this.hasBackgroundMusic = hasBackgroundMusic;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //METHODS
    @Override
    public void play() {
        System.out.println("Audiobook is playing");
    }
}
