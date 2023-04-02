package ro.pao.service.usersServices;

import ro.pao.model.enums.UserType;
import ro.pao.model.users.Admin;
import ro.pao.model.users.User;

import java.util.*;

public interface AdminService {

    //TODO: add database connection to implement login, register and login methods
    void login(String username, String password);

    void register(String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, String city, String country, String birthDate, String profilePictureFilePath, String type);

    void logout();


    // Getters
    public List<String> getAllUsernames(List<Admin> admins);

    //Unique Getters
    public Set<String> getAllUniquesernames(List<Admin> admins);
    public Set<String> getAllUniqueFirstNames(List<Admin> admins);
    public Set<String> getAllUniqueLastNames(List<Admin> admins);
    public Set<String> getAllUniqueEmails(List<Admin> admins);
    public Set<String> getAllUniquePhoneNumbers(List<Admin> admins);
    public Set<String> getAllUniqueAddresses(List<Admin> admins);
    public Set<String> getAllUniqueCities(List<Admin> admins);
    public Set<String> getAllUniqueCountries(List<Admin> admins);
    public Set<String> getAllUniqueBirthDates(List<Admin> admins);
    public Set<String> getAllUniqueProfilePictureFilePaths(List<Admin> admins);

    //Sortings
    ArrayList<Admin> getAllAdminsSortedByFirstName(LinkedList<Admin> admins);
    ArrayList<Admin> getAllAdminsSortedByLastName(LinkedList<Admin> admins);
    ArrayList<Admin> getAllAdminsSortedByDate(LinkedList<Admin> admins);

    //Filters
    ArrayList<Admin> getAllAdminsWithFirstNameBogdan(LinkedList<Admin> admins);

}
