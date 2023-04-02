package ro.pao.service.impl;

import ro.pao.model.enums.UserType;
import ro.pao.model.users.User;
import ro.pao.service.UserService;

import java.util.*;
import java.util.function.Predicate;

public class UserServiceImpl implements UserService {

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
    public List<String> getAllUsernames(List<User> users) {
        ArrayList<String> usernames = new ArrayList<>();
        for (User user : users) {
            usernames.add(user.getUsername());
        }
        return usernames;
    }

    @Override
    public Set<String> getAllUniquesernames(List<User> users) {
        Set<String> usernames = new HashSet<>();
        for (User user : users) {
            usernames.add(user.getUsername());
        }
        return usernames;
    }

    @Override
    public Set<String> getAllUniqueFirstNames(List<User> users) {
        Set<String> firstNames = new HashSet<>();
        for (User user : users) {
            firstNames.add(user.getFirstName());
        }
        return firstNames;
    }

    @Override
    public Set<String> getAllUniqueLastNames(List<User> users) {
        Set<String> lastNames = new HashSet<>();
        for (User user : users) {
            lastNames.add(user.getLastName());
        }
        return lastNames;
    }

    @Override
    public Set<String> getAllUniqueEmails(List<User> users) {
        Set<String> emails = new HashSet<>();
        for (User user : users) {
            emails.add(user.getEmail());
        }
        return emails;
    }

    @Override
    public Set<String> getAllUniquePhoneNumbers(List<User> users) {
        Set<String> phoneNumbers = new HashSet<>();
        for (User user : users) {
            phoneNumbers.add(user.getPhoneNumber());
        }
        return phoneNumbers;
    }

    @Override
    public Set<String> getAllUniqueAddresses(List<User> users) {
        Set<String> addresses = new HashSet<>();
        for (User user : users) {
            addresses.add(user.getAddress());
        }
        return addresses;
    }

    @Override
    public Set<String> getAllUniqueCities(List<User> users) {
        Set<String> cities = new HashSet<>();
        for (User user : users) {
            cities.add(user.getCity());
        }
        return cities;
    }

    @Override
    public Set<String> getAllUniqueCountries(List<User> users) {
        Set<String> countries = new HashSet<>();
        for (User user : users) {
            countries.add(user.getCountry());
        }
        return countries;
    }

    @Override
    public Set<String> getAllUniqueBirthDates(List<User> users) {
        Set<String> birthDates = new HashSet<>();
        for (User user : users) {
            birthDates.add(user.getBirthDate().toString());
        }
        return birthDates;
    }

    @Override
    public Set<String> getAllUniqueProfilePictureFilePaths(List<User> users) {
        Set<String> profilePictureFilePaths = new HashSet<>();
        for (User user : users) {
            profilePictureFilePaths.add(user.getProfilePictureFilePath());
        }
        return profilePictureFilePaths;
    }

    @Override
    public Set<String> getAllUniqueTypes(List<User> users) {
        Set<String> types = new HashSet<>();
        for (User user : users) {
            types.add(user.getType().toString());
        }
        return types;
    }

    @Override
    public ArrayList<User> getAllUsersSortedByFirstName(LinkedList<User> users) {
        ArrayList<User> sortedUsers = new ArrayList<>(users);
        sortedUsers.sort(Comparator.comparing(User::getFirstName));
        return sortedUsers;
    }

    @Override
    public ArrayList<User> getAllUsersSortedByLastName(LinkedList<User> users) {
        ArrayList<User> sortedUsers = new ArrayList<>(users);
        sortedUsers.sort(Comparator.comparing(User::getLastName));
        return sortedUsers;
    }

    @Override
    public ArrayList<User> getAllUsersSortedByDate(LinkedList<User> users) {
        ArrayList<User> sortedUsers = new ArrayList<>(users);
        sortedUsers.sort(Comparator.comparing(User::getBirthDate));
        return sortedUsers;
    }

    @Override
    public ArrayList<User> getAllUsernamesByType(LinkedList<User> users, UserType type) {
        ArrayList<User> filteredUsers = new ArrayList<>(users);
        filteredUsers.removeIf(user -> user.getType() != type);
        return filteredUsers;
    }

    @Override
    public ArrayList<User> getAllUsersWithFirstNameBogdan(LinkedList<User> users) {
        ArrayList<User> filteredUsers = new ArrayList<>(users);
        filteredUsers.removeIf(user -> !user.getFirstName().equals("Bogdan"));
        return filteredUsers;
    }

    @Override
    public HashMap<String, List<User>> getAllUsersGroupedByCountry(LinkedList<User> users) {
        HashMap<String, List<User>> groupedUsers = new HashMap<>();
        for (User user : users) {
            if (groupedUsers.containsKey(user.getCountry())) {
                groupedUsers.get(user.getCountry()).add(user);
            } else {
                groupedUsers.put(user.getCountry(), new ArrayList<>(Arrays.asList(user)));
            }
        }
        return groupedUsers;
    }

    @Override
    public HashMap<String, List<User>> getAllUsersGroupedByCity(LinkedList<User> users) {
        HashMap<String, List<User>> groupedUsers = new HashMap<>();
        for (User user : users) {
            if (groupedUsers.containsKey(user.getCity())) {
                groupedUsers.get(user.getCity()).add(user);
            } else {
                groupedUsers.put(user.getCity(), new ArrayList<>(Arrays.asList(user)));
            }
        }
        return groupedUsers;
    }

}

