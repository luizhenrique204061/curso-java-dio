import java.util.concurrent.ThreadLocalRandom;
import java.util.*;;

public class SelecionarCandidatos {
    public static void main(String[] args) {
        //selecaoDeCandidatos();
        //imprimirSelecionados();
        ligarParaOsCandidatos();
    }

    static void ligarParaOsCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentanto = true;
        boolean atendeu = false;
        
        do {
            atendeu = atender();
            continuaTentanto = !atendeu;
            if (continuaTentanto) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuaTentanto && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " , NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n°" + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação");

        //For each
        for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoDeCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " Foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean atender() {
        int numeroAleatorio = new Random().nextInt(3);
        boolean atendeu = false;
        if (numeroAleatorio == 1) {
            atendeu = true;
        } else {
            atendeu = false;
        }
        return !atendeu;
    }
}
