package CartaSorte.Dominio;

public class CartaSorte {
    private int id;
    private String nome;
    private String mov;
    private String efeito;
    private String valor_pag;
    private String acao_esp;
    private String especial;
    private String restritiva;

    public CartaSorte(int id, String nome){
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

    public String getMov(){
        return mov;
    }
    public void setMov(String mov){
        this.mov = mov;
    }

    public String getEfeito(){
        return efeito;
    }
    public void setEfeito(String efeito){
        this.efeito = efeito;
    }

    public String getValor_pag(){
        return valor_pag;
    }
    public void setValor_pag(String valor_pag){
        this.valor_pag = valor_pag;
    }

    public String getAcao_esp(){
        return acao_esp;
    }
    public void setAcao_esp(String acao_esp){
        this.acao_esp = acao_esp;
    }

    public String getEsp(){
        return especial;
    }
    public void setEsp(String especial){
        this.especial = especial;
    }
    public String getRestritiva(){
        return restritiva;

    }
    public void setRestritiva(String restritiva){
        this.restritiva = restritiva;
    }

    public void imprime_carta_sorte(){
        System.out.println(this.id);
        System.out.println(this.nome);
        if (mov != null){
            System.out.println(this.mov);
        }
        if (efeito != null){
            System.out.println(this.efeito);
        }
        if (valor_pag != null){
            System.out.println(this.efeito);
        }
        if (acao_esp != null){
            System.out.println(this.efeito);
        }
        if (especial != null){
            System.out.println(this.efeito);
        }
        if (restritiva != null){
            System.out.println(this.efeito);
        }
    }
}

