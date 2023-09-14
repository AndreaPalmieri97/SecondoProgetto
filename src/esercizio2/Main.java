package esercizio2;

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
    }
}
