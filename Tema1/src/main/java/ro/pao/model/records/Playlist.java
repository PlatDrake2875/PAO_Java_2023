package ro.pao.model.records;

public record Playlist(String name, String description, String coverPictureFilePath, boolean isPublic) {
    public Playlist {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Playlist name cannot be null or empty");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Playlist description cannot be null or empty");
        }
        if (coverPictureFilePath == null || coverPictureFilePath.isBlank()) {
            throw new IllegalArgumentException("Playlist cover picture file path cannot be null or empty");
        }
    }

    public Playlist(String name, String description, String coverPictureFilePath) {
        this(name, description, coverPictureFilePath, false);
    }

}