package esercizio2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ESERCIZIO1
        Quadrato quadrato = new Quadrato(10);
        quadrato.stampaQuadrato();

        //----------
        System.out.println("");
        //---------

        //ESERCIZIO2
        Cerchio cerchio= new Cerchio(4);
        cerchio.calcolaArea();
        cerchio.calcolaCirconferenza();

        //ESERCZIO3
        int[] colori = Colore.creaColore();
        Colore RGB = new Colore(colori);
        System.out.println(RGB.toString());

        cerchio.setColore(Colore.creaColore());
        System.out.println(cerchio.getColore());
        quadrato.setColore(Colore.creaColore());
        System.out.println(quadrato.getColore());

    }
}
