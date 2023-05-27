package ro.pao.model.users;

import ro.pao.model.enums.UserType;

import java.util.Date;

public final class SuperAdmin extends Admin<Void> {
    private static final SuperAdmin instance = new SuperAdmin();

    private SuperAdmin() {
        super("superadmin", "password", "Super", "Admin", "admin@example.com",
                "1234567890", "123 Admin St", "City", "Country", new Date(), "profile.jpg",
                UserType.SUPER_ADMIN, null);
    }

    public static SuperAdmin getInstance() {
        return instance;
    }
}
