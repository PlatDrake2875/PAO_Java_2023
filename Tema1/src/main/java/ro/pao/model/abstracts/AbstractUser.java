package ro.pao.model.abstracts;

import ro.pao.model.enums.UserType;

import java.util.Date;

public abstract class AbstractUser {
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

    public AbstractUser() {

    }

    public abstract static class UserBuilder<B extends UserBuilder<B>> {
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

        protected abstract B self();

        public B username(String username) {
            this.username = username;
            return self();
        }

        public B password(String password) {
            this.password = password;
            return self();
        }

        public B firstName(String firstName) {
            this.firstName = firstName;
            return self();
        }

        public B lastName(String lastName) {
            this.lastName = lastName;
            return self();
        }

        public B email(String email) {
            this.email = email;
            return self();
        }

        public B phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return self();
        }

        public B address(String address) {
            this.address = address;
            return self();
        }

        public B city(String city) {
            this.city = city;
            return self();
        }

        public B country(String country) {
            this.country = country;
            return self();
        }

        public B birthDate(Date birthDate) {
            this.birthDate = birthDate;
            return self();
        }

        public B profilePictureFilePath(String profilePictureFilePath) {
            this.profilePictureFilePath = profilePictureFilePath;
            return self();
        }

        public B userType(UserType type) {
            this.type = type;
            return self();
        }

        public AbstractUser build() {
            return new AbstractUser(username, password, firstName, lastName, email, phoneNumber, address, city, country, birthDate, profilePictureFilePath, type) {
                protected AbstractUser self() {
                    return this;
                }
            };
        }
    }

    protected AbstractUser(String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, String city, String country, Date birthDate, String profilePictureFilePath, UserType type) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.country = country;
        this.birthDate = birthDate;
        this.profilePictureFilePath = profilePictureFilePath;
        this.type = type;
    }

    // GETTERS
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getProfilePictureFilePath() {
        return profilePictureFilePath;
    }

    public UserType getType() {
        return type;
    }
}
