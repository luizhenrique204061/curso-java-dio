package curso.java.PrimeiraSemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        double mediaFinal = 6;
       // double mediaFinal = 5.99999999999999999; //Código arredondado
        if (mediaFinal < 6) {
            System.out.println("REPROVADO");
        } else if (mediaFinal == 6 ) {
            System.out.println("PROVA MINERVA");
        } else {
            System.out.println("APROVADO");
        }
    }
}
