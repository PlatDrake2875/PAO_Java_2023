package ro;

import com.fasterxml.jackson.databind.ObjectMapper;
import ro.pao.config.DatabaseConfig;
import ro.pao.model.audioContents.Audiobook;
import ro.pao.model.audioContents.Podcast;
import ro.pao.model.audioContents.Song;
import ro.pao.model.enums.UserType;
import ro.pao.model.records.Playlist;
import ro.pao.model.users.Admin;
import ro.pao.model.users.SuperAdmin;
import ro.pao.model.users.User;
import ro.pao.service.impl.audioContents.AudiobookServiceImpl;
import ro.pao.service.impl.audioContents.PodcastServiceImpl;
import ro.pao.service.impl.audioContents.SongServiceImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    private static final String JSON_FILE_NAME = "C:\\Users\\aopat\\Documents\\GitHub\\PAO_Java_2023\\Tema1\\users.json";
    private static final String CSV_FILE_NAME = "C:\\Users\\aopat\\Documents\\GitHub\\PAO_Java_2023\\Tema1\\csvfiles\\playlist.csv";
    private static final String URI_STRING = "https://www.auchan.ro/";

    public static void main(String[] args) throws IOException {
        List<Audiobook> audiobooks = initAudiobooks();
        List<Song> songs = initSongs();
        List<Podcast> podcasts = initPodcasts();

        displayContent(audiobooks, "Audiobooks count: " + Audiobook.getIdAudiobookCounter());
        useAudiobookService(audiobooks);

        displayContent(songs, null);
        useSongService(songs);

        displayContent(podcasts, null);
        usePodcastService(podcasts);

        Playlist[] playlists = createPlaylists(songs);
        writePlaylistsToCSV(playlists);

        User user0 = createUser(playlists);
        LOGGER.log(Level.INFO, "User data {0}", user0);


        User[] users = readUsersFromJson();
        writeUsersToJson(users);

        if (users != null && users.length > 0) {
            LOGGER.log(Level.INFO, "Users read from JSON file: {}", Arrays.toString(users));
        }

        sendHttpRequest(URI_STRING);

        testAdmin();

        testDb();
    }

    public static List<Audiobook> initAudiobooks() {
        List<Audiobook> audiobooks = new ArrayList<>();

        Audiobook audiobook0 = new Audiobook.Builder()
                .setTitle("The Lord of the Rings")
                .setReleaseDate(new Date(1954, Calendar.JANUARY, 29))
                .setDuration(LocalTime.of(0, 0))
                .setAuthor("J.R.R. Tolkien")
                .setNarrator("Rob Inglis")
                .setHasBackgroundMusic(true)
                .setPublisher("Allen & Unwin")
                .setGenre("Fantasy")
                .build();

        Audiobook audiobook1 = new Audiobook.Builder()
                .setTitle("Sapiens: A Brief History of Humankind")
                .setReleaseDate(new Date(2011, Calendar.JANUARY, 1))
                .setDuration(LocalTime.of(0, 0))
                .setAuthor("Yuval Noah Harari")
                .setNarrator("Rob Inglis")
                .setHasBackgroundMusic(true)
                .setPublisher("HarperCollins")
                .setGenre("History")
                .build();

        Audiobook audiobook2 = new Audiobook.Builder()
                .setTitle("The Hitchhiker's Guide to the Galaxy")
                .setReleaseDate(new Date(1979, Calendar.JANUARY, 1))
                .setDuration(LocalTime.of(0, 0))
                .setAuthor("Douglas Adams")
                .setNarrator("Stephen Fry")
                .setHasBackgroundMusic(true)
                .setPublisher("Pan Books")
                .setGenre("Science Fiction")
                .build();

        Audiobook audiobook3 = new Audiobook.Builder()
                .setTitle("The Hobbit")
                .setReleaseDate(new Date(1937, Calendar.JANUARY, 21))
                .setDuration(LocalTime.of(0, 0))
                .setAuthor("J.R.R. Tolkien")
                .setNarrator("Rob Inglis")
                .setHasBackgroundMusic(true)
                .setPublisher("Allen & Unwin")
                .setGenre("Fantasy")
                .build();

        Audiobook audiobook4 = new Audiobook.Builder()
                .setTitle("The Alchemist")
                .setReleaseDate(new Date(1988, Calendar.JANUARY, 1))
                .setDuration(LocalTime.of(0, 0))
                .setAuthor("Paulo Coelho")
                .setNarrator("Jeremy Irons")
                .setHasBackgroundMusic(true)
                .setPublisher("HarperCollins")
                .setGenre("Fantasy")
                .build();

        audiobooks.add(audiobook0);
        audiobooks.add(audiobook1);
        audiobooks.add(audiobook2);
        audiobooks.add(audiobook3);
        audiobooks.add(audiobook4);

        return audiobooks;
    }


    public static List<Song> initSongs() {
        List<Song> songs = new LinkedList<>();

        songs.add(new Song.Builder()
                .setTitle("The Sound of Silence")
                .setReleaseDate(Date.from(LocalDate.of(1964, Month.JANUARY, 1).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .setDuration(LocalTime.of(0, 0))
                .setGenre("Folk rock")
                .setAlbum("Sounds of Silence")
                .setArtist("Simon & Garfunkel")
                .setLyrics("Hello darkness, my old friend...")
                .build());

        songs.add(new Song.Builder()
                .setTitle("Believer")
                .setReleaseDate(Date.from(LocalDate.of(2017, Month.FEBRUARY, 1).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .setDuration(LocalTime.of(0, 0))
                .setGenre("Pop rock")
                .setAlbum("Evolve")
                .setArtist("Imagine Dragons")
                .setLyrics("First things first...")
                .build());

        songs.add(new Song.Builder()
                .setTitle("The Scientist")
                .setReleaseDate(Date.from(LocalDate.of(2002, Month.NOVEMBER, 1).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .setDuration(LocalTime.of(0, 0))
                .setGenre("Alternative rock")
                .setAlbum("A Rush of Blood to the Head")
                .setArtist("Coldplay")
                .setLyrics("Come up to meet you, tell you I'm sorry...")
                .build());

        songs.add(new Song.Builder()
                .setTitle("Bohemian Rhapsody")
                .setReleaseDate(Date.from(LocalDate.of(1975, Month.NOVEMBER, 1).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .setDuration(LocalTime.of(0, 0))
                .setGenre("Progressive rock")
                .setAlbum("A Night at the Opera")
                .setArtist("Queen")
                .setLyrics("Is this the real life? Is this just fantasy?...")
                .build());

        songs.add(new Song.Builder()
                .setTitle("Hotel California")
                .setReleaseDate(Date.from(LocalDate.of(1976, Month.DECEMBER, 1).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .setDuration(LocalTime.of(0, 0))
                .setGenre("Soft rock")
                .setAlbum("Hotel California")
                .setArtist("Eagles")
                .setLyrics("On a dark desert highway, cool wind in my hair...")
                .build());

        return songs;
    }


    public static List<Podcast> initPodcasts() {
        List<Podcast> podcasts = new LinkedList<>();

        Podcast podcast0 = new Podcast.Builder()
                .setTitle("My Podcast")
                .setReleaseDate(new Date())
                .setDuration(LocalTime.of(1, 30))
                .setGenre("Technology")
                .setGuests(new String[]{"John", "Jane"})
                .setTopics(new String[]{"Artificial Intelligence", "Blockchain"})
                .build();

        Podcast podcast1 = new Podcast.Builder()
                .setTitle("The Joe Rogan Experience")
                .setReleaseDate(new Date(2009, Calendar.JANUARY, 1))
                .setDuration(LocalTime.of(0, 0))
                .setGenre("All of 'em. He's Joe Rogan")
                .setGuests(new String[]{"Joe Rogan", "Brian Redban", "Jamie Kennedy", "Joe DeRosa"})
                .setTopics(new String[]{"Comedy", "Politics"})
                .build();

        Podcast podcast2 = new Podcast.Builder()
                .setTitle("The Daily")
                .setReleaseDate(new Date(2019, Calendar.JANUARY, 1))
                .setDuration(LocalTime.of(0, 0))
                .setGenre("News")
                .setGuests(new String[]{"Michael Barbaro"})
                .setTopics(new String[]{"News"})
                .build();

        Podcast podcast3 = new Podcast.Builder()
                .setTitle("The Tim Ferriss Show")
                .setReleaseDate(new Date(2012, Calendar.JANUARY, 1))
                .setDuration(LocalTime.of(0, 0))
                .setGenre("Business")
                .setGuests(new String[]{"Tim Ferriss"})
                .setTopics(new String[]{"Business"})
                .build();

        Podcast podcast4 = new Podcast.Builder()
                .setTitle("Trash Taste")
                .setReleaseDate(new Date(2017, Calendar.JANUARY, 1))
                .setDuration(LocalTime.of(0, 0))
                .setGenre("Anime")
                .setGuests(new String[]{"Trash Taste"})
                .setTopics(new String[]{"Anime"})
                .build();

        podcasts.add(podcast0);
        podcasts.add(podcast1);
        podcasts.add(podcast2);
        podcasts.add(podcast3);
        podcasts.add(podcast4);

        return podcasts;
    }


    public static <T> void displayContent(List<T> contents, String extraInfo) {
        contents.forEach(content -> LOGGER.info(content.toString()));
        if (extraInfo != null) {
            LOGGER.info(extraInfo);
        }
    }

    public static void useAudiobookService(List<Audiobook> audiobooks) {
        AudiobookServiceImpl audiobookService = new AudiobookServiceImpl();
        audiobookService.getAllAudiobooksSortedByTitle(audiobooks)
                .forEach(audiobook -> LOGGER.info(audiobook.getTitle()));
    }

    public static void useSongService(List<Song> songs) {
        SongServiceImpl songService = new SongServiceImpl();
        songService.getAllSongsWithSongTitle(songs, "Hotel California")
                .forEach(song -> LOGGER.info(song.getTitle()));

        songService.getAllSongArtists(songs).forEach(LOGGER::info);
    }

    public static void usePodcastService(List<Podcast> podcasts) {
        PodcastServiceImpl podcastService = new PodcastServiceImpl();
        podcastService.getAllPodcastsSortedByTitle(podcasts)
                .forEach(podcast -> LOGGER.info(podcast.getTitle()));

        podcastService.getAllPodcastsSortedByGuests(podcasts)
                .forEach(podcast -> LOGGER.info(Arrays.toString(podcast.getGuests())));
    }

    public static Playlist[] createPlaylists(List<Song> songs) {
        if (songs.isEmpty()) {
            throw new IllegalArgumentException("Song list cannot be empty");
        }

        Playlist[] playlists = new Playlist[5];
        Random random = new Random();
        int songsPerPlaylist = 2;

        for (int i = 0; i < playlists.length; i++) {
            Collections.shuffle(songs);

            List<Song> playlistSongs = new ArrayList<>();
            for (int j = 0; j < songsPerPlaylist && j < songs.size(); j++) {
                playlistSongs.add(songs.get(j));
            }

            playlists[i] = new Playlist(
                    "Playlist " + i,
                    "Playlist " + i + " description ",
                    "C:\\Users\\aopat\\Documents\\GitHub\\PAO_Java_2023\\Tema1\\photos\\Playlist" + i + ".jpg",
                    List.of(playlistSongs.toArray(new Song[0])),
                    random.nextBoolean()
            );
        }

        return playlists;
    }


    public static User createUser(Playlist[] playlists) {
        return new User.UserBuilder("John", "Doe")
                .firstName("Mike")
                .lastName("Doe")
                .email("mikedoe@hotmail.com")
                .phoneNumber("40203020323")
                .address("St. John's Road 23")
                .city("London")
                .country("UK")
                .birthDate(new Date(1990, Calendar.JANUARY, 1))
                .profilePictureFilePath("C:\\Users\\aopat\\Documents\\GitHub\\PAO_Java_2023\\Tema1\\photos\\Playlist0.jpg")
                .userType(UserType.USER)
                .playlists(playlists)
                .build();
    }


    private static void writePlaylistsToCSV(Playlist[] playlists) throws IOException {
        String CSV_SEPARATOR = ",";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Main.CSV_FILE_NAME))) {
            writer.write("Name,Description,CoverPictureFilePath,Songs,IsPublic\n");
            for (Playlist playlist : playlists) {
                if (playlist != null) {
                    writer.write(convertPlaylistToCSVLine(playlist, CSV_SEPARATOR));
                }
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Failed to write playlists to CSV", e);
            throw e;
        }
    }

    private static String convertPlaylistToCSVLine(Playlist playlist, String separator) {
        if (playlist == null) {
            return "";
        }
        StringBuilder oneLine = new StringBuilder();
        oneLine.append(playlist.name()).append(separator);
        oneLine.append(playlist.description()).append(separator);
        oneLine.append(playlist.coverPictureFilePath()).append(separator);
        Song[] songs = playlist.Songs();
        oneLine.append("\"");
        for (int i = 0; i < songs.length; i++) {
            oneLine.append(songs[i].getTitle());
            if (i < songs.length - 1) {
                oneLine.append(";");
            }
        }
        oneLine.append("\"").append(separator);
        oneLine.append(playlist.isPublic() ? "Public" : "Private");
        oneLine.append("\n");
        return oneLine.toString();
    }


    private static User[] readUsersFromJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User[] users;
        try {
            users = mapper.readValue(new File(JSON_FILE_NAME), User[].class);
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "Failed to read users from JSON", ex);
            throw ex;
        }
        return users;
    }

    private static void writeUsersToJson(User[] users) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(JSON_FILE_NAME), users);
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "Failed to write users to JSON", ex);
            throw ex;
        }
    }


    public static void sendHttpRequest(String uriString) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uriString))
                .build();

        LOGGER.log(Level.INFO, "Sending HTTP request to {0}", uriString);

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            LOGGER.log(Level.INFO, "HTTP request successfully sent to {0}", uriString);
            LOGGER.log(Level.INFO, "Response status code: {0}", response.statusCode());
            LOGGER.log(Level.INFO, "Response headers: {0}", response.headers().map());

        } catch (IOException | InterruptedException e) {
            LOGGER.log(Level.SEVERE, "Error during HTTP request to ", e);
            Thread.currentThread().interrupt();
        }
    }

    public static void testAdmin() {/*Sealed singleton*/
        Admin<?> admin = Admin.getInstance("admin123", "password", "John", "Doe", "admin@example.com",
                "1234567890", "123 Admin St", "City", "Country", new Date(), "profile.jpg",
                UserType.ADMIN, "Admin Details");

        String username = admin.getUsername();
        String email = admin.getEmail();

        LOGGER.log(Level.INFO, "Admin username: {0}", username);
        LOGGER.log(Level.INFO, "Admin email: {0}", email);

        SuperAdmin superAdmin = SuperAdmin.getInstance();
        String superAdminUsername = superAdmin.getUsername();
        String superAdminEmail = superAdmin.getEmail();

        LOGGER.log(Level.INFO, "SuperAdmin username: {0}", superAdminUsername);
        LOGGER.log(Level.INFO, "SuperAdmin email: {0}", superAdminEmail);
    }

    public static void testDb() {
        DatabaseConfig dbConfig = new DatabaseConfig("jdbc:mysql://localhost:3306/pao_2023", "root", "2875");

        dbConfig.createTables();

        Song newSong = new Song.Builder()
                .setTitle("Song Title")
                .setReleaseDate(new Date())
                .setDuration(LocalTime.of(0, 3, 30))
                .setGenre("Genre")
                .setAlbum("Album")
                .setArtist("Artist")
                .setLyrics("Lyrics")
                .build();

        int songId = dbConfig.createSong(newSong);
        if (songId == -1) {
            System.err.println("Error creating the song.");
            return;
        }

        Song readSong = dbConfig.readSong(songId);
        if (readSong != null) {
            System.out.println("Song was read from the database: " + readSong.getTitle());
        }

        if (readSong != null) {
            readSong = new Song.Builder()
                    .setTitle("Updated Song Title")
                    .setReleaseDate(readSong.getReleaseDate())
                    .setDuration(readSong.getDuration())
                    .setGenre(readSong.getGenre())
                    .setAlbum(readSong.getAlbum())
                    .setArtist(readSong.getArtist())
                    .setLyrics(readSong.getLyrics())
                    .build();

            dbConfig.updateSong(songId, readSong);
        }

        dbConfig.deleteSong(songId);

        dbConfig.closeConnection();
    }

}

