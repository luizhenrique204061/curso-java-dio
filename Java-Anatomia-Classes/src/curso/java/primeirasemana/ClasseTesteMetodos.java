package curso.java.PrimeiraSemana;
public class ClasseTesteMetodos {
    public static void main(String[] args) {
        String primeiroNome = "Luiz";
        String segundoNome = "Henrique";

        nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNone) {
        return primeiroNome.concat(" ").concat(segundoNone);
    }
}
