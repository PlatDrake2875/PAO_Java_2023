package ro;

import ro.pao.model.abstracts.AbstractAudioContent;
import ro.pao.model.audioContents.Audiobook;
import ro.pao.model.audioContents.Podcast;
import ro.pao.model.audioContents.Song;
import ro.pao.model.enums.AudioContentType;
import ro.pao.model.enums.UserType;
import ro.pao.model.records.Playlist;
import ro.pao.model.users.User;
import ro.pao.service.impl.audioContents.AudiobookServiceImpl;
import ro.pao.service.impl.audioContents.PodcastServiceImpl;
import ro.pao.service.impl.audioContents.SongServiceImpl;


import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Audiobook audiobook0 = new Audiobook("The Lord of the Rings", new Date(1954, Calendar.JANUARY, 29), LocalTime.of(0, 0), AudioContentType.AUDIOBOOK, "J.R.R. Tolkien", "Rob Inglis", true, "Allen & Unwin", "Fantasy");
        Audiobook audiobook1 = new Audiobook("Sapiens: A Brief History of Humankind", new Date(2011, Calendar.JANUARY, 1), LocalTime.of(0, 0), AudioContentType.AUDIOBOOK, "Yuval Noah Harari", "Rob Inglis", true, "HarperCollins", "History");
        Audiobook audiobook2 = new Audiobook("The Hitchhiker's Guide to the Galaxy", new Date(1979, Calendar.JANUARY, 1), LocalTime.of(0, 0), AudioContentType.AUDIOBOOK, "Douglas Adams", "Stephen Fry", true, "Pan Books", "Science Fiction");
        Audiobook audiobook3 = new Audiobook("The Hobbit", new Date(1937, Calendar.JANUARY, 21), LocalTime.of(0, 0), AudioContentType.AUDIOBOOK, "J.R.R. Tolkien", "Rob Inglis", true, "Allen & Unwin", "Fantasy");
        Audiobook audiobook4 = new Audiobook("The Alchemist", new Date(1988, Calendar.JANUARY, 1), LocalTime.of(0, 0), AudioContentType.AUDIOBOOK, "Paulo Coelho", "Jeremy Irons", true, "HarperCollins", "Fantasy");

        ArrayList<Audiobook> audiobooks = new ArrayList<>();

        audiobooks.add(audiobook0);
        audiobooks.add(audiobook1);
        audiobooks.add(audiobook2);
        audiobooks.add(audiobook3);
        audiobooks.add(audiobook4);

        for (Audiobook audiobook : audiobooks) {
            System.out.println(audiobook);
        }

        System.out.println("Audiobooks count: " + Audiobook.getIdAudiobookCounter());

        AudiobookServiceImpl audiobookService = new AudiobookServiceImpl();

        for (var audiobook : audiobookService.getAllAudiobooksSortedByTitle(audiobooks)) {
            System.out.println(audiobook.getTitle());
        }

        Song song0 = new Song("The Sound of Silence",
                new Date(1964, Calendar.JANUARY, 1),
                LocalTime.of(0, 0), AudioContentType.SONG,
                "Simon & Garfunkel",
                "Paul Simon",
                "Art Garfunkel");

        Song song1 = new Song("Believer",
                new Date(2017, Calendar.JANUARY, 1),
                LocalTime.of(0, 0),
                AudioContentType.SONG,
                "Imagine Dragons",
                "Dan Reynolds",
                "Ben McKee");

        Song song2 = new Song("The Scientist",
                new Date(2002, Calendar.JANUARY, 1),
                LocalTime.of(0, 0),
                AudioContentType.SONG,
                "Coldplay",
                "Chris Martin",
                "Guy Berryman");

        Song song3 = new Song("Bohemian Rhapsody",
                new Date(1975, Calendar.JANUARY, 1),
                LocalTime.of(0, 0),
                AudioContentType.SONG,
                "Queen",
                "Freddie Mercury",
                "Brian May");

        Song song4 = new Song("Hotel California",
                new Date(1976, Calendar.JANUARY, 1),
                LocalTime.of(0, 0),
                AudioContentType.SONG,
                "Eagles",
                "Don Henley",
                "Glenn Frey");

        List<Song> songs = new LinkedList<>();
        songs.add(song0);
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);

        for (Song song : songs) {
            System.out.println(song);
        }

        SongServiceImpl songService = new SongServiceImpl();

        for (var song : songService.getAllSongsWithSongTitle(songs, "Hotel California")) {
            System.out.println(song.getTitle());
        }

        for (var song : songService.getAllSongArtists(songs)) {
            System.out.println(song);
        }

        Podcast podcast0 = new Podcast("My Podcast",
                new Date(), LocalTime.of(1, 30),
                AudioContentType.PODCAST, "Technology",
                new String[]{"John", "Jane"},
                new String[]{"Artificial Intelligence", "Blockchain"});

        Podcast podcast1 = new Podcast("The Joe Rogan Experience",
                new Date(2009, Calendar.JANUARY, 1),
                LocalTime.of(0, 0),
                AudioContentType.PODCAST, "All of 'em. He's Joe Rogan",
                new String[]{"Joe Rogan", "Brian Redban", "Jamie Kennedy", "Joe DeRosa"},
                new String[]{"Comedy", "Politics"});

        Podcast podcast2 = new Podcast("The Daily",
                new Date(2019, Calendar.JANUARY, 1),
                LocalTime.of(0, 0),
                AudioContentType.PODCAST, "News",
                new String[]{"Michael Barbaro"},
                new String[]{"News"});

        Podcast podcast3 = new Podcast("The Tim Ferriss Show",
                new Date(2012, Calendar.JANUARY, 1),
                LocalTime.of(0, 0),
                AudioContentType.PODCAST, "Business",
                new String[]{"Tim Ferriss"},
                new String[]{"Business"});

        Podcast podcast4 = new Podcast("Trash Taste",
                new Date(2017, Calendar.JANUARY, 1),
                LocalTime.of(0, 0),
                AudioContentType.PODCAST, "Anime",
                new String[]{"Trash Taste"},
                new String[]{"Anime"});

        List<Podcast> podcasts = new LinkedList<>();

        podcasts.add(podcast0);
        podcasts.add(podcast1);
        podcasts.add(podcast2);
        podcasts.add(podcast3);
        podcasts.add(podcast4);

        for (Podcast podcast : podcasts) {
            System.out.println(podcast);
        }

        PodcastServiceImpl podcastService = new PodcastServiceImpl();

        for (var podcast : podcastService.getAllPodcastsSortedByTitle(podcasts)) {
            System.out.println(podcast.getTitle());
        }

        for (var podcast : podcastService.getAllPodcastsSortedByGuests(podcasts)) {
            System.out.println(podcast.getGuests());
        }

        Playlist[] playlists = new Playlist[5];

        Random random = new Random();

        for (int i = 0; i < playlists.length; i++) {
            playlists[i] = new Playlist("Playlist " + i,
                    "Playlist " + i + " description ",
                    "C:/Users/JohnDoe/Desktop/Playlist" + i + ".jpg",
                    new Song[]{song0, song1, song2, song3, song4},
                    random.nextBoolean());
        }

        User user0 = new User("John",
                "Doe",
                "Mike",
                "Doe",
                "mikedoe@hotmail.com",
                "40203020323",
                "St. John's Road 23",
                "London",
                "UK",
                new Date(1990, Calendar.JANUARY, 1),
                "C:/Users/JohnDoe/Desktop/JohnDoe.jpg",
                UserType.USER,
                playlists);

        System.out.println(user0);


    }
}