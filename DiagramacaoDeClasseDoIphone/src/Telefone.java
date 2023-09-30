import operacoes.Iphone;
import operacoes.OperadorTelefonico;

public class Telefone implements OperadorTelefonico {


    public void realizarLigacao(){
        System.out.println("Realizando Ligacao");
    }

    public void atendendoLigacao(){
        System.out.println("Atendendo Ligazcao");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando Correio de Voz");
    }
}
