package org.example;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ImobiliareFunctions {

    Predicate<Imobiliare> imobilCuBaie= imobil -> (imobil.getNumarBai() > 0);
    Predicate<Imobiliare> imobilCuGaraj = imobil -> (imobil.getNumarLocuriParcare() > 0);
    Predicate<Imobiliare> imobilCuBucatarie = imobil -> (imobil.getNumarBucatarii() > 0);
    UnaryOperator<Stream<Imobiliare>> imobileCuBaie = imobile -> imobile.filter(imobilCuBaie);
    UnaryOperator<Stream<Imobiliare>> imobileCuGaraj = imobile -> imobile.filter(imobilCuGaraj);
    UnaryOperator<Stream<Imobiliare>> imobileCuBucatarie = imobile -> imobile.filter(imobilCuBucatarie);
}
