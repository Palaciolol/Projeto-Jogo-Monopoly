package ServicoPublico.Dominio;
import Propriedade.Dominio.Propriedade;

public class ServicoPublico  extends Propriedade{
    private int multiplicador;

    public ServicoPublico(){
        super();        
    }
    public ServicoPublico(String descricao , String nome, String proprietario, int preco, int aluguel, int multiplicador){
        super(descricao, nome, proprietario, preco, aluguel);
        this.multiplicador = multiplicador;
    }

    public boolean comprar_servico(int capital) {
        boolean comprou = false;
        if (capital >= this.preco){
            comprou = true;
        }
        return comprou;
    }


    public int calcular_aluguel(){
        return multiplicador * this.aluguel;
    }

    @Override
    public String toString() {
        return super.toString();
    }












}
