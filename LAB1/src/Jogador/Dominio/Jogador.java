package Jogador.Dominio;


public class Jogador {
    private String nome;
    private String CPF;
    private String email;
    private String foto;
    private  int id;
    private  int dinheiro;
    private static int  num_jogadores = 0;
    
    
    public Jogador() {
        dinheiro = 1000;
        setId(num_jogadores);
        num_jogadores++;
        
    }
    
    public Jogador(String nome, String CPF, String email, String foto) { // Construtor
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.foto = foto;
        setId(num_jogadores);
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


    public String toString() {
        return "nome = " + nome + ",CPF = " + CPF + ",email = " + email + ",foto = " + foto + "";
    }

}
