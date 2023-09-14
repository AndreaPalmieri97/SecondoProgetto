package esercizio2;

import java.util.Arrays;

public class Cerchio {
/*
Progettare una classe Cerchio, che permetta di
• Istanziare la classe con un costruttore che accetta un
parametro X
• Ottenere la circonferenza del cerchio X
Ottenere l’area del cerchio X
*/
    private int raggio;
    private int[] colore = Colore.nero;

    public Cerchio(int raggio) {
        this.raggio = raggio;
    }

    public void setColore(int[] colore) {
        this.colore = colore;
    }

    public String getColore() {
        return Arrays.toString(colore);
    }

    public void calcolaCirconferenza(){
        double circonferenza = (raggio*2*3.14);
        System.out.println("La circonferenza del cerchio è: "+circonferenza);
    }

    public void calcolaArea(){
        double area = (3.14*(raggio*raggio));
        System.out.println("L'area del cerchio è: "+area);
    }
}
