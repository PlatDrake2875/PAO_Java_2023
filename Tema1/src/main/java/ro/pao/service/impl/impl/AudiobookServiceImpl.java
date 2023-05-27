package ro.pao.service.impl.impl;

import ro.pao.repository.Audiobook;
import ro.pao.service.interfaces.AudiobookService;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AudiobookServiceImpl implements AudiobookService {

    @Override
    public List<String> getAllTitles(List<Audiobook> audiobooks) {
        return audiobooks.parallelStream().map(Audiobook::getTitle).toList();
    }

    @Override
    public List<String> getAllAuthors(List<Audiobook> audiobooks) {
        return audiobooks.parallelStream().map(Audiobook::getAuthor).toList();
    }

    @Override
    public List<String> getAllNarrators(List<Audiobook> audiobooks) {
        return audiobooks.parallelStream().map(Audiobook::getNarrator).toList();
    }

    @Override
    public List<String> getAllGenres(List<Audiobook> audiobooks) {
        return audiobooks.parallelStream().map(Audiobook::getGenre).toList();
    }

    @Override
    public List<String> getAllPublishers(List<Audiobook> audiobooks) {
        return audiobooks.parallelStream().map(Audiobook::getPublisher).toList();
    }

    @Override
    public void addAudiobook(List<Audiobook> audiobooks, Audiobook audiobook) {
        if (!(audiobooks instanceof CopyOnWriteArrayList)) {
            audiobooks = new CopyOnWriteArrayList<>(audiobooks);
        }
        audiobooks.add(audiobook);
    }

    @Override
    public void removeAudiobook(List<Audiobook> audiobooks, Audiobook audiobook) {
        if (!(audiobooks instanceof CopyOnWriteArrayList)) {
            audiobooks = new CopyOnWriteArrayList<>(audiobooks);
        }
        audiobooks.remove(audiobook);
    }

    @Override
    public void updateAudiobook(List<Audiobook> audiobooks, Audiobook audiobook) {
        if (!(audiobooks instanceof CopyOnWriteArrayList)) {
            audiobooks = new CopyOnWriteArrayList<>(audiobooks);
        }
        int index = audiobooks.indexOf(audiobook);
        if (index != -1) {
            audiobooks.set(index, audiobook);
        }
    }

    @Override
    public List<Audiobook> getAllAudiobooksSortedByTitle(List<Audiobook> audiobooks) {
        return audiobooks.parallelStream().sorted(Comparator.comparing(Audiobook::getTitle)).toList();
    }

    @Override
    public List<Audiobook> getAllAudiobooksSortedByAuthor(List<Audiobook> audiobooks) {
        return audiobooks.parallelStream().sorted(Comparator.comparing(Audiobook::getAuthor)).toList();
    }

    @Override
    public List<Audiobook> getAllAudiobooksSortedByNarrator(List<Audiobook> audiobooks) {
        return audiobooks.parallelStream().sorted(Comparator.comparing(Audiobook::getNarrator)).toList();
    }

    @Override
    public List<Audiobook> getAllAudiobooksSortedByGenre(List<Audiobook> audiobooks) {
        return audiobooks.parallelStream().sorted(Comparator.comparing(Audiobook::getGenre)).toList();
    }
}
