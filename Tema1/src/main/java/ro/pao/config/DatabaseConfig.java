package ro.pao.config;

import ro.pao.repository.Song;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConfig {
    private static final Logger LOGGER = Logger.getLogger(DatabaseConfig.class.getName());

    private Connection connection;
    private Statement stmt;

    public DatabaseConfig(String url, String username, String password) {
        try {
            connection = DriverManager.getConnection(url, username, password);
            stmt = connection.createStatement();

            LOGGER.log(Level.INFO, "Connected to the MySQL database!");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error connecting to the MySQL database:", e);
        }
    }

    public void closeConnection() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error closing the MySQL database connection:", e);
        }
    }

    public void createTables() {
        createSongTable();
        createAudiobookTable();
        createPodcastTable();
    }

    private void createSongTable() {
        String createSongTableSQL = """
                CREATE TABLE IF NOT EXISTS songs (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    title VARCHAR(255) NOT NULL,
                    artist VARCHAR(255) NOT NULL,
                    album VARCHAR(255),
                    genre VARCHAR(255),
                    lyrics TEXT,
                    release_date DATE,
                    duration TIME
                )
                """;
        try {
            stmt.execute(createSongTableSQL);
            LOGGER.log(Level.INFO, "Table 'songs' created successfully");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error creating 'songs' table:", e);
        }
    }

    private void createAudiobookTable() {
        String createAudiobookTableSQL = """
                CREATE TABLE IF NOT EXISTS audiobooks (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    title VARCHAR(255) NOT NULL,
                    author VARCHAR(255) NOT NULL,
                    narrator VARCHAR(255),
                    duration TIME,
                    release_date DATE,
                    book_format VARCHAR(255)
                )
                """;

        try {
            stmt.execute(createAudiobookTableSQL);
            LOGGER.log(Level.INFO, "Table 'audiobooks' created successfully");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error creating 'audiobooks' table:", e);
        }
    }

    private void createPodcastTable() {
        String createPodcastTableSQL = """
                CREATE TABLE IF NOT EXISTS podcasts (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    title VARCHAR(255) NOT NULL,
                    host VARCHAR(255) NOT NULL,
                    duration TIME,
                    release_date DATE,
                    topic VARCHAR(255)
                )
                """;

        try {
            stmt.execute(createPodcastTableSQL);
            LOGGER.log(Level.INFO, "Table 'podcasts' created successfully");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error creating 'podcasts' table:", e);
        }
    }

    public int createSong(Song song) {
        String createSongSQL = "INSERT INTO songs(title, artist, album, genre, lyrics, release_date, duration) VALUES(?,?,?,?,?,?,?)";
        try (PreparedStatement pstmt = connection.prepareStatement(createSongSQL, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, song.getTitle());
            pstmt.setString(2, song.getArtist());
            pstmt.setString(3, song.getAlbum());
            pstmt.setString(4, song.getGenre());
            pstmt.setString(5, song.getLyrics());
            pstmt.setDate(6, new java.sql.Date(song.getReleaseDate().getTime()));
            pstmt.setObject(7, song.getDuration());

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating song failed, no rows affected.");
            }

            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int id = generatedKeys.getInt(1);
                    LOGGER.log(Level.INFO, "Song created successfully with id: " + id);
                    return id;
                } else {
                    throw new SQLException("Creating song failed, no ID obtained.");
                }
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error creating song:", e);
        }

        return -1; // indicating there was an error
    }

    public Song readSong(int id) {
        String readSongSQL = "SELECT * FROM songs WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(readSongSQL)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Song song = new Song.Builder()
                        .setTitle(rs.getString("title"))
                        .setArtist(rs.getString("artist"))
                        .setAlbum(rs.getString("album"))
                        .setGenre(rs.getString("genre"))
                        .setLyrics(rs.getString("lyrics"))
                        .setReleaseDate(new java.util.Date(rs.getDate("release_date").getTime()))
                        .setDuration(rs.getObject("duration", java.time.LocalTime.class))
                        .build();

                LOGGER.log(Level.INFO, "Song read successfully");
                return song;
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error reading song:", e);
        }
        return null;
    }

    public void updateSong(int id, Song song) {
        String updateSongSQL = "UPDATE songs SET title = ?, artist = ?, album = ?, genre = ?, lyrics = ?, release_date = ?, duration = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(updateSongSQL)) {
            pstmt.setString(1, song.getTitle());
            pstmt.setString(2, song.getArtist());
            pstmt.setString(3, song.getAlbum());
            pstmt.setString(4, song.getGenre());
            pstmt.setString(5, song.getLyrics());
            pstmt.setDate(6, new java.sql.Date(song.getReleaseDate().getTime()));
            pstmt.setObject(7, song.getDuration());
            pstmt.setInt(8, id);

            pstmt.executeUpdate();

            LOGGER.log(Level.INFO, "Song updated successfully");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error updating song:", e);
        }
    }

    public void deleteSong(int id) {
        String deleteSongSQL = "DELETE FROM songs WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(deleteSongSQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            LOGGER.log(Level.INFO, "Song deleted successfully");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error deleting song:", e);
        }
    }
}
