import java.util.Locale;
import java.util.Scanner;

public class ScannerEntradaException {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        double altura = 0.0;
        String nome = "";
        String sobrenome = "";
        int idade = 0;

        //Validação de altura
        while (true) {
            System.out.println("Digite sua altura");
            if (scanner.hasNextDouble()) {
                altura = scanner.nextDouble();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Por favor digite um valor válido (exemplo: 1.80)");
                scanner.nextLine();
            }
        }

        //Validação para nome
        while (true) {
            System.out.println("Digite o seu nome");
            nome = scanner.nextLine();
            if (nome.matches("[A-Za-z ]+")) { // Verifica se o nome contém apenas letras
                break;
            } else {
                System.out.println("Por favor digite um valor válido (Exemplo: Carlos, André)");
            }
        }

        //Validação para sobrenome
        while (true) {
            System.out.println("Digite o seu sobrenome");
            sobrenome = scanner.nextLine();
            if (sobrenome.matches("[A-Za-z ]+")) {
                break;
            } else {
                System.out.println("Por favor digite um valor válido (Exemplo: Silva, Muller)");
            }
        }

        //Validação para a idade
        while (true) {
            System.out.println("Digita a sua idade");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                scanner.nextLine();
                if (idade > 0) {
                    break;
                } else {
                    System.out.println("Erro a idade deve ser um número positivo");
                }
            } else {
                System.out.println("Por favor insira um número inteiro");
                scanner.nextLine();
            }
        }

        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm");
    }
}