/*
 * Monopoly.java
 * 
 * Última modificação: 05/05
 */

import Jogador.Dominio.Jogador;
import Métodos.LerEstacao;
import Métodos.LerJogador;
import Métodos.LerServico;
import Métodos.LerTerreno;
import Métodos.Utilidades;
import CartaSorte.Dominio.CartaSorte;
import CartaSorte.Dominio.TipoCarta;
import Estacao.Dominio.Estacao;
import Peca.Dominio.Peca;
import ServicoPublico.Dominio.ServicoPublico;
import Tabuleiro.Dominio.Tabuleiro;
import Terreno.Dominio.Terreno;
import java.util.Scanner;
import java.util.Random;



//Esta classe contém a estrutura de implementação de um jogo Monopoly
public class Monopoly {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem vindo ao Monopoly!!");
        System.out.println("Quantos jogadores vão jogar? ");
        int quant_jog = entrada.nextInt();
        entrada.nextLine();
        Tabuleiro tabuleiro = new Tabuleiro();
        
        for (int i = 0; i < quant_jog; i++) {
            Jogador jogador = LerJogador.le_jogador(entrada);
            tabuleiro.addJogador(jogador);
        
        }
        tabuleiro.iniciarArquivo("arquivo.txt");
        tabuleiro.salvaLog("arquivo.txt", "Informações dos jogadores: ");

        //Criação de Carta Sorte
        CartaSorte carta = new CartaSorte("O gerente ficou maluco, ganhe 1000", "Dia de sorte", TipoCarta.SORTE);
        carta.set_valor(1000);

        //O método Distribuir Cartas não foi feito pois não faz sentido na minha lógica de jogo.
        
        int opcao;
        do {
            System.out.println("O que você gostaria de fazer?");
            System.out.println("0 - Sair");
            System.out.println("1 - Remover Jogador");
            System.out.println("2 - Comprar Serviço Público");
            System.out.println("3 - Comprar Terreno");
            System.out.println("4 - Comprar Estação");
            System.out.println("5 - Ver informações de jogador");
            System.out.println("6 - Mover um jogador");
            System.out.println("7 - Sorte ou Revés?");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 0:
                    System.out.println("Finalizando ...");
                    break;
                case 1:
                    System.out.println("Digite o id do jogador que você gostaria de remover");
                    Utilidades.listar_jogadores(quant_jog, tabuleiro);
                    int remocao = entrada.nextInt();
                    tabuleiro.salvaLog("arquivo.txt", "Jogador número " + remocao + " foi removido do jogo");
                    tabuleiro.removerJogador(remocao);
                    break;
                case 2:
                    System.out.println("Primeiro crie o Serviço Público");
                    ServicoPublico serv = LerServico.le_servico(entrada);
                    entrada.nextLine();
                    tabuleiro.addPropriedade(serv);
                    
                    System.out.println("Digite o id do jogador que está comprando: ");
                    Utilidades.listar_jogadores(quant_jog, tabuleiro);
                    int id = entrada.nextInt();
                    
                    tabuleiro.jogadores.get(id).getDinheiro();
                    
                    boolean comprou_serv = serv.comprar_servico(tabuleiro.jogadores.get(id).getDinheiro());
                    serv.setDono(tabuleiro.jogadores.get(id));
                    
                    Jogador.cartas.add(serv);
        
                    if (comprou_serv) {
                        tabuleiro.salvaLog("arquivo.txt", "Jogador número " + id + " comprou " + serv.getNome() + "");
                    }
                    else{
                        System.out.println("Você não tem dinheiro suficiente para comprar este Serviço Público");
                    }
                    break;
                case 3:
                    System.out.println("Primeiro crie o Terreno");
                    Terreno terr =  LerTerreno.le_terreno(entrada);
                    tabuleiro.addPropriedade(terr);
                    System.out.println("Digite o id do jogador que está comprando: ");
                    Utilidades.listar_jogadores(quant_jog, tabuleiro);
                    int id2 = entrada.nextInt();
                    boolean comprou_terr = terr.comprar_terreno(tabuleiro.jogadores.get(id2).getDinheiro());
                    terr.setDono(tabuleiro.jogadores.get(id2));
                    Jogador.cartas.add(terr);
                    
            
                    if (comprou_terr) {
                        tabuleiro.salvaLog("arquivo.txt", "Jogador número " + id2 + " comprou " + terr.getNome() + "");
                    }
                    else{
                        System.out.println("Você não tem dinheiro suficiente para comprar este Terreno");
                    }
                    break;
                case 4:
                    System.out.println("Primeiro crie a Estação");
                    Estacao est = LerEstacao.le_estacao(entrada);
                    tabuleiro.addPropriedade(est);
                    System.out.println("Digite o id do jogador que está comprando: ");
                    Utilidades.listar_jogadores(quant_jog, tabuleiro);
                    int id3 = entrada.nextInt();
                    boolean comprou_est = est.comprar_estacao(tabuleiro.jogadores.get(id3).getDinheiro());
                    est.setDono(tabuleiro.jogadores.get(id3));
                    Jogador.cartas.add(est);
            
                    if (comprou_est) {
                        tabuleiro.salvaLog("arquivo.txt", "Jogador número " + id3 + " comprou " + est.getNome() + "");
                    }
                    else{
                        System.out.println("Você não tem dinheiro suficiente para comprar esta Estação");
                    }
                    break;
                case 5:
                    System.out.println("Digite o id do jogador que você gostaria de ver informações");
                    Utilidades.listar_jogadores(quant_jog, tabuleiro);
                    int id4 = entrada.nextInt();
                    Peca peca = new Peca();
                    peca = tabuleiro.jogadores.get(id4).getPeca();
                    System.out.println(tabuleiro.jogadores.get(id4).toString()); // impressão do jogador
                    System.out.println("Posição do jogador: " + peca.getPos());
                    break;
                
                case 6:
                    System.out.println("Escolha o Id do jogador que irá se mover");
                    Utilidades.listar_jogadores(quant_jog, tabuleiro);
                    int id5 = entrada.nextInt();
                    Random dado = new Random();
                    int resultado_dado = dado.nextInt(6) + 1;
                    Peca peca2 = new Peca();
                    peca2 = tabuleiro.jogadores.get(id5).getPeca();
                    peca2.setPos(resultado_dado);
                    tabuleiro.salvaLog("arquivo.txt", "Jogador número " + id5 + " se moveu " + resultado_dado + " casas");
                    break;
                case 7:
                    System.out.println("Escolha o Id do jogador que irá tirar uma carta");
                    Utilidades.listar_jogadores(quant_jog, tabuleiro);
                    int id6 = entrada.nextInt();
                    carta.executaAcao(tabuleiro.jogadores.get(id6));
                    tabuleiro.salvaLog("arquivo.txt", "Jogador número " + id6 + " tirou uma carta sorte");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        } while (opcao != 0);
        
    }
}
