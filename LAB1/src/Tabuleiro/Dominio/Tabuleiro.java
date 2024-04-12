package Tabuleiro.Dominio;
import java.util.ArrayList;

public class Tabuleiro {
    private ArrayList<Integer> jogadores;
    private ArrayList<Integer> propriedades;

    public Tabuleiro(ArrayList<Integer> jogadores, ArrayList<Integer> propriedades) {
        this.jogadores = jogadores;
        this.propriedades = propriedades;
    }

    public boolean adicionar_jogador(int i){
        return jogadores.add(i);

    }

    public boolean remover_jogador(int i){
        return jogadores.remove((Object)i);
    }

    public boolean adicionar_propriedade(int i){
        return propriedades.add(i);
    }
    public boolean remover_propriedade(int i){
        return propriedades.remove((Object)i);
    }
    
}
