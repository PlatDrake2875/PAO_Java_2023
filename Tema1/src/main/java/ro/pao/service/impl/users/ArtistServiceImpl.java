package ro.pao.service.impl.users;

import ro.pao.model.users.Artist;
import ro.pao.service.usersServices.ArtistService;

import java.util.*;

public class ArtistServiceImpl implements ArtistService {
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
    public List<String> getAllUsernames(List<Artist> artists) {
        List<String> usernames = new ArrayList<>();
        for (Artist artist : artists) {
            usernames.add(artist.getUsername());
        }
        return usernames;
    }

    @Override
    public List<String> getAllfirstNames(List<Artist> artists) {
        List<String> firstNames = new ArrayList<>();
        for (Artist artist : artists) {
            firstNames.add(artist.getFirstName());
        }
        return firstNames;
    }

    @Override
    public List<String> getAllLastNames(List<Artist> artists) {
        List<String> lastNames = new ArrayList<>();
        for (Artist artist : artists) {
            lastNames.add(artist.getLastName());
        }
        return lastNames;
    }

    @Override
    public List<String> getAllEmails(List<Artist> artists) {
        List<String> emails = new ArrayList<>();
        for (Artist artist : artists) {
            emails.add(artist.getEmail());
        }
        return emails;
    }

    @Override
    public List<String> getAllPhoneNumbers(List<Artist> artists) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Artist artist : artists) {
            phoneNumbers.add(artist.getPhoneNumber());
        }
        return phoneNumbers;
    }

    @Override
    public List<String> getAllAddresses(List<Artist> artists) {
        List<String> addresses = new ArrayList<>();
        for (Artist artist : artists) {
            addresses.add(artist.getAddress());
        }
        return addresses;
    }

    @Override
    public List<String> getAllCities(List<Artist> artists) {
        List<String> cities = new ArrayList<>();
        for (Artist artist : artists) {
            cities.add(artist.getCity());
        }
        return cities;
    }

    @Override
    public List<String> getAllCountries(List<Artist> artists) {
        List<String> countries = new ArrayList<>();
        for (Artist artist : artists) {
            countries.add(artist.getCountry());
        }
        return countries;
    }

    @Override
    public List<String> getAllBirthDates(List<Artist> artists) {
        List<String> birthDates = new ArrayList<>();
        for (Artist artist : artists) {
            birthDates.add(artist.getBirthDate().toString());
        }
        return birthDates;
    }

    @Override
    public List<String> getAllProfilePictureFilePaths(List<Artist> artists) {
        List<String> profilePictureFilePaths = new ArrayList<>();
        for (Artist artist : artists) {
            profilePictureFilePaths.add(artist.getProfilePictureFilePath());
        }
        return profilePictureFilePaths;
    }

    @Override
    public Set<String> getAllUniqueUsernames(List<Artist> artists) {
        Set<String> usernames = new HashSet<>();
        for (Artist artist : artists) {
            usernames.add(artist.getUsername());
        }
        return usernames;
    }

    @Override
    public Set<String> getAllUniqueFirstNames(List<Artist> artists) {
        Set<String> firstNames = new HashSet<>();
        for (Artist artist : artists) {
            firstNames.add(artist.getFirstName());
        }
        return firstNames;
    }

    @Override
    public Set<String> getAllUniqueLastNames(List<Artist> artists) {
        Set<String> lastNames = new HashSet<>();
        for (Artist artist : artists) {
            lastNames.add(artist.getLastName());
        }
        return lastNames;
    }

    @Override
    public Set<String> getAllUniqueEmails(List<Artist> artists) {
        Set<String> emails = new HashSet<>();
        for (Artist artist : artists) {
            emails.add(artist.getEmail());
        }
        return emails;
    }

    @Override
    public Set<String> getAllUniquePhoneNumbers(List<Artist> artists) {
        Set<String> phoneNumbers = new HashSet<>();
        for (Artist artist : artists) {
            phoneNumbers.add(artist.getPhoneNumber());
        }
        return phoneNumbers;
    }

    @Override
    public Set<String> getAllUniqueAddresses(List<Artist> artists) {
        Set<String> addresses = new HashSet<>();
        for (Artist artist : artists) {
            addresses.add(artist.getAddress());
        }
        return addresses;
    }

    @Override
    public Set<String> getAllUniqueCities(List<Artist> artists) {
        Set<String> cities = new HashSet<>();
        for (Artist artist : artists) {
            cities.add(artist.getCity());
        }
        return cities;
    }

    @Override
    public Set<String> getAllUniqueCountries(List<Artist> artists) {
        Set<String> countries = new HashSet<>();
        for (Artist artist : artists) {
            countries.add(artist.getCountry());
        }
        return countries;
    }

    @Override
    public Set<String> getAllUniqueBirthDates(List<Artist> artists) {
        Set<String> birthDates = new HashSet<>();
        for (Artist artist : artists) {
            birthDates.add(artist.getBirthDate().toString());
        }
        return birthDates;
    }

    @Override
    public Set<String> getAllUniqueProfilePictureFilePaths(List<Artist> artists) {
        Set<String> profilePictureFilePaths = new HashSet<>();
        for (Artist artist : artists) {
            profilePictureFilePaths.add(artist.getProfilePictureFilePath());
        }
        return profilePictureFilePaths;
    }
}
