package ro.pao.service.impl;

import ro.pao.model.enums.UserType;
import ro.pao.model.users.User;
import ro.pao.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

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
    public ArrayList<User> getAllUsersSortedByFirstName(LinkedList<User> users, String sortBy) {
        return null;
    }

    @Override
    public ArrayList<User> getAllUsersSortedByLastName(LinkedList<User> users, String sortBy) {
        return null;
    }

    @Override
    public ArrayList<User> getAllUsersSortedByDate(LinkedList<User> users, String sortBy) {
        return null;
    }

    @Override
    public ArrayList<User> getAllUsernamesByType(LinkedList<User> users, UserType type) {
        return null;
    }

    @Override
    public ArrayList<User> getAllUsersWithFirstNameBogdan(LinkedList<User> users) {
        return null;
    }


}
