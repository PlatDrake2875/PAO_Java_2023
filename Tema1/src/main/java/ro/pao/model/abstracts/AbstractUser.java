package ro.pao.model.abstracts;

import ro.pao.model.enums.UserType;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
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
    private BufferedImage profilePicture;
    private UserType type;

    public AbstractUser(String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, String city, String country, Date birthDate, String profilePictureFilePath, UserType type) {
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
        try {
            this.profilePicture = ImageIO.read(new File(profilePictureFilePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    public BufferedImage getProfilePicture() {
        return profilePicture;
    }

    public UserType getType() {
        return type;
    }

    // SETTERS
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setProfilePictureFilePath(String profilePictureFilePath) {
        this.profilePictureFilePath = profilePictureFilePath;
    }

    public void setProfilePicture(BufferedImage profilePicture) {
        this.profilePicture = profilePicture;
    }
}
