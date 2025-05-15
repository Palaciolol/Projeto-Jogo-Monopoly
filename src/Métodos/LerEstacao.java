package Métodos;

import Estacao.Dominio.Estacao;
import java.util.Scanner;


public class LerEstacao {
    public static Estacao le_estacao(Scanner entrada){
        System.out.println("Digite o nome da Estação");
        String nome_est = entrada.nextLine();
        System.out.println("Digite o nome do Dono");
        String nome_dono_est = entrada.nextLine();
        System.out.println("Digite o preço");
        int preco_est = entrada.nextInt();
        System.out.println("Digite o valor do aluguel");
        int valor_aluguel_est = entrada.nextInt();
        Estacao est = new Estacao("estação_teste", nome_est, nome_dono_est, preco_est, valor_aluguel_est);
        return est;
    }
}
