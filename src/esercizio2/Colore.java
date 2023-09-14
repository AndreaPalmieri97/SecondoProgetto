package esercizio2;
/*
Progettare una classe Colore, che permette di
• Rappresentare un colore con i valori RGB (0-255)
• Esporre due costanti, BIANCO e NERO
Aggiungere il colore alle classi Quadrato e Cerchio
• Che di default sia NERO
Che sia modificabile
 */

public class Colore {
    private int[] RGB = new int[3];

    public Colore(int[] RGB) {
        this.RGB = RGB;
    }

}
