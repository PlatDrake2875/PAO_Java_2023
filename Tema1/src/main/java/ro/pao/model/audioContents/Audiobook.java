package ro.pao.model.audioContents;

import ro.pao.model.abstracts.AbstractAudioContent;
import ro.pao.model.enums.AudioContentType;

import java.time.LocalTime;
import java.util.Date;

public class Audiobook extends AbstractAudioContent {

    private String author;
    private String[] narrators;
    private boolean hasBackgroundMusic;
    private static int idAudiobookCounter;

    static {
        idAudiobookCounter = 0;
    }

    {
        idAudiobookCounter++;
    }

    public Audiobook(String title, Date year, LocalTime duration, AudioContentType type, String author, String[] narrators, boolean hasBackgroundMusic) {
        super(title, year, duration, type);
        this.author = author;
        this.narrators = narrators;
        this.hasBackgroundMusic = hasBackgroundMusic;
    }

    //GETTERS
    public String getAuthor() {
        return author;
    }

    public String[] getNarrators() {
        return narrators;
    }

    public boolean isHasBackgroundMusic() {
        return hasBackgroundMusic;
    }

    //SETTERS
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNarrators(String[] narrators) {
        this.narrators = narrators;
    }

    public void setHasBackgroundMusic(boolean hasBackgroundMusic) {
        this.hasBackgroundMusic = hasBackgroundMusic;
    }

    //METHODS
    @Override
    public void play() {
        System.out.println("Audiobook is playing");
    }
}
