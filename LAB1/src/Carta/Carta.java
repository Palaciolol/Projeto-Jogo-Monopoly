package Carta;
import Jogador.Dominio.Jogador;

public abstract class Carta {
    protected int id;
    protected String descricao;
    protected Jogador dono;
    protected static int num_cartas = 0;
    
    public Carta(){
        setId(num_cartas);
        num_cartas++;
    }
    
    public Carta(String descricao) {
        this.descricao = descricao;
        setId(num_cartas);
        num_cartas++;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Jogador getDono() {
        return dono;
    }
    public void setDono(Jogador dono) {
        this.dono = dono;
    }
    
}
