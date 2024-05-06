package Métodos;

import ServicoPublico.Dominio.ServicoPublico;
import java.util.Scanner;


public class LerServico {
    public static ServicoPublico le_servico(){
        Scanner entrada = new Scanner(System.in);
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
        ServicoPublico serv = new ServicoPublico("serviço_teste", nome_ser, nome_dono_ser, preco_ser, valor_aluguel_ser, dado);
        entrada.close();
        return serv;
    }
}
