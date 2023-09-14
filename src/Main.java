// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Contatore conta1 = new Contatore();
        Contatore conta2 = new Contatore(2);

        System.out.println(conta1.getConta());

        conta1.incrementaPuntatore();
        System.out.println(conta1.getConta());

        conta1.azzeraConteggio();
        System.out.println(conta1.getConta());

        conta1.setConta(5);
        System.out.println(conta1.getConta());

        //---------------------------
        System.out.println(" ");

        System.out.println(conta2.getConta());

        conta2.incrementaPuntatore();
        System.out.println(conta2.getConta());

        conta2.azzeraConteggio();
        System.out.println(conta2.getConta());

        conta2.setConta(5);
        System.out.println(conta2.getConta());

    }
}