package ro.pao.model.users;

import ro.pao.model.abstracts.AbstractUser;
import ro.pao.model.enums.UserType;

import java.util.Date;

public sealed class Admin<T> extends AbstractUser permits SuperAdmin {
    private static Admin<?> instance;

    private T details;

    Admin(String username, String password, String firstName, String lastName, String email,
          String phoneNumber, String address, String city, String country, Date birthDate,
          String profilePictureFilePath, UserType type, T details) {
        super(username, password, firstName, lastName, email, phoneNumber, address, city, country,
                birthDate, profilePictureFilePath, type);
        this.details = details;
    }

    public static synchronized Admin<?> getInstance(String username, String password, String firstName,
                                                    String lastName, String email, String phoneNumber,
                                                    String address, String city, String country, Date birthDate,
                                                    String profilePictureFilePath, UserType type, Object details) {
        if (instance == null) {
            instance = new Admin<>(username, password, firstName, lastName, email, phoneNumber, address, city, country,
                    birthDate, profilePictureFilePath, type, details);
        }
        return instance;
    }

    public T getDetails() {
        return details;
    }

    public void setDetails(T details) {
        this.details = details;
    }
}
