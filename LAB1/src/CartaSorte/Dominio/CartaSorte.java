package CartaSorte.Dominio;

public class CartaSorte {
    private int id;
    private String nome;
    private int movimento;
    private int efeito;
    private float valor;
    private String acao;
    private int tempo;
    private String restritiva;

    public CartaSorte(int id, String nome) {
        /*
         * Os únicos atributos que toda carta sorte precisa ter são seu id e seu nome/descrição,
         * logo são os únicos que precisam ser passados no construtor.
         */
        this.id = id;
        this.nome = nome;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMov() {
        return movimento;
    }

    public void setMov(int movimento) {
        this.movimento = movimento;
    }

    public int getEfeito() {
        return efeito;
    }

    public void setEfeito(int efeito) {
        this.efeito = efeito;
    }

    public float get_valor() {
        return valor;
    }

    public void set_valor(float valor) {
        this.valor = valor;
    }

    public String get_acao() {
        return acao;
    }

    public void set_acao(String acao) {
        this.acao = acao;
    }

    public int get_tempo() {
        return tempo;
    }

    public void set_tempo(int tempo) {
        this.tempo = tempo;
    }

    public String getRestritiva() {
        return restritiva;

    }

    public void setRestritiva(String restritiva) {
        this.restritiva = restritiva;
    }

    public void imprime_carta_sorte() {
        System.out.println(this.id);
        System.out.println(this.nome);
        if (movimento != 0) {
            System.out.println(this.movimento);
        }
        if (efeito != 0) {
            System.out.println(this.efeito);
        }
        if (valor != 0) {
            System.out.println(this.efeito);
        }
        if (acao != null) {
            System.out.println(this.efeito);
        }
        if (tempo != 0) {
            System.out.println(this.efeito);
        }
        if (restritiva != null) {
            System.out.println(this.efeito);
        }
    }
    
}
