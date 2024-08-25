public class SobreMim {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Por favor, forneça nome, sobrenome, idade e altura como argumentos.");
            return; // Encerra o programa se os argumentos não forem suficientes
        }

        String nome = args[0];
        String sobreNome = args[1] + " " + args[2];  // Combina o segundo e o terceiro argumentos para o sobrenome completo
        int idade = Integer.valueOf(args[3]); // Agora a idade é o quarto argumento
        double altura = Double.valueOf(args[4]); // E a altura é o quinto argumento

        System.out.println("Olá, me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m ");
    }
}