package curso.java.ConversoesDeTipo.tiposdevariaveis;

public class ConversoesDeTipo {
    public static void main(String[] args) {
        
        //Valor String
        String valorDoSalarioTexto = "2250.45";

        System.out.println("Texto " + valorDoSalarioTexto);

        //Valor Double
        double valorDoSalarioDouble = Double.parseDouble(valorDoSalarioTexto);

        System.out.println("Double " + valorDoSalarioDouble);

        //Valor Int
        int valorDoSalarioInteiro = (int) valorDoSalarioDouble;

        System.out.println("Inteiro " + valorDoSalarioInteiro);
        
        //Voltando a String
        
        String voltandoStringInt = String.valueOf(valorDoSalarioInteiro);

        System.out.println("Inteiro para String " + voltandoStringInt);

        String voltandoStringDouble = Double.toString(valorDoSalarioDouble);

        System.out.println("Double para String " + voltandoStringDouble);

        //Conversão de Double para Int e vice versa

        double tipoDouble = 50.42;

        System.out.println("Tipo Double " + tipoDouble);

        int tipoInt = (int) tipoDouble;

        System.out.println(tipoInt);

        int segundoTipoInt = 100;

        System.out.println("Tipo Int " + segundoTipoInt);

        double segundoTipoDouble = (double) segundoTipoInt;

        System.out.println(segundoTipoDouble);
    }
}
