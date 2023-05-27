package ro.pao.service.impl.impl;

import ro.pao.repository.Podcast;
import ro.pao.service.interfaces.PodcastService;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PodcastServiceImpl implements PodcastService {
    @Override
    public List<String> getAllTitles(List<Podcast> podcasts) {
        return podcasts.stream().map(Podcast::getTitle).toList();
    }

    @Override
    public List<String[]> getAllGuests(List<Podcast> podcasts) {
        return podcasts.stream().map(Podcast::getGuests).toList();
    }

    @Override
    public List<String[]> getAllTopics(List<Podcast> podcasts) {
        return podcasts.stream().map(Podcast::getTopics).toList();
    }

    @Override
    public void addPodcast(List<Podcast> podcasts, Podcast podcast) {
        podcasts.add(podcast);
    }

    @Override
    public void removePodcast(List<Podcast> podcasts, Podcast podcast) {
        podcasts.remove(podcast);
    }

    @Override
    public List<Podcast> getAllPodcastsSortedByTitle(List<Podcast> podcasts) {
        return podcasts.stream().sorted((p1, p2) -> p1.getTitle().compareTo(p2.getTitle())).toList();
    }

    @Override
    public List<Podcast> getAllPodcastsSortedByGuests(List<Podcast> podcasts) {
        return podcasts.stream().sorted(Comparator.comparing(p -> Arrays.toString(p.getGuests()))).toList();
    }

    @Override
    public List<Podcast> getAllPodcastsSortedByTopics(List<Podcast> podcasts) {
        return podcasts.stream().sorted(Comparator.comparing(p -> Arrays.toString(p.getTopics()))).toList();
    }
}
