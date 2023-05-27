package ro.pao.service.interfaces;

import ro.pao.repository.Audiobook;

import java.util.List;

public interface AudiobookService {

    //Getters
    List<String> getAllTitles(List<Audiobook> audiobooks);

    List<String> getAllAuthors(List<Audiobook> audiobooks);

    List<String> getAllNarrators(List<Audiobook> audiobooks);

    List<String> getAllGenres(List<Audiobook> audiobooks);

    List<String> getAllPublishers(List<Audiobook> audiobooks);

    //Setters
    void addAudiobook(List<Audiobook> audiobooks, Audiobook audiobook);

    void removeAudiobook(List<Audiobook> audiobooks, Audiobook audiobook);

    void updateAudiobook(List<Audiobook> audiobooks, Audiobook audiobook);

    //Sortings
    List<Audiobook> getAllAudiobooksSortedByTitle(List<Audiobook> audiobooks);

    List<Audiobook> getAllAudiobooksSortedByAuthor(List<Audiobook> audiobooks);

    List<Audiobook> getAllAudiobooksSortedByNarrator(List<Audiobook> audiobooks);

    List<Audiobook> getAllAudiobooksSortedByGenre(List<Audiobook> audiobooks);

}
