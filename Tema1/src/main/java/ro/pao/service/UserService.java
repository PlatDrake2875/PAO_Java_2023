package ro.pao.service;

import ro.pao.model.enums.UserType;
import ro.pao.model.users.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public interface UserService {

    //TODO: add database connection to implement login, register and login methods
    void login(String username, String password);

    void register(String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, String city, String country, String birthDate, String profilePictureFilePath, String type);

    void logout();

    //Getters
    public List<String> getAllUsernames(List<User> users);

    //Sortings
    ArrayList<User> getAllUsersSortedByFirstName(LinkedList<User> users, String sortBy);
    ArrayList<User> getAllUsersSortedByLastName(LinkedList<User> users, String sortBy);
    ArrayList<User> getAllUsersSortedByDate(LinkedList<User> users, String sortBy);

    //Filters
    ArrayList<User> getAllUsernamesByType(LinkedList<User> users, UserType type);
    ArrayList<User> getAllUsersWithFirstNameBogdan(LinkedList<User> users);
}
