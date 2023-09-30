import operacoes.Iphone;
import operacoes.NavegadorWeb;
import operacoes.OperadorTelefonico;
import operacoes.ReprodutorMusical;

import java.util.Scanner;

public abstract class IphoneClass  extends Operacoes implements  ReprodutorMusical, NavegadorWeb, OperadorTelefonico,Iphone {




    public static void main(String[] args) {

            int resposta;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Iphone");
            System.out.println("O que deseja fazer:");
            System.out.println("1 - Telefone");
            System.out.println("2 - Reprodutor Musical");
            System.out.println("3 - Navegador Web");
            resposta = scanner.nextInt();






        Operacoes operacoes = new Operacoes(new Telefone(), new Reprodutor(), new Navegador());

                while (resposta !=4){

                    if (resposta == 1){
                        operacoes.realizarLigacao();
                        operacoes.atendendoLigacao();
                        operacoes.iniciarCorreioDeVoz();
                    }


                    if (resposta ==2){
                        operacoes.tocarMusica();
                        operacoes.pausarMusica();
                        operacoes.selecionarMusica();
                    }



                    if (resposta==3){
                        operacoes.exibirPagina();
                        operacoes.adicionarNovaPagina();
                        operacoes.atualizaPagina();



                    } else if (resposta == 4) {
                        System.out.println("Saindo");
                    }
                }




    }




}
