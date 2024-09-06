package HerancaClasseAbstrata;
public abstract class ServicoMensagemInstataneaAbstrato {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //Apenas os filhos presentes no mesmo pacote tem acesso
    protected void validarConcetadoInternet() {
        System.out.println("Validando se está concetado com a internet");
    }
}
