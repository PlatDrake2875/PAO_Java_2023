package ro.pao.service.impl.audioContents;

import ro.pao.model.audioContents.Audiobook;
import ro.pao.service.audioContentsServices.AudiobookService;

import java.util.List;

public class AudiobookServiceImpl implements AudiobookService {
    @Override
    public List<String> getAllTitles(List<Audiobook> audiobooks) {
        return audiobooks.stream().map(Audiobook::getTitle).toList();
    }

    @Override
    public List<String> getAllAuthors(List<Audiobook> audiobooks) {
        return audiobooks.stream().map(Audiobook::getAuthor).toList();
    }

    @Override
    public List<String> getAllNarrators(List<Audiobook> audiobooks) {
        return audiobooks.stream().map(Audiobook::getNarrator).toList();
    }

    @Override
    public List<String> getAllGenres(List<Audiobook> audiobooks) {
        return audiobooks.stream().map(Audiobook::getGenre).toList();
    }

    @Override
    public List<String> getAllPublishers(List<Audiobook> audiobooks) {
        return audiobooks.stream().map(Audiobook::getPublisher).toList();
    }

    @Override
    public void addAudiobook(List<Audiobook> audiobooks, Audiobook audiobook) {
        audiobooks.add(audiobook);
    }

    @Override
    public void removeAudiobook(List<Audiobook> audiobooks, Audiobook audiobook) {
        audiobooks.remove(audiobook);
    }

    @Override
    public void updateAudiobook(List<Audiobook> audiobooks, Audiobook audiobook) {
        audiobooks.set(audiobooks.indexOf(audiobook), audiobook);
    }

    @Override
    public List<Audiobook> getAllAudiobooksSortedByTitle(List<Audiobook> audiobooks) {
        return audiobooks.stream().sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle())).toList();
    }

    @Override
    public List<Audiobook> getAllAudiobooksSortedByAuthor(List<Audiobook> audiobooks) {
        return audiobooks.stream().sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor())).toList();
    }

    @Override
    public List<Audiobook> getAllAudiobooksSortedByNarrator(List<Audiobook> audiobooks) {
        return audiobooks.stream().sorted((a1, a2) -> a1.getNarrator().compareTo(a2.getNarrator())).toList();
    }

    @Override
    public List<Audiobook> getAllAudiobooksSortedByGenre(List<Audiobook> audiobooks) {
        return audiobooks.stream().sorted((a1, a2) -> a1.getGenre().compareTo(a2.getGenre())).toList();
    }
}
