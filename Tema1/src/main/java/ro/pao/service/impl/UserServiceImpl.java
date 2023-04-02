package ro.pao.service.impl;

import ro.pao.model.enums.UserType;
import ro.pao.model.users.User;
import ro.pao.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

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
    public ArrayList<String> getAllUsernames(LinkedList<User> users) {
        ArrayList<String> usernames = new ArrayList<>();
        for (User user : users) {
            usernames.add(user.getUsername());
        }
        return usernames;
    }

    @Override
    public ArrayList<User> getAllUsernamesByType(LinkedList<User> users, UserType type) {
        return null;
    }

    @Override
    public ArrayList<User> getAllUsernamesSortedBy(LinkedList<User> users, String sortBy) {
        return null;
    }

    @Override
    public ArrayList<User> getAllUsernamesByTypeSortedBy(LinkedList<User> users, String sortBy, UserType type) {
        return null;
    }

    @Override
    public ArrayList<User> getAllUsersWithFirstNameBogdan(LinkedList<User> users) {
        return null;
    }


}
