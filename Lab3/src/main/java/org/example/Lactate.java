package java.org.example;

import java.org.example.Aliment;
import java.util.Date;

class Lactate extends Aliment {
    enum TipLactate {
        Lapte, Branza, Cascaval
    };
    private TipLactate tipLactate;
    public Lactate(String denumire, int calorii, int cantitate, int pret, Date dataExpirare, TipAliment tipAliment, TipLactate tipLactate) {
        super(denumire, calorii, cantitate, pret, dataExpirare, tipAliment);
        this.tipLactate = tipLactate;
    }

    public TipLactate gettipLactate() {
        return tipLactate;
    }

    public void settipLactate(TipLactate tipLactate) {
        this.tipLactate = tipLactate;
    }

    @Override
    public String toString() {
        return "java.org.example.Lactate{" +
                "tipLactate=" + tipLactate +
                '}';
    }
}