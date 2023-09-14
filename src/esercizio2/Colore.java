package esercizio2;
/*
Progettare una classe Colore, che permette di
• Rappresentare un colore con i valori RGB (0-255) X
• Esporre due costanti, BIANCO e NERO
Aggiungere il colore alle classi Quadrato e Cerchio
• Che di default sia NERO
Che sia modificabile X
 */

import java.util.Arrays;
import java.util.Scanner;

public class Colore {
    private int[] RGB = new int[3];
    public static final int[] bianco = {255,255,255};
    public static final int[] nero = {0,0,0};

    public Colore(int[] RGB) {
        this.RGB = RGB;
    }

    public int[] getRGB() {
        return RGB;
    }

    public static int[] creaColore(){
        Scanner scanner = new Scanner(System.in);
        int[] colori = new int[3];
        System.out.println("RICORDA IL VALORE DEVE ESSERE COMPRESO TRA 1 E 255");

        System.out.println("Inserisci il valore del rosso : ");

        int valoreRosso=-1;
        while(valoreRosso<0 || valoreRosso>255) {
            valoreRosso = scanner.nextInt();
        }

        System.out.println("Inserisci il valore del verde : ");

        int valoreVerde=-1;
        while(valoreVerde<0 || valoreVerde>255) {
            valoreVerde = scanner.nextInt();
        }
        System.out.println("Inserisci il valore del blu : ");

        int valoreBlu=-1;
        while(valoreBlu<0 || valoreBlu>255) {
            valoreBlu = scanner.nextInt();
        }
        colori[0]=valoreRosso;
        colori[1]=valoreVerde;
        colori[2]=valoreBlu;

        return colori;
    }

    @Override
    public String toString() {
        return "Colore generato: {" +
                "RGB=" + Arrays.toString(RGB) +
                '}';
    }
}
