package org.example;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImobiliareFunctions {

    Predicate<Imobiliare> imobilCuBaie= imobil -> (imobil.getNumarBai() > 0);
    Predicate<Imobiliare> imobilCuGaraj = imobil -> (imobil.getNumarLocuriParcare() > 0);
    Predicate<Imobiliare> imobilCuBucatarie = imobil -> (imobil.getNumarBucatarii() > 0);
    UnaryOperator<Stream<Imobiliare>> imobileCuBaie = imobile -> imobile.filter(imobilCuBaie);
    UnaryOperator<Stream<Imobiliare>> imobileCuGaraj = imobile -> imobile.filter(imobilCuGaraj);
    UnaryOperator<Stream<Imobiliare>> imobileCuBucatarie = imobile -> imobile.filter(imobilCuBucatarie);
    Function<Stream<Imobiliare>, Stream<Imobiliare>> imobileCuEtaj = imobile -> imobile.filter(imobil -> (imobil.getEtajImobil() > 0));
    Function<Stream<Imobiliare>, Stream<Imobiliare>> imobileLaParter = imobile -> imobile.filter(imobil -> (imobil.getEtajImobil() == 0));
    public List<Imobiliare> getImobileCuBaie(List<Imobiliare> imobile) {
        return imobile.stream().filter(imobilCuBaie).collect(Collectors.toList());
    }
    public List<Imobiliare> getImobileCuBucatarie(List<org.example.Imobiliare> imobile) {
        return imobile.stream().filter(imobilCuBucatarie).collect(Collectors.toList());
    }
    public List<Imobiliare> getImobileCuGaraj(List<Imobiliare> imobile) {
        return imobile.stream().filter(imobilCuGaraj).collect(Collectors.toList());
    }
    public List<Imobiliare> getImobileCuEtaj(List<Imobiliare> imobile) {
        return imobile.stream().filter(imobil -> (imobil.getEtajImobil() > 0)).collect(Collectors.toList());
    }
    public List<Imobiliare> SortImobileBySuprafata(List<Imobiliare> imobile) {
        return imobile.stream().sorted((imobil1, imobil2) -> imobil1.getSuprafata() - imobil2.getSuprafata()).collect(Collectors.toList());
    }
    public List<Imobiliare> SortImobileByNumarCamere(List<Imobiliare> imobile) {
        return imobile.stream().sorted((imobil1, imobil2) -> imobil1.getNumarCamere() - imobil2.getNumarCamere()).collect(Collectors.toList());
    }
    public List<Imobiliare> SortImobileByNumarBai(List<Imobiliare> imobile) {
        return imobile.stream().sorted((imobil1, imobil2) -> imobil1.getNumarBai() - imobil2.getNumarBai()).collect(Collectors.toList());
    }
    public List<Imobiliare> SortImobileByNumarBucatarii(List<Imobiliare> imobile) {
        return imobile.stream().sorted((imobil1, imobil2) -> imobil1.getNumarBucatarii() - imobil2.getNumarBucatarii()).collect(Collectors.toList());
    }
    public List<Imobiliare> SortImobileByNumarBalcoane(List<Imobiliare> imobile) {
        return imobile.stream().sorted((imobil1, imobil2) -> imobil1.getNumarBalcoane() - imobil2.getNumarBalcoane()).collect(Collectors.toList());
    }
}
