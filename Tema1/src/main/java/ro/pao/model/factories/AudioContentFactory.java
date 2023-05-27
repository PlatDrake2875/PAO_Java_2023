package ro.pao.model.factories;

import ro.pao.model.abstracts.AbstractAudioContent;
import ro.pao.repository.Audiobook;
import ro.pao.repository.Podcast;
import ro.pao.repository.Song;
import ro.pao.model.enums.AudioContentType;

import java.time.LocalTime;
import java.util.Date;

public class AudioContentFactory {
    public AbstractAudioContent createSong(String title, Date releaseDate, LocalTime duration, String genre, String album, String artist, String lyrics) {
        return new Song.Builder()
                .setTitle(title)
                .setReleaseDate(releaseDate)
                .setDuration(duration)
                .setGenre(genre)
                .setAlbum(album)
                .setArtist(artist)
                .setLyrics(lyrics)
                .build();
    }

    public AbstractAudioContent createPodcast(String title, Date year, LocalTime duration, String genre, String[] guests, String[] topics) {
        return new Podcast.Builder()
                .setTitle(title)
                .setReleaseDate(year)
                .setDuration(duration)
                .setGenre(genre)
                .setGuests(guests)
                .setTopics(topics)
                .build();
    }

    public AbstractAudioContent createAudiobook(String title, Date year, LocalTime duration, String author, String narrator, boolean hasBackgroundMusic, String publisher, String genre) {
        return new Audiobook.Builder()
                .setTitle(title)
                .setReleaseDate(year)
                .setDuration(duration)
                .setAuthor(author)
                .setNarrator(narrator)
                .setHasBackgroundMusic(hasBackgroundMusic)
                .setPublisher(publisher)
                .setGenre(genre)
                .build();
    }

    public AbstractAudioContent createAudioContent(AudioContentType type, String title, Date releaseDate, LocalTime duration, Object... addParams) {
        return switch (type) {
            case SONG -> createSong(title, releaseDate, duration,
                    (String) addParams[0],  // genre
                    (String) addParams[1],  // album
                    (String) addParams[2],  // artist
                    (String) addParams[3]   // lyrics
            );
            case AUDIOBOOK -> createAudiobook(title, releaseDate, duration,
                    (String) addParams[0],  // author
                    (String) addParams[1],  // narrator
                    (Boolean) addParams[2], // hasBackgroundMusic
                    (String) addParams[3],  // publisher
                    (String) addParams[4]   // genre
            );
            case PODCAST -> createPodcast(title, releaseDate, duration,
                    (String) addParams[0],  // genre
                    (String[]) addParams[1], // guests
                    (String[]) addParams[2]  // topics
            );
            default -> throw new IllegalArgumentException("Invalid audio content type: " + type);
        };
    }
}
