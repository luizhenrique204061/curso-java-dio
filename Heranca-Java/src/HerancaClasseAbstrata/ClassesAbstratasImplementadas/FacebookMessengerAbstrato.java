package HerancaClasseAbstrata.ClassesAbstratasImplementadas;

import HerancaClasseAbstrata.ServicoMensagemInstataneaAbstrato;

public class FacebookMessengerAbstrato extends ServicoMensagemInstataneaAbstrato {

    @Override
    public void enviarMensagem() {
        validarConcetadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Mesenger");
        
    }

    @Override
    public void receberMensagem() {
        validarConcetadoInternet();
        System.out.println("Recebendo mensagem pelo Facebook Mesenger");
        
    }
    
}
