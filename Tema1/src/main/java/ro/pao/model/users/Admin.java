package ro.pao.model.users;

import ro.pao.model.abstracts.AbstractUser;
import ro.pao.model.enums.UserType;

import java.util.Date;

public class Admin extends AbstractUser {

    public Admin(String username, String password, String firstName, String lastName, String email, String phoneNumber, String address, String city, String country, Date birthDate, String profilePictureFilePath, UserType type) {
        super(username, password, firstName, lastName, email, phoneNumber, address, city, country, birthDate, profilePictureFilePath, type);
    }

}
