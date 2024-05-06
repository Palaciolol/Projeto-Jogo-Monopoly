package Métodos;

import java.util.Scanner;
import Terreno.Dominio.Terreno;

public class LerTerreno {
    public static Terreno le_terreno(){
        Scanner entrada = new Scanner(System.in);
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
        Terreno terr = new Terreno("terreno_teste", nome_terr, nome_dono, preco, valor_aluguel, num_casas, valor_construcao, valor_hotel, true);
        entrada.close();
        return terr;
    }
}
