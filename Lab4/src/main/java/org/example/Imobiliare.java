package org.example;

import java.util.List;

public class Imobiliare {
    private enum tipImobil {
        APARTAMENT,
        CASA,
        VILA,
        DUPLEX,
        OPEN_SPACE
    }
    private int suprafata;
    private int etajImobil;
    private int numarCamere;
    private int numarBai;
    private int numarBucatarii;
    private int numarBalcoane;
    private List<String> utilitati;
    private boolean garaj;
    private int numarLocuriParcare;

    public Imobiliare()
    {
        this.suprafata = 0;
        this.etajImobil = 0;
        this.numarCamere = 0;
        this.numarBai = 0;
        this.numarBucatarii = 0;
        this.numarBalcoane = 0;
        this.utilitati = null;
        this.garaj = false;
        this.numarLocuriParcare = 0;
    }
    public Imobiliare(int suprafata, int etajImobil, int numarCamere, int numarBai, int numarBucatarii, int numarBalcoane, List<String> utilitati, boolean garaj, int numarLocuriParcare) {
        this.suprafata = suprafata;
        this.etajImobil = etajImobil;
        this.numarCamere = numarCamere;
        this.numarBai = numarBai;
        this.numarBucatarii = numarBucatarii;
        this.numarBalcoane = numarBalcoane;
        this.utilitati = utilitati;
        this.garaj = garaj;
        this.numarLocuriParcare = numarLocuriParcare;
    }


    public int getEtajImobil() {
        return etajImobil;
    }

    public int getNumarBai() {
        return numarBai;
    }

    public int getNumarBucatarii() {
        return numarBucatarii;
    }

    public List<String> getUtilitati() {
        return utilitati;
    }

    public int getNumarBalcoane() {
        return numarBalcoane;
    }

    public int getNumarCamere() {
        return numarCamere;
    }

    public int getSuprafata() {
        return suprafata;
    }

    public boolean isGaraj() {
        return garaj;
    }

    public int getNumarLocuriParcare() {
        return numarLocuriParcare;
    }

    public void setTipImobil(String tipImobil) {
        this.tipImobil = tipImobil;
    }

    public void setUtilitati(List<String> utilitati) {
        this.utilitati = utilitati;
    }

    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    public void setEtajImobil(int etajImobil) {
        this.etajImobil = etajImobil;
    }

    public void setNumarCamere(int numarCamere) {
        this.numarCamere = numarCamere;
    }

    public void setNumarBai(int numarBai) {
        this.numarBai = numarBai;
    }

    public void setNumarBucatarii(int numarBucatarii) {
        this.numarBucatarii = numarBucatarii;
    }

    public void setNumarBalcoane(int numarBalcoane) {
        this.numarBalcoane = numarBalcoane;
    }

    public void setGaraj(boolean garaj) {
        this.garaj = garaj;
    }

    public void setNumarLocuriParcare(int numarLocuriParcare) {
        this.numarLocuriParcare = numarLocuriParcare;
    }

}
