package ro.pao.model.users;

import ro.pao.model.abstracts.AbstractUser;
import ro.pao.model.enums.UserType;
import ro.pao.model.records.Playlist;

import java.util.Date;

public class User extends AbstractUser {

    private Playlist[] playlists;

    public User() {
        super();
    }
    private User(UserBuilder builder) {
        super(builder.username, builder.password, builder.firstName, builder.lastName, builder.email,
                builder.phoneNumber, builder.address, builder.city, builder.country, builder.birthDate,
                builder.profilePictureFilePath, builder.type);
        this.playlists = builder.playlists;
    }

    public Playlist[] getPlaylists() {
        return playlists;
    }

    public static class UserBuilder {
        private String username;
        private String password;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String address;
        private String city;
        private String country;
        private Date birthDate;
        private String profilePictureFilePath;
        private UserType type;
        private Playlist[] playlists;

        public UserBuilder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder city(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder country(String country) {
            this.country = country;
            return this;
        }

        public UserBuilder birthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public UserBuilder profilePictureFilePath(String profilePictureFilePath) {
            this.profilePictureFilePath = profilePictureFilePath;
            return this;
        }

        public UserBuilder userType(UserType type) {
            this.type = type;
            return this;
        }

        public UserBuilder playlists(Playlist[] playlists) {
            this.playlists = playlists;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
