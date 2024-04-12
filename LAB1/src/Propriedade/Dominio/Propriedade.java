package Propriedade.Dominio;

public class Propriedade {
    protected int id;
    protected String nome;
    protected String proprietario;
    protected int preco;
    protected int aluguel;
    protected static int num_propriedades = 0;

    public Propriedade() {
        setId(num_propriedades);
        num_propriedades++;
    }

    public Propriedade(String nome, String proprietario, int preco, int aluguel) {
        this.nome = nome;
        this.proprietario = proprietario;
        this.preco = preco;
        this.aluguel = aluguel;
        setId(num_propriedades);
        num_propriedades++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int calcular_aluguel() {
        return this.aluguel;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", proprietario=" + proprietario + ", preco=" + preco
                + ", aluguel=" + aluguel + "";
    }

}
