package Estacao.Dominio;
import Propriedade.Dominio.Propriedade;

public class Estacao extends Propriedade {
    public Estacao(){
        super();
    }

    public Estacao(String descricao,String nome, String proprietario, int preco, int aluguel) {
        super(descricao, nome, proprietario, preco, aluguel);
        
    }
    public boolean comprar_estacao(int capital) {
        boolean comprou = false;
        if (capital >= this.preco){
            comprou = true;
        }
        return comprou;
    }


    public int calcular_aluguel(){
        return this.aluguel;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

}
