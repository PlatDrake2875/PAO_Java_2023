package ro.pao.model.records;

import ro.pao.repository.Song;
import ro.pao.service.interfaces.Playable;

import java.util.ArrayList;
import java.util.List;

public record Playlist(String name,
                       String description,
                       String coverPictureFilePath,
                       List<Playable> playables,
                       boolean isPublic) implements Playable {

    public Playlist {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Playlist name cannot be null or empty!");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Playlist description cannot be null or empty!");
        }
        if (coverPictureFilePath == null || coverPictureFilePath.isBlank()) {
            throw new IllegalArgumentException("Playlist cover picture file path cannot be null or empty!");
        }
        if (playables == null || playables.isEmpty()) {
            throw new IllegalArgumentException("Playlist playables cannot be null or empty!");
        }
    }

    @Override
    public void play() {
        for (Playable playable : playables) {
            playable.play();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Playlist playlist = (Playlist) o;

        if (isPublic != playlist.isPublic) return false;
        if (!name.equals(playlist.name)) return false;
        if (!description.equals(playlist.description)) return false;
        if (!coverPictureFilePath.equals(playlist.coverPictureFilePath)) return false;
        return playables.equals(playlist.playables);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + coverPictureFilePath.hashCode();
        result = 31 * result + playables.hashCode();
        result = 31 * result + (isPublic ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", coverPictureFilePath='" + coverPictureFilePath + '\'' +
                ", playables=" + playables +
                ", isPublic=" + isPublic +
                '}';
    }

    public List<Song> extractSongs() {
        List<Song> songs = new ArrayList<>();
        for (Playable playable : playables) {
            if (playable instanceof Song) {
                songs.add((Song) playable);
            }
        }
        return songs;
    }

    public Song[] Songs() {
        List<Song> songs = extractSongs();
        return songs.toArray(new Song[songs.size()]);
    }

}
