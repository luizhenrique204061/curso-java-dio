package HerancaClasseAbstrata.ClassesAbstratasImplementadas;

import HerancaClasseAbstrata.ServicoMensagemInstataneaAbstrato;

public class TelegramAbstrato extends ServicoMensagemInstataneaAbstrato {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram");
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
        
    }
    
}
