package Terreno.Dominio;
import Propriedade.Dominio.Propriedade;

public class Terreno extends Propriedade {
    

    private int num_casas;
    private int valor_casa;
    private int valor_hotel;
    private boolean hotel;

    public Terreno(String nome, String proprietario, int preco, int aluguel, int num_casas, int valor_casa,
            int valor_hotel, boolean hotel) {
        super(nome, proprietario, preco, aluguel);
        this.num_casas = num_casas;
        this.valor_casa = valor_casa;
        this.valor_hotel = valor_hotel;
        this.hotel = hotel;
    }

    public int getNum_casas() {
        return num_casas;
    }

    public void setNum_casas(int num_casas) {
        this.num_casas = num_casas;
    }

    public int getValor_casa() {
        return valor_casa;
    }

    public void setValor_casa(int valor_casa) {
        this.valor_casa = valor_casa;
    }

    public int getValor_hotel() {
        return valor_hotel;
    }

    public void setValor_hotel(int valor_hotel) {
        this.valor_hotel = valor_hotel;
    }

    public boolean isHotel() {
        return hotel;
    }

    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }

    public boolean comprar_casa(int capital) {
        boolean comprou = false;
        if (capital >= this.valor_casa){
            comprou = true;
        }
        return comprou;
    }

    public boolean comprar_hotel(int capital) {
        boolean comprou = false;
        if (capital >= this.valor_hotel){
            comprou = true;
        }
        return comprou;
    }

    public int calcular_aluguel(){
        if (hotel){
            return valor_hotel;
        }
        else{
            return num_casas * aluguel;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Terreno [num_casas=" + num_casas + ", valor_casa=" + valor_casa + ", valor_hotel=" + valor_hotel
                + ", hotel=" + hotel + "]";
    }

   
}
