package ro.pao.service.impl.users;

import ro.pao.model.users.Admin;
import ro.pao.service.usersServices.AdminService;

import java.util.*;

public class AdminServiceImpl implements AdminService {

    @Override
    public void login(String username, String password) {

    }

    @Override
    public void register(String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, String city, String country, String birthDate, String profilePictureFilePath, String type) {

    }

    @Override
    public void logout() {

    }

    @Override
    public List<String> getAllUsernames(List<Admin> admins) {
        List<String> usernames = new ArrayList<>();
        for (Admin admin : admins) {
            usernames.add(admin.getUsername());
        }
        return usernames;
    }

    @Override
    public Set<String> getAllUniquesernames(List<Admin> admins) {
        Set<String> usernames = new HashSet<>();
        for (Admin admin : admins) {
            usernames.add(admin.getUsername());
        }
        return usernames;
    }

    @Override
    public Set<String> getAllUniqueFirstNames(List<Admin> admins) {
        Set<String> firstNames = new HashSet<>();
        for (Admin admin : admins) {
            firstNames.add(admin.getFirstName());
        }
        return firstNames;
    }

    @Override
    public Set<String> getAllUniqueLastNames(List<Admin> admins) {
        Set<String> lastNames = new HashSet<>();
        for (Admin admin : admins) {
            lastNames.add(admin.getLastName());
        }
        return lastNames;
    }

    @Override
    public Set<String> getAllUniqueEmails(List<Admin> admins) {
        Set<String> emails = new HashSet<>();
        for (Admin admin : admins) {
            emails.add(admin.getEmail());
        }
        return emails;
    }

    @Override
    public Set<String> getAllUniquePhoneNumbers(List<Admin> admins) {
        Set<String> phoneNumbers = new HashSet<>();
        for (Admin admin : admins) {
            phoneNumbers.add(admin.getPhoneNumber());
        }
        return phoneNumbers;
    }

    @Override
    public Set<String> getAllUniqueAddresses(List<Admin> admins) {
        Set<String> addresses = new HashSet<>();
        for (Admin admin : admins) {
            addresses.add(admin.getAddress());
        }
        return addresses;
    }

    @Override
    public Set<String> getAllUniqueCities(List<Admin> admins) {
        Set<String> cities = new HashSet<>();
        for (Admin admin : admins) {
            cities.add(admin.getCity());
        }
        return cities;
    }

    @Override
    public Set<String> getAllUniqueCountries(List<Admin> admins) {
        Set<String> countries = new HashSet<>();
        for (Admin admin : admins) {
            countries.add(admin.getCountry());
        }
        return countries;
    }

    @Override
    public Set<String> getAllUniqueBirthDates(List<Admin> admins) {
        Set<String> birthDates = new HashSet<>();
        for (Admin admin : admins) {
            birthDates.add(String.valueOf(admin.getBirthDate()));
        }
        return birthDates;
    }

    @Override
    public Set<String> getAllUniqueProfilePictureFilePaths(List<Admin> admins) {
        Set<String> profilePictureFilePaths = new HashSet<>();
        for (Admin admin : admins) {
            profilePictureFilePaths.add(admin.getProfilePictureFilePath());
        }
        return profilePictureFilePaths;
    }

    @Override
    public ArrayList<Admin> getAllAdminsSortedByFirstName(LinkedList<Admin> admins) {
        ArrayList<Admin> sortedAdmins = new ArrayList<>(admins);
        sortedAdmins.sort((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
        return sortedAdmins;
    }

    @Override
    public ArrayList<Admin> getAllAdminsSortedByLastName(LinkedList<Admin> admins) {
        ArrayList<Admin> sortedAdmins = new ArrayList<>(admins);
        sortedAdmins.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        return sortedAdmins;
    }

    @Override
    public ArrayList<Admin> getAllAdminsSortedByDate(LinkedList<Admin> admins) {
        ArrayList<Admin> sortedAdmins = new ArrayList<>(admins);
        sortedAdmins.sort((o1, o2) -> o1.getBirthDate().compareTo(o2.getBirthDate()));
        return sortedAdmins;
    }

    @Override
    public ArrayList<Admin> getAllAdminsWithFirstNameBogdan(LinkedList<Admin> admins) {
        ArrayList<Admin> bogdanAdmins = new ArrayList<>();
        for (Admin admin : admins) {
            if (admin.getFirstName().equals("Bogdan")) {
                bogdanAdmins.add(admin);
            }
        }
        return bogdanAdmins;
    }
}
