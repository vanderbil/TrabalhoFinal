import java.util.Scanner;
import facade.ComputadorFACADE;
import state.State;
import state.TVContext;
import state.TVStartState;
import state.TVStopState;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá para aprender mais sobre os padrões de design de software digite um dos números: ");
		System.out.println("Para Facade digite 1 \n"
				          + "Para State digite 2 ");
		
		
		Scanner numero = new Scanner(System.in);
	
		int num = numero.nextInt();
	
		if (num == 1) {
			System.out.println("O Padrão Facade é do tipo estrutural.\n "
					+ "É usado quando um sistema é muito complexo ou difícil de entender,\n "
					+ "já que possui um grande número de classes independentes ou se trechos de código fonte\n"
					+ " estão indisponíveis. Este padrão esconde as complexidades de um sistema maior\n"
					+ " e provê uma interface simplificada ao cliente.\n"
					+ "Tipicamente envolve uma única classe responsável por englobar uma série de membros requeridos pelo cliente.\n "
					+ "Estes membros acessam o sistema em nome do Facade e escondem os detalhes de implementação. ");
			System.out.println("Nesse exemplo foi escondido toda a complexidade de um sistema computacional"
					+ " atraz de uma fachada simples.");
			ComputadorFACADE facade = new ComputadorFACADE();
	        facade.Executar();
			
			
		}if (num == 2) {
			System.out.println("O Padrão State é do tipo comportamental.\n "
					+ "De acordo com a definição, um estado permite que um objeto altere seu comportamento quando seu estado interno muda.\n"
					+ " O objeto parecerá mudar sua classe.Deve haver uma classe concreta separada para cada estado possível de um objeto.\n "
					+ "Cada objeto de estado concreto terá lógica para aceitar ou rejeitar uma solicitação de transição de estado com base em seu estado atual\n"
					+ "e nas informações de contexto passadas a ele como argumentos de método.\n");
			System.out.println("Nesse exemplo podemos mudar o estado da TV pressionando os botões do controle remoto. Mas o estado da TV mudará ou não,\n "
					+ "depende do estado atual da TV.\n"
					+ "Se a TV estiver LIGADA, podemos desligá-la, silenciar ou alterar os aspectos e a fonte.\n"
					+ "Mas se a TV estiver desligada, nada acontecerá quando pressionamos os botões do controle remoto.\n"
					+ "Para uma TV desligada. apenas o próximo estado possível pode ser LIGADO.");
			TVContext context = new TVContext();
			State tvStartState = new TVStartState();
			State tvStopState = new TVStopState();
			
			context.setState(tvStartState);
			context.doAction();
			
			
			context.setState(tvStopState);
			context.doAction();
		}
			
			
			
			
		
		
	 numero.close();	

	}

}
