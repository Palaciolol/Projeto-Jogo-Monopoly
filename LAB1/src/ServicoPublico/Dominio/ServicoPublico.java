package ServicoPublico.Dominio;
import Propriedade.Dominio.Propriedade;

public class ServicoPublico  extends Propriedade{
    private int dados;

    public ServicoPublico(String nome, String proprietario, int preco, int aluguel, int dados){
        super(nome, proprietario, preco, aluguel);
        this.dados = dados;
    }

    public int calcular_aluguel(){
        return dados * aluguel;
    }

    @Override
    public String toString() {
        return super.toString();
    }












}
