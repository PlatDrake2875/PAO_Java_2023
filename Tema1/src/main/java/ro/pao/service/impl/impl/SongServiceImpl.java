package ro.pao.service.impl.impl;

import ro.pao.repository.Song;
import ro.pao.service.interfaces.SongService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class SongServiceImpl implements SongService {

    private static final Logger LOGGER = Logger.getLogger(SongServiceImpl.class.getName());

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void next() {

    }

    @Override
    public void previous() {

    }

    @Override
    public void shuffle() {

    }

    @Override
    public void repeat() {

    }

    @Override
    public void addToPlaylist() {

    }

    @Override
    public void removeFromPlaylist() {

    }

    @Override
    public void addToFavorite() {

    }

    @Override
    public void removeFromFavorite() {

    }

    @Override
    public void addToHistory() {

    }

    @Override
    public void removeFromHistory() {

    }

    @Override
    public void addToQueue() {

    }

    @Override
    public void removeFromQueue() {

    }

    @Override
    public void addToLibrary() {

    }

    @Override
    public void removeFromLibrary() {

    }

    @Override
    public void addToPlaylist(String playlistTitle) {

    }

    @Override
    public void removeFromPlaylist(String playlistTitle) {

    }

    @Override
    public void addToFavorite(String songTitle) {

    }

    @Override
    public void removeFromFavorite(String songTitle) {

    }

    @Override
    public void addToHistory(String songTitle) {

    }

    @Override
    public void removeFromHistory(String songTitle) {

    }

    @Override
    public void addToQueue(String songTitle) {

    }

    @Override
    public void removeFromQueue(String songTitle) {

    }

    @Override
    public void addToLibrary(String songTitle) {

    }

    @Override
    public void removeFromLibrary(String songTitle) {

    }

    @Override
    public List<String> getAllSongTitles(List<Song> songs) {
        List<String> songTitles = new ArrayList<>();
        for (Song song : songs) {
            songTitles.add(song.getTitle());
        }
        return songTitles;
    }

    @Override
    public List<String> getAllSongArtists(List<Song> songs) {
        List<String> songArtists = new ArrayList<>();
        for (Song song : songs) {
            songArtists.add(song.getArtist());
        }
        return songArtists;
    }

    @Override
    public List<String> getAllSongAlbums(List<Song> songs) {
        List<String> songAlbums = new ArrayList<>();
        for (Song song : songs) {
            songAlbums.add(song.getAlbum());
        }
        return songAlbums;
    }

    @Override
    public List<String> getAllSongGenres(List<Song> songs) {
        List<String> songGenres = new ArrayList<>();
        for (Song song : songs) {
            songGenres.add(song.getGenre());
        }
        return songGenres;
    }

    @Override
    public List<String> getAllSongDurations(List<Song> songs) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return songs.stream()
                .map(song -> song.getDuration().format(formatter))
                .collect(Collectors.toList());
    }


    @Override
    public List<String> getAllSongReleaseDates(List<Song> songs) {
        List<String> songReleaseDates = new ArrayList<>();
        for (Song song : songs) {
            songReleaseDates.add(song.getReleaseDate().toString());
        }
        return songReleaseDates;
    }

    @Override
    public List<String> getAllSongLyrics(List<Song> songs) {
        List<String> songLyrics = new ArrayList<>();
        for (Song song : songs) {
            songLyrics.add(song.getLyrics());
        }
        return songLyrics;
    }


    @Override
    public Set<String> getAllUniqueSongTitles(List<Song> songs) {
        Set<String> uniqueSongTitles = new HashSet<>();
        for (Song song : songs) {
            uniqueSongTitles.add(song.getTitle());
        }
        return uniqueSongTitles;
    }

    @Override
    public Set<String> getAllUniqueSongArtists(List<Song> songs) {
        Set<String> uniqueSongArtists = new HashSet<>();
        for (Song song : songs) {
            uniqueSongArtists.add(song.getArtist());
        }
        return uniqueSongArtists;
    }

    @Override
    public Set<String> getAllUniqueSongAlbums(List<Song> songs) {
        Set<String> uniqueSongAlbums = new HashSet<>();
        for (Song song : songs) {
            uniqueSongAlbums.add(song.getAlbum());
        }
        return uniqueSongAlbums;
    }

    @Override
    public Set<String> getAllUniqueSongGenres(List<Song> songs) {
        Set<String> uniqueSongGenres = new HashSet<>();
        for (Song song : songs) {
            uniqueSongGenres.add(song.getGenre());
        }
        return uniqueSongGenres;
    }

    @Override
    public Set<String> getAllUniqueSongDurations(List<Song> songs) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return songs.stream()
                .map(song -> song.getDuration().format(formatter))
                .collect(Collectors.toSet());
    }


    @Override
    public Set<String> getAllUniqueSongReleaseDates(List<Song> songs) {
        Set<String> uniqueSongReleaseDates = new HashSet<>();
        for (Song song : songs) {
            uniqueSongReleaseDates.add(song.getReleaseDate().toString());
        }
        return uniqueSongReleaseDates;
    }

    @Override
    public Set<String> getAllUniqueSongLyrics(List<Song> songs) {
        Set<String> uniqueSongLyrics = new HashSet<>();
        for (Song song : songs) {
            uniqueSongLyrics.add(song.getLyrics());
        }
        return uniqueSongLyrics;
    }


    @Override
    public String getLongestSongTitle(List<Song> songs) {
        return songs.stream()
                .map(Song::getTitle)
                .max(Comparator.naturalOrder())
                .orElse("");
    }

    @Override
    public String getShortestSongTitle(List<Song> songs) {
        Optional<String> shortestSongTitle = songs.stream()
                .map(Song::getTitle)
                .min(Comparator.naturalOrder());
        return shortestSongTitle.orElse("");
    }

    @Override
    public String getLongestSongArtist(List<Song> songs) {
        Optional<String> longestSongArtist = songs.stream()
                .map(Song::getArtist)
                .max(Comparator.naturalOrder());
        return longestSongArtist.orElse("");
    }

    @Override
    public String getShortestSongArtist(List<Song> songs) {
        Optional<String> shortestSongArtist = songs.stream()
                .map(Song::getArtist)
                .min(Comparator.naturalOrder());
        return shortestSongArtist.orElse("");
    }

    @Override
    public String getLongestSongAlbum(List<Song> songs) {
        Optional<String> longestSongAlbum = songs.stream()
                .map(Song::getAlbum)
                .max(Comparator.naturalOrder());
        return longestSongAlbum.orElse("");
    }

    @Override
    public String getShortestSongAlbum(List<Song> songs) {
        Optional<String> shortestSongAlbum = songs.stream()
                .map(Song::getAlbum)
                .min(Comparator.naturalOrder());
        return shortestSongAlbum.orElse("");
    }

    @Override
    public String getLongestSongGenre(List<Song> songs) {
        Optional<String> longestSongGenre = songs.stream()
                .map(Song::getGenre)
                .max(Comparator.naturalOrder());
        return longestSongGenre.orElse("");
    }

    @Override
    public String getShortestSongGenre(List<Song> songs) {
        Optional<String> shortestSongGenre = songs.stream()
                .map(Song::getGenre)
                .min(Comparator.naturalOrder());
        return shortestSongGenre.orElse("");
    }

    @Override
    public String getLongestSongDuration(List<Song> songs) {
        Optional<String> longestSongDuration = songs.stream()
                .map(Song::getDuration)
                .max(LocalTime::compareTo)
                .map(LocalTime::toString);
        return longestSongDuration.orElse("");
    }

    @Override
    public String getShortestSongDuration(List<Song> songs) {
        Optional<String> shortestSongDuration = songs.stream()
                .map(Song::getDuration)
                .min(LocalTime::compareTo)
                .map(LocalTime::toString);
        return shortestSongDuration.orElse("");
    }

    @Override
    public String getLongestSongReleaseDate(List<Song> songs) {
        Optional<String> longestSongReleaseDate = songs.stream()
                .map(Song::getReleaseDate)
                .max(Date::compareTo)
                .map(Date::toString);
        return longestSongReleaseDate.orElse("");
    }

    @Override
    public String getShortestSongReleaseDate(List<Song> songs) {
        Optional<String> shortestSongReleaseDate = songs.stream()
                .map(Song::getReleaseDate)
                .min(Date::compareTo)
                .map(Date::toString);
        return shortestSongReleaseDate.orElse("");
    }

    @Override
    public String getLongestSongLyric(List<Song> songs) {
        Optional<String> longestSongLyric = songs.stream()
                .map(Song::getLyrics)
                .max(Comparator.naturalOrder());
        return longestSongLyric.orElse("");
    }

    @Override
    public String getShortestSongLyric(List<Song> songs) {
        Optional<String> shortestSongLyric = songs.stream()
                .map(Song::getLyrics)
                .min(Comparator.naturalOrder());
        return shortestSongLyric.orElse("");
    }


    @Override
    public List<Song> getAllSongsSortedBySongTitle(List<Song> songs) {
        return songs.stream()
                .sorted(Comparator.comparing(Song::getTitle))
                .collect(Collectors.toList());
    }

    @Override
    public List<Song> getAllSongsSortedBySongArtist(List<Song> songs) {
        return songs.stream()
                .sorted(Comparator.comparing(Song::getArtist))
                .collect(Collectors.toList());
    }

    @Override
    public List<Song> getAllSongsSortedBySongAlbum(List<Song> songs) {
        return songs.stream()
                .sorted(Comparator.comparing(Song::getAlbum))
                .collect(Collectors.toList());
    }

    @Override
    public List<Song> getAllSongsSortedBySongGenre(List<Song> songs) {
        return songs.stream()
                .sorted(Comparator.comparing(Song::getGenre))
                .collect(Collectors.toList());
    }

    @Override
    public List<Song> getAllSongsSortedBySongDuration(List<Song> songs) {
        return songs.stream()
                .sorted(Comparator.comparing(Song::getDuration))
                .collect(Collectors.toList());
    }

    @Override
    public List<Song> getAllSongsSortedBySongReleaseDate(List<Song> songs) {
        return songs.stream()
                .sorted(Comparator.comparing(Song::getReleaseDate))
                .collect(Collectors.toList());
    }

    @Override
    public List<Song> getAllSongsWithSongTitle(List<Song> songs, String songTitle) {
        return songs.stream()
                .filter(song -> song.getTitle().equals(songTitle))
                .collect(Collectors.toList());
    }

    @Override
    public List<Song> getAllSongsWithSongArtist(List<Song> songs, String songArtist) {
        return songs.stream()
                .filter(song -> song.getArtist().equals(songArtist))
                .collect(Collectors.toList());
    }

    @Override
    public List<Song> getAllSongsWithSongAlbum(List<Song> songs, String songAlbum) {
        return songs.stream()
                .filter(song -> song.getAlbum().equals(songAlbum))
                .collect(Collectors.toList());
    }

    @Override
    public List<Song> getAllSongsWithSongGenre(List<Song> songs, String songGenre) {
        return songs.stream()
                .filter(song -> song.getGenre().equals(songGenre))
                .collect(Collectors.toList());
    }

    @Override
    public List<Song> getAllSongsByMinSongDuration(List<Song> songs, String songDuration) {
        return songs.stream()
                .filter(song -> song.getDuration().isAfter(LocalTime.parse(songDuration)))
                .collect(Collectors.toList());
    }

    @Override
    public List<Song> getAllSongsByMinSongReleaseDate(List<Song> songs, String songReleaseDate) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date minReleaseDate = dateFormat.parse(songReleaseDate);
        return songs.stream()
                .filter(song -> song.getReleaseDate().after(minReleaseDate))
                .collect(Collectors.toList());
    }


    @Override
    public List<Song> getAllSongsByMaxSongReleaseDate(List<Song> songs, String songReleaseDate) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date maxReleaseDate = dateFormat.parse(songReleaseDate);
        return songs.stream()
                .filter(song -> song.getReleaseDate().before(maxReleaseDate))
                .collect(Collectors.toList());
    }

    @Override
    public HashMap<String, List<Song>> getAllSongsGroupedBySongTitle(List<Song> songs) {
        HashMap<String, List<Song>> songsGroupedByTitle = new HashMap<>();
        songs.forEach(song -> {
            if (songsGroupedByTitle.containsKey(song.getTitle())) {
                songsGroupedByTitle.get(song.getTitle()).add(song);
            } else {
                List<Song> songsList = new ArrayList<>();
                songsList.add(song);
                songsGroupedByTitle.put(song.getTitle(), songsList);
            }
        });
        return songsGroupedByTitle;
    }

    @Override
    public HashMap<String, List<Song>> getAllSongsGroupedBySongArtist(List<Song> songs) {
        HashMap<String, List<Song>> songsGroupedByArtist = new HashMap<>();
        songs.forEach(song -> {
            if (songsGroupedByArtist.containsKey(song.getArtist())) {
                songsGroupedByArtist.get(song.getArtist()).add(song);
            } else {
                List<Song> songsList = new ArrayList<>();
                songsList.add(song);
                songsGroupedByArtist.put(song.getArtist(), songsList);
            }
        });
        return songsGroupedByArtist;
    }

    @Override
    public HashMap<String, List<Song>> getAllSongsGroupedBySongAlbum(List<Song> songs) {
        HashMap<String, List<Song>> songsGroupedByAlbum = new HashMap<>();
        songs.forEach(song -> {
            if (songsGroupedByAlbum.containsKey(song.getAlbum())) {
                songsGroupedByAlbum.get(song.getAlbum()).add(song);
            } else {
                List<Song> songsList = new ArrayList<>();
                songsList.add(song);
                songsGroupedByAlbum.put(song.getAlbum(), songsList);
            }
        });
        return songsGroupedByAlbum;
    }

    @Override
    public HashMap<String, List<Song>> getAllSongsGroupedBySongGenre(List<Song> songs) {
        HashMap<String, List<Song>> songsGroupedByGenre = new HashMap<>();
        songs.forEach(song -> {
            if (songsGroupedByGenre.containsKey(song.getGenre())) {
                songsGroupedByGenre.get(song.getGenre()).add(song);
            } else {
                List<Song> songsList = new ArrayList<>();
                songsList.add(song);
                songsGroupedByGenre.put(song.getGenre(), songsList);
            }
        });
        return songsGroupedByGenre;
    }

    @Override
    public HashMap<String, List<Song>> getAllSongsGroupedBySongDuration(List<Song> songs) {
        HashMap<String, List<Song>> songsGroupedByDuration = new HashMap<>();
        songs.forEach(song -> {
            if (songsGroupedByDuration.containsKey(song.getDuration().toString())) {
                songsGroupedByDuration.get(song.getDuration().toString()).add(song);
            } else {
                List<Song> songsList = new ArrayList<>();
                songsList.add(song);
                songsGroupedByDuration.put(song.getDuration().toString(), songsList);
            }
        });
        return songsGroupedByDuration;
    }

    @Override
    public HashMap<String, List<Song>> getAllSongsGroupedBySongReleaseDate(List<Song> songs) {
        HashMap<String, List<Song>> songsGroupedByReleaseDate = new HashMap<>();
        songs.forEach(song -> {
            if (songsGroupedByReleaseDate.containsKey(song.getReleaseDate().toString())) {
                songsGroupedByReleaseDate.get(song.getReleaseDate().toString()).add(song);
            } else {
                List<Song> songsList = new ArrayList<>();
                songsList.add(song);
                songsGroupedByReleaseDate.put(song.getReleaseDate().toString(), songsList);
            }
        });
        return songsGroupedByReleaseDate;
    }
    public Map<String, List<Song>> groupSongsBy(Function<Song, String> classifier, List<Song> songs) {
        return songs.stream()
                .collect(Collectors.groupingBy(classifier));
    }


    @Override
    public void printAllSongTitlesWithIterator(List<Song> songs) {
        Iterator<Song> songIterator = songs.iterator();
        while (songIterator.hasNext()) {
            Song song = songIterator.next();
            LOGGER.log(Level.INFO, song.getTitle());
        }
    }

    @Override
    public void printAllSongTitlesWithSpliterator(List<Song> songs) {
        Spliterator<Song> songSpliterator = songs.spliterator();
        songSpliterator.forEachRemaining(song -> LOGGER.log(Level.INFO, song.getTitle()));
    }
}
