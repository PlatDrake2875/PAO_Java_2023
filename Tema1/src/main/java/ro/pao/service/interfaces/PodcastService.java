package ro.pao.service.interfaces;

import ro.pao.repository.Podcast;

import java.util.List;

public interface PodcastService {

    //Getters
    List<String> getAllTitles(List<Podcast> podcasts);
    List<String[]> getAllGuests(List<Podcast> podcasts);
    List<String[]> getAllTopics(List<Podcast> podcasts);

    //Setters

    void addPodcast(List<Podcast> podcasts, Podcast podcast);
    void removePodcast(List<Podcast> podcasts, Podcast podcast);

    //Sortings
    List<Podcast> getAllPodcastsSortedByTitle(List<Podcast> podcasts);
    List<Podcast> getAllPodcastsSortedByGuests(List<Podcast> podcasts);
    List<Podcast> getAllPodcastsSortedByTopics(List<Podcast> podcasts);


}
