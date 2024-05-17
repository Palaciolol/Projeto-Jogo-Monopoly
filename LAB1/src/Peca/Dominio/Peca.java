package Peca.Dominio;

public  class Peca {
    protected String cor;
    protected int pos;

    public Peca(){
        
    }

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

    @Override
    public String toString() {
        return "cor = " + cor + ", pos = " + pos + "";
    }

}
