package Jogador.Dominio;

import java.util.ArrayList;

import Peca.Dominio.Peca;
import Carta.Carta;

public class Jogador{
    private String nome;
    private String CPF;
    private String email;
    private String foto;
    private  int id;
    private  int dinheiro;
    private Peca peca;
    public static ArrayList<Carta> cartas = new ArrayList<Carta>();
    private static int  num_jogadores = 0;

    public Jogador(){
        setId(num_jogadores);
        num_jogadores++;
        dinheiro = 1000;
    }

    public Jogador(String nome, String CPF, String email, String foto, Peca peca) { // Construtor
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.foto = foto;
        this.peca = peca;
        setId(num_jogadores);
        dinheiro = 1000;
        num_jogadores++;
    }

    public void setId(int id) {
        this.id = id;
}
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public  int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
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

    public Peca getPeca() {
        return peca;
    }
    
    public void setPeca(Peca peca) {
        this.peca = peca;
    }
    
    
    public ArrayList<Carta> getCartas() {
        return cartas;
    }
    

    public boolean adicionar_carta(Carta i){
        return cartas.add(i);
    }

    public boolean remover_carta(int i){
        return cartas.remove((Object)i);
    }
    
    @Override
    public String toString() {
        return "nome = " + nome + ", CPF = " + CPF + ", email = " + email + ", foto = " + foto + ", id = " + id
                + ", dinheiro = " + dinheiro + ", peca : " + peca + ", cartas =" + cartas + "";
    }
    
    
}
