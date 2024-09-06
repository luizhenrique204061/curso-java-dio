package HenracaClasseConvencional;
public class ServicoMensagemInstantanea {
    
    public void enviarMensagem() {
        //Primeiro confirma se está conectado a internet
        validarConcetadoInternet();
    
        System.out.println("Enviando mensagem");
        //Depois de enviada, salva o histórico da mensagem
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    //Métodos privados, visíveis somente na classe
    private void validarConcetadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico da mensagem");
    }
}
