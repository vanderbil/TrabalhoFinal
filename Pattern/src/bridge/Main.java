package bridge;

import bridge.Caminhao;
import bridge.Onibus;
import bridge.Veiculo;
import bridge.Cargas;
import bridge.Pessoas;
import bridge.Transporte;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ---------------------------------------- ");

        Veiculo caminhao = new Caminhao("Scania", new Cargas());
        caminhao.realizarAtividade();

        System.out.println(" ---------------------------------------- ");

        Veiculo onibus = new Onibus("Mercedes", new Pessoas());
        onibus.realizarAtividade();

        System.out.println(" ---------------------------------------- ");
    }
}
