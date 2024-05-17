package Métodos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Tabuleiro.Dominio.Tabuleiro;

public class Utilidades {
    public static boolean verificar_CPF(String CPF) {
        // Retirando todos os caracteres não numéricos do CPF
        CPF = CPF.replaceAll("[^0-9]", "");

        // Conferindo se o CPF tem 11 digitos
        if (CPF.length() != 11) {
            return false;
        }

        // Verificando se todos os digitos sao iguais
        int cont = 0;
        char inicial = CPF.charAt(0);
        for (int i = 1; i < CPF.length(); i++) {
            if (CPF.charAt(i) != inicial) {
                break;
            } else {
                cont++;
            }
        }
        if (cont == 10) {
            return false;
        }

        // Calculando e verificando os digitos verificadores

        // Primeiro digito
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (10 - i) * Character.getNumericValue(CPF.charAt(i));
        }
        int verificador1 = soma % 11;
        if (verificador1 < 2) {
            verificador1 = 0;
        } else {
            verificador1 = 11 - verificador1;
        }
        if (verificador1 != Character.getNumericValue(CPF.charAt(9))) {
            return false;
        }
        // Segundo digito
        int soma2 = 0;
        for (int i = 0; i < 10; i++) {
            soma2 += (11 - i) * Character.getNumericValue(CPF.charAt(i));
        }
        int verificador2 = soma2 % 11;
        if (verificador2 < 2) {
            verificador2 = 0;
        } else {
            verificador2 = 11 - verificador2;
        }
        if (verificador2 != Character.getNumericValue(CPF.charAt(10))) {
            return false;
        }

        return true;
    }

    public static boolean verificar_email(String email) {
        // Esse é o metodo para verificar o email
        boolean eh_valido = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                eh_valido = true;
            }
        }
        return eh_valido;
    }
    public static void listar_jogadores(int quant_jog){
        System.out.println("Opções:");
        for (int i = 0; i < quant_jog; i++){
            System.out.print(Tabuleiro.jogadores.get(i).getNome());
            System.out.println(" ------ " + Tabuleiro.jogadores.get(i).getId());
        }

    
}
}
