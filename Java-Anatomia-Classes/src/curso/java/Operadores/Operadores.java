package curso.java.Operadores;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem " + "Java";

        System.out.println(nomeCompleto);

        String contatenacao = "?";

        System.out.println(contatenacao);

        contatenacao = 1+1+1+"1";

        System.out.println(contatenacao);

        contatenacao = 1+"1"+1+1;

        System.out.println(contatenacao);

        contatenacao = 1+"1"+1+"1";

        System.out.println(contatenacao);

        contatenacao = "1"+1+1+1;

        System.out.println(contatenacao);

        contatenacao = "1"+(1+1+1);

        System.out.println(contatenacao);

        int numero = 5;

        numero = - numero;

        System.out.println( - numero);

        System.out.println(numero);

        numero =  numero * -1;

        System.out.println(numero);

        int novoNumero = 5;

        //* repetição

        novoNumero = novoNumero + 2;

        System.out.println(novoNumero);

        novoNumero++;

        System.out.println(novoNumero);

        System.out.println(novoNumero++);

        System.out.println(novoNumero);

        System.out.println(++novoNumero);

        System.out.println(novoNumero);

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(variavel);

        int a,b;

        a = 5;

        b = 5;

        String resultado = "";


        //O trecho a abaixo é outra forma de fazer if else
       // String resultado = a==b ?"Verdadeiro": "Falso";

        
        if (a == b) {
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }
        

        System.out.println(resultado);


        int numero1 = 0;

        int numero2 = 1;


        //boolean = simNao = numero1 == numero2; //Isso é a mesma coisa que o if else abaixo

        boolean simNao;

        if (numero1 == numero2) {
            simNao = true;
            System.out.println("Número 1 é igual a Número 2 " + simNao);
        } else {
            simNao = false;
            System.out.println("Número 1 não é igual a Número 2 " + simNao);
        }

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        } else {
            System.out.println("A nossa condição é falsa");
        }

        String nomeUm = "Rodera";
        String nomeDois = "Rodera";

        System.out.println(nomeUm.equals(nomeDois));

        boolean condição1 = true;

        boolean condição2 = true;

        if (condição1 && 7 > 4) {
            System.out.println("Uma das condições é verdadeiras");
        }

        System.out.println("Fim");
        
    }
}
