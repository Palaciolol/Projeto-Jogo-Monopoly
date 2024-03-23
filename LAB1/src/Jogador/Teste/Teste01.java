package Jogador.Teste;

import Jogador.Dominio.Jogador;

public class Teste01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Lucas", "12345678912", "lucaspalacioa", "fsdfsdfksdf");
        jogador.setEmail("lucaspalacioa@gmail.com");
        jogador.setNome("Lucas");
        jogador.setCPF("12345678912");
        jogador.setFoto("Cringe");
        boolean oi = jogador.verificar_CPF();
        System.out.println(oi);
    }
}
