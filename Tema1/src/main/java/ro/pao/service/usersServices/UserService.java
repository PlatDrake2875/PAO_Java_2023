package ro.pao.service.usersServices;

import ro.pao.model.enums.UserType;
import ro.pao.model.users.User;

import java.util.*;

public interface UserService {

    //TODO: add database connection to implement login, register and login methods
    void login(String username, String password);

    void register(String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, String city, String country, String birthDate, String profilePictureFilePath, String type);

    void logout();


    // Getters
    public List<String> getAllUsernames(List<User> users);

    // Unique Getters
    public Set<String> getAllUniquesernames(List<User> users);
    public Set<String> getAllUniqueFirstNames(List<User> users);
    public Set<String> getAllUniqueLastNames(List<User> users);
    public Set<String> getAllUniqueEmails(List<User> users);
    public Set<String> getAllUniquePhoneNumbers(List<User> users);
    public Set<String> getAllUniqueAddresses(List<User> users);
    public Set<String> getAllUniqueCities(List<User> users);
    public Set<String> getAllUniqueCountries(List<User> users);
    public Set<String> getAllUniqueBirthDates(List<User> users);
    public Set<String> getAllUniqueProfilePictureFilePaths(List<User> users);
    public Set<String> getAllUniqueTypes(List<User> users);


    //Sortings
    ArrayList<User> getAllUsersSortedByFirstName(LinkedList<User> users);
    ArrayList<User> getAllUsersSortedByLastName(LinkedList<User> users);
    ArrayList<User> getAllUsersSortedByDate(LinkedList<User> users);

    //Filters
    ArrayList<User> getAllUsernamesByType(LinkedList<User> users, UserType type);
    ArrayList<User> getAllUsersWithFirstNameBogdan(LinkedList<User> users);

    //Group by
    HashMap<String, List<User>> getAllUsersGroupedByCountry(LinkedList<User> users);
    HashMap<String, List<User>> getAllUsersGroupedByCity(LinkedList<User> users);
}
