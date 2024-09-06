package Polimorfismo;

import HerancaClasseAbstrata.ServicoMensagemInstataneaAbstrato;
import HerancaClasseAbstrata.ClassesAbstratasImplementadas.FacebookMessengerAbstrato;
import HerancaClasseAbstrata.ClassesAbstratasImplementadas.MSNMessengerAbstrato;
import HerancaClasseAbstrata.ClassesAbstratasImplementadas.TelegramAbstrato;

public class PolimorfismoComputadorPedrinho {

    public static void main(String[] args) {
        ServicoMensagemInstataneaAbstrato smi = null;

    /*
     * NÃO SE SABE QUAL APP
     * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
     */

     String appEscolhido = "tlg";

     if (appEscolhido.equals("msn")) {
        smi = new MSNMessengerAbstrato();
     } else if (appEscolhido.equals("fbm")) {
        smi = new FacebookMessengerAbstrato();
     } else if (appEscolhido.equals("tlg")) {
        smi = new TelegramAbstrato();
     }

     smi.enviarMensagem();
     smi.receberMensagem();

     //Apenas os filhos presentes no mesmo pacote tem acesso
     //smi.validarConcetadoInternet();
    }
}
