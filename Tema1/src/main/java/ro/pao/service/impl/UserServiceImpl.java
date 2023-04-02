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

}

