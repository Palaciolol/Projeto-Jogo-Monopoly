package Jogador.Dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;;

public class Jogador {
    private String nome;
    private String CPF;
    private String email;
    private String foto;

    public Jogador(String nome, String CPF, String email, String foto) { // Construtor
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;

    }

    public void setCPF(String CPF) {
        this.CPF = CPF;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    
    public boolean verificar_CPF() {
        // Retirando todos os caracteres não numéricos do CPF
        CPF = CPF.replaceAll("[^0-9]", "");
        
        // Conferindo se o CPF tem 11 digitos
        if (CPF.length() != 11) {
            return false;
        }
        
        // Verificando se todos os digitos sao iguais
        int iguais = 0;
        char aux = 'a';
        for (int i = 0; i < CPF.length(); i++) {
            if (i == 0) {
                aux = CPF.charAt(0);
                continue;
            } else {
                if (CPF.charAt(i) == aux) {
                    iguais++;
                }
            }
        }
        if (iguais == 10) {
            return false;
        }
        
        // Calculando e verificando os digitos verificadores
        
        // Primeiro digito
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (10 - i) * (int) CPF.charAt(i);
        }
        int verificador1 = soma % 11;
        if (verificador1 < 2) {
            verificador1 = 0;
        } else {
            verificador1 = 11 - verificador1;
        }
        if (verificador1 != CPF.charAt(9)) {
            return false;
        }
        // Segundo digito
        int soma2 = 0;
        for (int i = 0; i < 10; i++) {
            soma2 += (11 - i) * (int) CPF.charAt(i);
        }
        int verificador2 = soma2 % 11;
        if (verificador2 < 2) {
            verificador2 = 0;
        } else {
            verificador2 = 11 - verificador2;
        }
        if (verificador2 != CPF.charAt(10)) {
            return false;
        }
        
        return true;
    }
    
    public boolean verificar_email() {
        //Esse é o metodo para verificar o email
        boolean eh_valido = false;
        if (this.email != null && this.email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(this.email);
            if (matcher.matches()) {
                eh_valido = true;
            }
        }
        return eh_valido;
    }
    public void imprime_jogador() {
        //Essa função imprime os atributos do jogador, verificando se seu cpf e email são válidos.
        System.out.println(this.nome);
        if (verificar_CPF() == true){
            System.out.println(this.CPF);
        }
        else{
            System.out.println("CPF inválido");
        }
        if (verificar_email() == true){
            System.out.println(this.email);
        }
        else{
            System.out.println("Email inválido");
        }
        System.out.println(this.foto);
    }
    
}
