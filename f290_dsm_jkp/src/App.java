import java.util.Random;
import java.util.Scanner;

import domain.Jokenpo;
import domain.Papel;
import domain.Pedra;
import domain.Spock;
import domain.Tesoura;
import domain.Lagarto;
import domain.Algoritimo;
import domain.TipoAlgoritimo;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        System.out.println("| JOGOS JOKENPO ");
        System.out.println("| 1 - Papel");
        System.out.println("| 2 - Tesoura");
        System.out.println("| 3 - Pedra");
        System.out.println("| 4 - Lagato");
        System.out.println("| 5 - Spock");
        System.out.println("| Selecione uma opção: ");
        

        int escolhaJogador = in.nextInt();

        // ciar funcao para vonerter algirmo
        Algoritimo algoritmo = geAlgoritmo(escolhaJogador);

        Integer random = new Random().nextInt(5) + 1;
        TipoAlgoritimo computador = TipoAlgoritimo.getTipo(random); // pID = instancia random

        Jokenpo jokenpo = new Jokenpo();
        jokenpo.setAlgoritimo(algoritmo);

        jokenpo.jogar(computador);
        in.close();
    }

    public static Algoritimo geAlgoritmo(Integer id) {
        TipoAlgoritimo tipo = TipoAlgoritimo.getTipo(id);
        switch (tipo) {
            case PAPEL:
                return new Papel();
            case TESOURA:
                return new Tesoura();
            case PEDRA:
                return new Pedra();
            case LAGARTO:
                return new Lagarto();
            case SPOCK:
                return new Spock();
            default:
                throw new RuntimeException("Tipo não encontrado");
        }
    }
}