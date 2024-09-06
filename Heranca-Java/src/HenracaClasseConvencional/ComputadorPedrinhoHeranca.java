package HenracaClasseConvencional;
import HenracaClasseConvencional.ClassesHerdadas.FacebookMessenger;
import HenracaClasseConvencional.ClassesHerdadas.MSNMessenger;
import HenracaClasseConvencional.ClassesHerdadas.Telegram;

public class ComputadorPedrinhoHeranca {
    public static void main(String[] args) {
        System.out.println("MSN");
        
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");
        FacebookMessenger facebook = new FacebookMessenger();

        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("Telegram");
        Telegram telegram = new Telegram();

        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
