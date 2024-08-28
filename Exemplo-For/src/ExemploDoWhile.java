import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {

        /* //Essa é outra forma de fazer o do-while
         while (true) {
            //Executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

            if (tocando()) {
                break;
            }
        } 
        

        System.out.println("Alô");
         */
        do {
            //Executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        } while (tocando());
        

        System.out.println("Alô");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu; 
    }

    /* //Esse código é uma forma alternativa da função
    private static boolean tocando() {
    int valorAleatorio = new Random().nextInt(3);
    boolean atendeu;

    if (valorAleatorio == 1) {
        atendeu = true;
    } else {
        atendeu = false;
    }

    System.out.println("Atendeu? " + atendeu);
    return !atendeu;
}
     */
}
