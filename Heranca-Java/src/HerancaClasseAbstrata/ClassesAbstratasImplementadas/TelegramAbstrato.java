package HerancaClasseAbstrata.ClassesAbstratasImplementadas;

import HerancaClasseAbstrata.ServicoMensagemInstataneaAbstrato;

public class TelegramAbstrato extends ServicoMensagemInstataneaAbstrato {

    @Override
    public void enviarMensagem() {
        validarConcetadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        
    }

    @Override
    public void receberMensagem() {
        validarConcetadoInternet();
        System.out.println("Recebendo mensagem pelo Telegram");
        
    }
    
}
