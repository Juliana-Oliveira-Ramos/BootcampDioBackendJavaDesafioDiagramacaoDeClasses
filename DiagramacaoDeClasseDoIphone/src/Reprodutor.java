import operacoes.Iphone;
import operacoes.ReprodutorMusical;

public abstract class Reprodutor implements ReprodutorMusical {

    public void tocarMusica(){
        System.out.println("Tocando Musica");
    }

    public void pausarMusica(){
        System.out.println("Pausando Musica");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando Musica");
    }
}
