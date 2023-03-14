package java.org.example;

import java.org.example.Aliment;
import java.util.Date;

class Carne extends Aliment {
    enum TipCarne {
        PORC, VITA, PUI, PESTE
    };
    private TipCarne tipCarne;
    public Carne(String denumire, int calorii, int cantitate, int pret, Date dataExpirare, TipAliment tipAliment, TipCarne tipCarne) {
        super(denumire, calorii, cantitate, pret, dataExpirare, tipAliment);
        this.tipCarne = tipCarne;
    }

    public TipCarne gettipCarne() {
        return tipCarne;
    }

    public void settipCarne(TipCarne tipCarne) {
        this.tipCarne = tipCarne;
    }

    @Override
    public String toString() {
        return "java.org.example.Carne{" +
                "tipCarne=" + tipCarne +
                '}';
    }
}