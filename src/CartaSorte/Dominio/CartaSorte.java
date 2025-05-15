package CartaSorte.Dominio;

import Carta.Carta;
import Jogador.Dominio.Jogador;

public class CartaSorte extends Carta {
    private String nome;
    private int movimento;
    private int efeito;
    private int valor;
    private String acao;
    private int tempo;
    private String restritiva;
    private TipoCarta tipoCarta;

    

    public CartaSorte(String descricao, String nome, TipoCarta tipoCarta) {
        super(descricao);
        this.nome = nome;
        this.tipoCarta = tipoCarta;
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

    public int get_valor() {
        return valor;
    }

    public void set_valor(int valor) {
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

    public TipoCarta getTipoCarta() {
        return tipoCarta;
    }

    public void imprime_carta_sorte() {
        System.out.println(this.id);
        System.out.println(this.descricao);
        System.out.println(this.dono);
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

    public void executaAcao(Jogador jogador) {
        jogador.setDinheiro(jogador.getDinheiro() + valor);
    }

}
