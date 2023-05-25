package ro.pao.model.users;

import ro.pao.model.abstracts.AbstractUser;
import ro.pao.model.enums.UserType;
import ro.pao.model.records.Playlist;

import java.util.Date;

public class User extends AbstractUser {

    Playlist[] playlists;

    public User(String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, String city, String country, Date birthDate, String profilePictureFilePath, UserType type, Playlist[] playlists) {
        super(username, password, firstName, lastName, email, phoneNumber, address, city, country, birthDate, profilePictureFilePath, type);
        this.playlists = playlists;
    }

}
