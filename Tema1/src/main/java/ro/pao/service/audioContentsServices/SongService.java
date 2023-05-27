package ro.pao.service.audioContentsServices;

import ro.pao.model.audioContents.Song;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public interface SongService {

    void play();

    void pause();

    void stop();

    void next();

    void previous();

    void shuffle();

    void repeat();

    void addToPlaylist();

    void removeFromPlaylist();

    void addToFavorite();

    void removeFromFavorite();

    void addToHistory();

    void removeFromHistory();

    void addToQueue();

    void removeFromQueue();

    void addToLibrary();

    void removeFromLibrary();

    void addToPlaylist(String playlistTitle);

    void removeFromPlaylist(String playlistTitle);

    void addToFavorite(String songTitle);

    void removeFromFavorite(String songTitle);

    void addToHistory(String songTitle);

    void removeFromHistory(String songTitle);

    void addToQueue(String songTitle);

    void removeFromQueue(String songTitle);

    void addToLibrary(String songTitle);

    void removeFromLibrary(String songTitle);


    //Getters
    List<String> getAllSongTitles(List<Song> songs);

    List<String> getAllSongArtists(List<Song> songs);

    List<String> getAllSongAlbums(List<Song> songs);

    List<String> getAllSongGenres(List<Song> songs);

    List<String> getAllSongDurations(List<Song> songs);

    List<String> getAllSongReleaseDates(List<Song> songs);

    List<String> getAllSongLyrics(List<Song> songs);


    //Unique Getters
    Set<String> getAllUniqueSongTitles(List<Song> songs);

    Set<String> getAllUniqueSongArtists(List<Song> songs);

    Set<String> getAllUniqueSongAlbums(List<Song> songs);

    Set<String> getAllUniqueSongGenres(List<Song> songs);

    Set<String> getAllUniqueSongDurations(List<Song> songs);

    Set<String> getAllUniqueSongReleaseDates(List<Song> songs);

    Set<String> getAllUniqueSongLyrics(List<Song> songs);


    // Query Methods

    String getLongestSongTitle(List<Song> songs);

    String getShortestSongTitle(List<Song> songs);

    String getLongestSongArtist(List<Song> songs);

    String getShortestSongArtist(List<Song> songs);

    String getLongestSongAlbum(List<Song> songs);

    String getShortestSongAlbum(List<Song> songs);

    String getLongestSongGenre(List<Song> songs);

    String getShortestSongGenre(List<Song> songs);

    String getLongestSongDuration(List<Song> songs);

    String getShortestSongDuration(List<Song> songs);

    String getLongestSongReleaseDate(List<Song> songs);

    String getShortestSongReleaseDate(List<Song> songs);

    String getLongestSongLyric(List<Song> songs);

    String getShortestSongLyric(List<Song> songs);



    //Sortings
    List<Song> getAllSongsSortedBySongTitle(List<Song> songs);

    List<Song> getAllSongsSortedBySongArtist(List<Song> songs);

    List<Song> getAllSongsSortedBySongAlbum(List<Song> songs);

    List<Song> getAllSongsSortedBySongGenre(List<Song> songs);

    List<Song> getAllSongsSortedBySongDuration(List<Song> songs);

    List<Song> getAllSongsSortedBySongReleaseDate(List<Song> songs);

    //Filters
    List<Song> getAllSongsWithSongTitle(List<Song> songs, String songTitle);

    List<Song> getAllSongsWithSongArtist(List<Song> songs, String songArtist);

    List<Song> getAllSongsWithSongAlbum(List<Song> songs, String songAlbum);

    List<Song> getAllSongsWithSongGenre(List<Song> songs, String songGenre);

    List<Song> getAllSongsByMinSongDuration(List<Song> songs, String songDuration);

    List<Song> getAllSongsByMaxSongReleaseDate(List<Song> songs, String songReleaseDate) throws ParseException;

    List<Song> getAllSongsByMinSongReleaseDate(List<Song> songs, String songReleaseDate) throws ParseException;



    //Groupings
    HashMap<String, List<Song>> getAllSongsGroupedBySongTitle(List<Song> songs);

    HashMap<String, List<Song>> getAllSongsGroupedBySongArtist(List<Song> songs);

    HashMap<String, List<Song>> getAllSongsGroupedBySongAlbum(List<Song> songs);

    HashMap<String, List<Song>> getAllSongsGroupedBySongGenre(List<Song> songs);

    HashMap<String, List<Song>> getAllSongsGroupedBySongDuration(List<Song> songs);

    HashMap<String, List<Song>> getAllSongsGroupedBySongReleaseDate(List<Song> songs);


    void printAllSongTitlesWithIterator(List<Song> songs);

    void printAllSongTitlesWithSpliterator(List<Song> songs);
}
