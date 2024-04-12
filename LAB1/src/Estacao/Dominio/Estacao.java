package Estacao.Dominio;
import Propriedade.Dominio.Propriedade;

public class Estacao extends Propriedade {
    public Estacao(String nome, String proprietario, int preco, int aluguel) {
        super(nome, proprietario, preco, aluguel);
        
    }

    public int calcular_aluguel(){
        return super.calcular_aluguel();
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
