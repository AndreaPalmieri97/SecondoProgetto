package esercizio2;

/*
Progettare una classe Quadrato, che permetta di
• Istanziare la classe con la dimensione del lato del
quadrato X
• Ottenere il perimetro del quadrato X
• Stampare il quadrato sulla console
Progettare una classe Cerchio, che permetta di
• Istanziare la classe con un costruttore che accetta un
parametro
• Ottenere la circonferenza del cerchio
Ottenere l’area del cerchio
Progettare una classe Colore, che permette di
• Rappresentare un colore con i valori RGB (0-255)
• Esporre due costanti, BIANCO e NERO
Aggiungere il colore alle classi Quadrato e Cerchio
• Che di default sia NERO
Che sia modificabile
*/

public class Quadrato {
    private int lato;

    public Quadrato(int lato) {
        this.lato = lato;
    }

    public void perimetroQuadrato(){
        int perimetro = (lato*4);
        System.out.println("Il perimetro del quadrato è: "+perimetro);
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
