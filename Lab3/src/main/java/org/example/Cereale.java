package java.org.example;

import java.org.example.Aliment;
import java.util.Date;

class Cereale extends Aliment {
    enum TipCereale {
        Nesquick, Chocapik
    };
    private TipCereale tipCereale;
    public Cereale(String denumire, int calorii, int cantitate, int pret, Date dataExpirare, TipAliment tipAliment, TipCereale tipCereale) {
        super(denumire, calorii, cantitate, pret, dataExpirare, tipAliment);
        this.tipCereale = tipCereale;
    }

    public TipCereale gettipCereale() {
        return tipCereale;
    }

    public void settipCereale(TipCereale tipCereale) {
        this.tipCereale = tipCereale;
    }

    @Override
    public String toString() {
        return "java.org.example.Cereale{" +
                "tipCereale=" + tipCereale +
                '}';
    }
}