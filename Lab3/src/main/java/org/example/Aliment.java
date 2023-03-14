package java.org.example;

import java.util.Date;

class Aliment {
    enum TipAliment {
        FRUCTE, LEGUME, CARNE, PESTE, LAPTE, BRANZA, OUA, BERE, VIN, ALCOOL, BUCATARIE
    }
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
        return "java.org.example.Aliment{" +
                "denumire='" + denumire + '\'' +
                ", calorii=" + calorii +
                ", cantitate=" + cantitate +
                ", pret=" + pret +
                '}';
    }
}