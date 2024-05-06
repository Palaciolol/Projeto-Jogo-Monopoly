package ServicoPublico.Dominio;
import Propriedade.Dominio.Propriedade;

public class ServicoPublico  extends Propriedade{
    private int dados;

    public ServicoPublico(){
        super();        
    }
    public ServicoPublico(String descricao , String nome, String proprietario, int preco, int aluguel, int dados){
        super(descricao, nome, proprietario, preco, aluguel);
        this.dados = dados;
    }

    public boolean comprar_servico(int capital) {
        boolean comprou = false;
        if (capital >= this.preco){
            comprou = true;
        }
        return comprou;
    }


    public int calcular_aluguel(){
        return dados * this.aluguel;
    }

    @Override
    public String toString() {
        return super.toString();
    }












}
