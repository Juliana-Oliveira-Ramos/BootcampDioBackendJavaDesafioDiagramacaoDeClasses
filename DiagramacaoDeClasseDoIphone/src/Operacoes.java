import operacoes.NavegadorWeb;
import operacoes.OperadorTelefonico;
import operacoes.ReprodutorMusical;

public abstract class Operacoes implements NavegadorWeb, OperadorTelefonico, ReprodutorMusical {
    private Telefone telefone;
    private Reprodutor reprodutor;
    private Navegador navegador;

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web: ");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova aba do navegador");
    }

    @Override
    public void atualizaPagina() {
        System.out.println("Atualizando a página do navegador");
    }

    @Override
    public void realizarLigacao() {
        System.out.println("Fazendo uma ligação...");
    }

    @Override
    public void atendendoLigacao() {
        System.out.println("Atendendo uma chamada...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica: " );
    }

    public Operacoes(Telefone telefone, Reprodutor reprodutor, Navegador navegador) {
        this.telefone = telefone;
        this.reprodutor = reprodutor;
        this.navegador = navegador;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public Reprodutor getReprodutor() {
        return reprodutor;
    }

    public Navegador getNavegador() {
        return navegador;
    }
}
