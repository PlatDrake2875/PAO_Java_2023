package ro.pao.model.records;

import ro.pao.model.audioContents.Song;

public record Playlist(String name, String description, String coverPictureFilePath, Song[] Songs, boolean isPublic) {

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
        if (Songs == null || Songs.length == 0) {
            throw new IllegalArgumentException("Playlist songs cannot be null or empty!");
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
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return java.util.Arrays.equals(Songs, playlist.Songs);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + coverPictureFilePath.hashCode();
        result = 31 * result + java.util.Arrays.hashCode(Songs);
        result = 31 * result + (isPublic ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", coverPictureFilePath='" + coverPictureFilePath + '\'' +
                ", Songs=" + java.util.Arrays.toString(Songs) +
                ", isPublic=" + isPublic +
                '}';
    }
}