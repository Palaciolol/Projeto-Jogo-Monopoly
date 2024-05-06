package Propriedade.Dominio;

import Carta.Carta;

public abstract class Propriedade extends Carta {
    protected String nome;
    protected String proprietario;
    protected int preco;
    protected int aluguel;

    public Propriedade(){
        super();
    }
    
    
    public Propriedade(String descricao,String nome, String proprietario, int preco, int aluguel) {
        super(descricao);
        this.nome = nome;
        this.proprietario = proprietario;
        this.preco = preco;
        this.aluguel = aluguel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getAluguel() {
        return aluguel;
    }

    public void setAluguel(int aluguel) {
        this.aluguel = aluguel;
    }

    public abstract int calcular_aluguel();
    

    @Override
    public String toString() {
        return "nome=" + nome + ", proprietario=" + proprietario + ", preco=" + preco
                + ", aluguel=" + aluguel + "";
    }

}
