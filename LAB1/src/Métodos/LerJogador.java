package Métodos;

import Jogador.Dominio.Jogador;
import java.util.Scanner;
import Peca.Dominio.Peca;

public class LerJogador {
    public static Jogador le_jogador(Scanner entrada){
        Jogador jogador1 = new Jogador();
        System.out.println("Vamos preencher seu dados para começar a jogar! Qual o seu nome? ");
        jogador1.setNome(entrada.nextLine());
        System.out.println("Agora digite seu CPF: ");
        String cpf = entrada.nextLine();
        //boolean eh_valido_cpf = false;
        // Esse loop faz a validação do CPF
        /* 
        while (eh_valido_cpf == false) {
            eh_valido_cpf = Utilidades.verificar_CPF(cpf);
            if (eh_valido_cpf == true) {
                break;
            }
            System.out.println("Digite um cpf válido!!!");
            cpf = entrada.nextLine();
        }
        /* */
        jogador1.setCPF(cpf);
        /*
         * 
         * 
         while (email_valido == false) {
             email_valido = Utilidades.verificar_email(email);
             if (email_valido == true) {
                 break;
             }
             System.out.println("Digite um email válido!!!");
             email = entrada1.nextLine();
         }
         * 
         */
        System.out.println("Digite seu email: ");
        String email = entrada.nextLine();
        //boolean email_valido = false;
        // Esse loop faz a validação do email
        jogador1.setEmail(email);
        System.out.println("E agora sua foto mais bonita: ");
        jogador1.setFoto(entrada.nextLine());
        System.out.println("Escolha uma cor para sua peça: ");
        String cor = entrada.nextLine();
        Peca peca = new Peca(cor, 0);
        jogador1.setPeca(peca);
        return jogador1;
    }
}
