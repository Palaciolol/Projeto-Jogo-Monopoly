package Peca.Dominio;

public class Peca {
    private String cor;
    private int pos;

    public Peca(String cor, int pos) {
        this.cor = cor;
        this.pos = pos;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;

    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void imprime_peca(){
        System.out.println(this.cor);
        System.out.println(this.pos);
    }


}
