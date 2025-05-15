package Tabuleiro.Dominio;
public interface Salvavel {
    void iniciarArquivo(String caminhoDoArquivo);
    void salvaLog(String caminhoDoArquivo, String conteudo);
}
