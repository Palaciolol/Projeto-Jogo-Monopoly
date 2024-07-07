package Tabuleiro.Dominio;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Jogador.Dominio.Jogador;
import Propriedade.Dominio.Propriedade;


public class Tabuleiro implements Salvavel {
    public  ArrayList<Jogador> jogadores;
    public  ArrayList<Propriedade> propriedades;

    public Tabuleiro(){
        jogadores = new ArrayList<Jogador>();
        propriedades = new ArrayList<Propriedade>();
        
    }

    public void addJogador(Jogador i){
        jogadores.add(i);
    }

    public void removerJogador(int i){
        jogadores.remove(i);
    }

    public void addPropriedade(Propriedade i){
        propriedades.add(i);
    }
    
    @Override
    public void iniciarArquivo(String caminhoDoArquivo) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoDoArquivo, false))) {
            // Não escrever nada, apenas abrir e fechar o arquivo para apagar o conteúdo
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void salvaLog(String caminhoDoArquivo, String conteudo) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoDoArquivo, true))) {
            escritor.write(conteudo);
            escritor.newLine();
            escritor.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
