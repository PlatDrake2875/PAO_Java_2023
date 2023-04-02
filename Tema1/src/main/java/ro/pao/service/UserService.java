package ro.pao.service;

import ro.pao.model.enums.UserType;
import ro.pao.model.users.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public interface UserService {

    //TODO: add database connection to implement login, register and login methods
    void login(String username, String password);

    void register(String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, String city, String country, String birthDate, String profilePictureFilePath, String type);

    void logout();

    //Sortings
    ArrayList<String> getAllUsernames(LinkedList<User> users);

    ArrayList<User> getAllUsernamesByType(LinkedList<User> users, UserType type);

    ArrayList<User> getAllUsernamesSortedBy(LinkedList<User> users, String sortBy);

    ArrayList<User> getAllUsernamesByTypeSortedBy(LinkedList<User> users, String sortBy, UserType type);

    //Filters
    ArrayList<User> getAllUsersWithFirstNameBogdan(LinkedList<User> users);
}
