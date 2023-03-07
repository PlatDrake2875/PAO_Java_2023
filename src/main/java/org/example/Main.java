package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}



class Aliment {
    enum TipAliment {
        FRUCTE, LEGUME, CARNE, PESTE, LAPTE, BRANZA, OUA, BERE, VIN, ALCOOL, BUCATARIE
    };
    private TipAliment tipAliment;
    private String denumire;
    private int calorii;
    private int cantitate;
    private int pret;
    private Date dataExpirare;
    public Aliment(String denumire, int calorii, int cantitate, int pret, Date dataExpirare, TipAliment tipAliment) {
        this.denumire = denumire;
        this.calorii = calorii;
        this.tipAliment = tipAliment;
        this.cantitate = cantitate;
        this.pret = pret;
        this.dataExpirare = dataExpirare;
    }

    public String getdenumire() {
        return denumire;
    }

    public int getcalorii() {
        return calorii;
    }

    public int getcantitate() {
        return cantitate;
    }

    public int getpret() {
        return pret;
    }

    public void setdenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setcalorii(int calorii) {
        this.calorii = calorii;
    }

    public void setcantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setpret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Aliment{" +
                "denumire='" + denumire + '\'' +
                ", calorii=" + calorii +
                ", cantitate=" + cantitate +
                ", pret=" + pret +
                '}';
    }
}

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
        return "Carne{" +
                "tipCarne=" + tipCarne +
                '}';
    }
}

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
        return "Cereale{" +
                "tipCereale=" + tipCereale +
                '}';
    }
}

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
        return "Lactate{" +
                "tipLactate=" + tipLactate +
                '}';
    }
}