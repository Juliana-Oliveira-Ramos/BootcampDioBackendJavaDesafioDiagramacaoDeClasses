import operacoes.Iphone;
import operacoes.NavegadorWeb;

public abstract class Navegador  implements NavegadorWeb {


    public void exibirPagina(){
        System.out.println("Exibindo Nova Paqina");
    }
    public void adicionarNovaPagina(){
        System.out.println("Adicionando Nova Pagina");
    }
    public void atualizaPagina(){
        System.out.println("Atualizando Pagina");
    }
}
