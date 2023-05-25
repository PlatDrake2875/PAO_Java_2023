package ro.pao.service.usersServices;

import ro.pao.model.users.Artist;

import java.util.List;
import java.util.Set;

public interface ArtistService {
    void login(String username, String password);

    void register(String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, String city, String country, String birthDate, String profilePictureFilePath, String type);

    void logout();

    // Getters
    List<String> getAllUsernames(List<Artist> artists);
    List<String> getAllfirstNames(List<Artist> artists);
    List<String> getAllLastNames(List<Artist> artists);
    List<String> getAllEmails(List<Artist> artists);
    List<String> getAllPhoneNumbers(List<Artist> artists);
    List<String> getAllAddresses(List<Artist> artists);
    List<String> getAllCities(List<Artist> artists);
    List<String> getAllCountries(List<Artist> artists);
    List<String> getAllBirthDates(List<Artist> artists);
    List<String> getAllProfilePictureFilePaths(List<Artist> artists);

    //Unique Getters

    Set<String> getAllUniqueUsernames(List<Artist> artists);
    Set<String> getAllUniqueFirstNames(List<Artist> artists);
    Set<String> getAllUniqueLastNames(List<Artist> artists);
    Set<String> getAllUniqueEmails(List<Artist> artists);
    Set<String> getAllUniquePhoneNumbers(List<Artist> artists);
    Set<String> getAllUniqueAddresses(List<Artist> artists);
    Set<String> getAllUniqueCities(List<Artist> artists);
    Set<String> getAllUniqueCountries(List<Artist> artists);
    Set<String> getAllUniqueBirthDates(List<Artist> artists);
    Set<String> getAllUniqueProfilePictureFilePaths(List<Artist> artists);



}
