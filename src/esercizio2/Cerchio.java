package esercizio2;

public class Cerchio {
/*
Progettare una classe Cerchio, che permetta di
• Istanziare la classe con un costruttore che accetta un
parametro X
• Ottenere la circonferenza del cerchio X
Ottenere l’area del cerchio X
*/
    private int raggio;

    public Cerchio(int raggio) {
        this.raggio = raggio;
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
