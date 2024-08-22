package curso.java.ConversoesDeTipo;

public class TiposDeVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2.500;

        // int salarioInteiro = (int) salarioMinimo;

        int salarioInteiro = (int) salarioMinimo;

        System.out.println("Salário Inteiro " + salarioInteiro);

        String salarioString = String.valueOf(salarioMinimo);



        short numeroCurto = 1;

        int numeroNormal = numeroCurto;

        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);

        System.out.println("Salário String " + salarioString);

        System.out.println(salarioMinimo);


        int numero = 1;

        numero = 2;

        String valorString = "30.40";

        double stringConvertida = Double.parseDouble(valorString);

        System.out.println(stringConvertida);


        //Convertendo de Int para Double

        int dez = 10;


        System.out.println(dez);

        double dezDecimal = (int) dez;

        System.out.println(dezDecimal);

        //Valor Nunca Poderá Mudar

        final double VALOR_DE_PI = 3.14;


        System.out.println(VALOR_DE_PI);
    }
}
