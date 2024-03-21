import Jogador.Dominio.Jogador;
import CartaSorte.Dominio.CartaSorte;
import Peca.Dominio.Peca;

public class Monopoly {
    public static void main(String[] args) throws Exception {
        Jogador jogador = new Jogador("Lucas", "12345678912", "lucaspalacioa@gmail.com", "fsdfsdfksdf");
        jogador.imprime_jogador();
        boolean cpf_valido = jogador.verificar_CPF();
        boolean email_valido = jogador.verificar_email();
        if (cpf_valido == false) {
            System.out.println("Cpf inválido");
        } else {
            System.out.println("Cpf cadastrado");
        }
        if (email_valido == false) {
            System.out.println("Email inválido");
        } else {
            System.out.println("Email cadastrado");
        }
        CartaSorte carta = new CartaSorte(1, "A maré vai virar");
        carta.imprime_carta_sorte();
        Peca peca = new Peca("azul", 15);
        peca.imprime_peca();
    }
}
