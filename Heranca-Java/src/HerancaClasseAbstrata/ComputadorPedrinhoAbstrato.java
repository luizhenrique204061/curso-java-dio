package HerancaClasseAbstrata;

import HerancaClasseAbstrata.ClassesAbstratasImplementadas.FacebookMessengerAbstrato;
import HerancaClasseAbstrata.ClassesAbstratasImplementadas.MSNMessengerAbstrato;
import HerancaClasseAbstrata.ClassesAbstratasImplementadas.TelegramAbstrato;

class ComputadorPedrinhoAbstrato {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMessengerAbstrato msn = new MSNMessengerAbstrato();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");
        FacebookMessengerAbstrato facebook = new FacebookMessengerAbstrato();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("Telegram");
        TelegramAbstrato telegram = new TelegramAbstrato();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
    
}