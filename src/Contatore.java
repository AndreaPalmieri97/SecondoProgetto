/* Progettare una classe Contatore che permetta di
• Istanziare la classe con un valore iniziale X
• Istanziare la classe senza un valore iniziale X
• Incrementare il conteggio attuale X
• Ottenere il conteggio attuale X
• Resettare il conteggio a zero X
• Resettare il conteggio ad un altro valore*/

public class Contatore {
    private int conta;

    public Contatore() {
    }

    public Contatore(int conta) {
        this.conta = conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void incrementaPuntatore(){
        conta++;
    }

    public int getConta() {
        return conta;
    }

    public void azzeraConteggio(){
        conta=0;
    }

}
