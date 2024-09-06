package HerancaClasseAbstrata.ClassesAbstratasImplementadas;

import HerancaClasseAbstrata.ServicoMensagemInstataneaAbstrato;

public class MSNMessengerAbstrato extends ServicoMensagemInstataneaAbstrato {

    @Override
    public void enviarMensagem() {
        validarConcetadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
        
    }

    @Override
    public void receberMensagem() {
        validarConcetadoInternet();
        System.out.println("Recebendo mensagen pelo MSN Messenger");
        
    }
    
}
