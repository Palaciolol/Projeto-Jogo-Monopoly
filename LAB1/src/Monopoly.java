/*
 * Monopoly.java
 * 
 * Última modificação: 12/04
 */

import Jogador.Dominio.Jogador;
import Métodos.Dominio.Utilidades;
//import CartaSorte.Dominio.CartaSorte;
import Estacao.Dominio.Estacao;
//import Peca.Dominio.Peca;
//import Propriedade.Dominio.Propriedade;
import ServicoPublico.Dominio.ServicoPublico;
import Tabuleiro.Dominio.Tabuleiro;
import Terreno.Dominio.Terreno;
import java.util.ArrayList;
import java.util.Scanner;

//Esta classe contém a estrutura de implementação de um jogo Monopoly
public class Monopoly {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista_jogadores = new ArrayList<>();
        ArrayList<Integer> lista_propriedades = new ArrayList<>();
        Tabuleiro tabuleiro = new Tabuleiro(lista_jogadores, lista_propriedades); // instância da classe tabuleiro.
        Jogador jogador1 = new Jogador(); // instância da classe jogador.
        Jogador jogador2 = new Jogador(); // instância da classe jogador.

        System.out.println("Bem vindo ao Monopoly!!");
        System.out.println("Vamos preencher seu dados para começar a jogar!Qual o seu nome? ");
        jogador1.setNome(entrada.nextLine());
        System.out.println("Agora digite seu CPF: ");
        String cpf = entrada.nextLine();
        boolean eh_valido_cpf = false;
        // Esse loop faz a validação do CPF
        while (eh_valido_cpf == false) {
            eh_valido_cpf = Utilidades.verificar_CPF(cpf);
            if (eh_valido_cpf == true) {
                break;
            }
            System.out.println("Digite um cpf válido!!!");
            cpf = entrada.nextLine();
        }
        jogador1.setCPF(cpf);

        System.out.println("Digite seu email: ");
        String email = entrada.nextLine();
        boolean email_valido = false;
        // Esse loop faz a validação do email
        while (email_valido == false) {
            email_valido = Utilidades.verificar_email(email);
            if (email_valido == true) {
                break;
            }
            System.out.println("Digite um email válido!!!");
            email = entrada.nextLine();
        }
        jogador1.setEmail(email);
        System.out.println("E agora sua foto mais bonita!: ");
        jogador1.setFoto(entrada.nextLine());

        tabuleiro.adicionar_jogador(jogador1.getId()); // adicionando um jogador ao tabuleiro
        tabuleiro.adicionar_jogador(jogador2.getId()); // adicionando um jogador ao tabuleiro
        tabuleiro.remover_jogador(1); // removendo um jogador do tabuleiro

        System.out.println("Vamos adicionar um um terreno nesse tabuleiro!");
        System.out.println("Digite o nome do Terreno");
        String nome_terr = entrada.nextLine();
        System.out.println("Digite o nome do Dono");
        String nome_dono = entrada.nextLine();
        System.out.println("Digite o preço");
        int preco = entrada.nextInt();
        System.out.println("Digite o valor do aluguel");
        int valor_aluguel = entrada.nextInt();
        System.out.println("Digite o número de casas");
        int num_casas = entrada.nextInt();
        System.out.println("Digite o valor da construção da casa");
        int valor_construcao = entrada.nextInt();
        System.out.println("Digite o valor do hotel");
        int valor_hotel = entrada.nextInt();
        Terreno terr1 = new Terreno(nome_terr, nome_dono, preco, valor_aluguel, num_casas, valor_construcao,
                valor_hotel, true);
        entrada.nextLine();

        System.out.println("Agora uma estação!");
        System.out.println("Digite o nome da Estação");
        String nome_est = entrada.nextLine();
        System.out.println("Digite o nome do Dono");
        String nome_dono_est = entrada.nextLine();
        System.out.println("Digite o preço");
        int preco_est = entrada.nextInt();
        System.out.println("Digite o valor do aluguel");
        int valor_aluguel_est = entrada.nextInt();
        Estacao est1 = new Estacao(nome_est, nome_dono_est, preco_est, valor_aluguel_est);
        entrada.nextLine();

        System.out.println("Agora um Serviço Público!");
        System.out.println("Digite o nome do Serviço Público");
        String nome_ser = entrada.nextLine();
        System.out.println("Digite o nome do Dono");
        String nome_dono_ser = entrada.nextLine();
        System.out.println("Digite o preço");
        int preco_ser = entrada.nextInt();
        System.out.println("Digite o valor do aluguel");
        int valor_aluguel_ser = entrada.nextInt();
        System.out.println("Digite o valor do multiplicador de dados");
        int dado = entrada.nextInt();
        ServicoPublico serv1 = new ServicoPublico(nome_ser, nome_dono_ser, preco_ser, valor_aluguel_ser, dado);
        entrada.close();

        tabuleiro.adicionar_propriedade(terr1.getId());
        tabuleiro.adicionar_propriedade(est1.getId()); // adicionando uma propriedade ao tabuleiro
        tabuleiro.adicionar_propriedade(serv1.getId()); // adicionando uma propriedade ao tabuleiro
        tabuleiro.remover_propriedade(1); // removendo uma propriedade do tabuleiro

        System.out.println(terr1.calcular_aluguel()); // Calculando o aluguel de um terreno
        System.out.println(est1.calcular_aluguel()); // Calculando o aluguel de uma estação
        System.out.println(serv1.calcular_aluguel()); // Calculando o aluguel de um serviço público

        boolean comprou_casa = terr1.comprar_casa(jogador1.getDinheiro());
        boolean comprou_hotel = terr1.comprar_hotel(jogador1.getDinheiro());

        if (comprou_casa) {
            System.out.println("Casa comprada!");
        }
        if (comprou_hotel) {
            System.out.println("Hotel comprado!");
        }

        System.out.println(jogador1.toString()); // impressão do jogador
        System.out.println(terr1.toString()); // imprimindo o terreno
        System.out.println(est1.toString()); // imprimindo a estação
        System.out.println(serv1.toString()); // imprimindo o Serviço publico
    }
}
