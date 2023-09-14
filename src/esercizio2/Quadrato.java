package esercizio2;

/*
Progettare una classe Quadrato, che permetta di
• Istanziare la classe con la dimensione del lato del
quadrato X
• Ottenere il perimetro del quadrato X
• Stampare il quadrato sulla console X
*/

import java.util.Arrays;

public class Quadrato {
    private int lato;
    private int[] colore = Colore.nero;

    public Quadrato(int lato) {
        this.lato = lato;
    }

    public void perimetroQuadrato(){
        int perimetro = (lato*4);
        System.out.println("Il perimetro del quadrato è: "+perimetro);
    }

    public void setColore(int[] colore) {
        this.colore = colore;
    }

    public String getColore() {
        return Arrays.toString(colore);
    }

    public void stampaQuadrato(){
        for(int i=0; i<lato;i++){
            for(int j=0; j<lato; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }



    }

}
