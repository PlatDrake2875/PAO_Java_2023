package java.org.example;


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Object TipAliment = null;
        Aliment aliment = new Aliment("Aliment", 100, 100, 100, new Date(), TipAliment.PORC);

        System.out.println(aliment.toString());

    }
}






