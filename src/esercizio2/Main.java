package esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        int[] colori = new int[3];
        System.out.println("Inserisci il valore del rosso : ");

        int valoreRosso=-1;
        while(valoreRosso<0 || valoreRosso>255) {
            valoreRosso = scanner.nextInt();
        }

    }
}
