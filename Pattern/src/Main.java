import java.util.Scanner;
import facade.ComputadorFACADE;
import state.State;
import state.TVContext;
import state.TVStartState;
import state.TVStopState;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ol� para aprender mais sobre os padr�es de design de software digite um dos n�meros: ");
		System.out.println("Para Facade digite 1 \n"
				          + "Para State digite 2 ");
		
		
		Scanner numero = new Scanner(System.in);
	
		int num = numero.nextInt();
	
		if (num == 1) {
			System.out.println("O Padr�o Facade � do tipo estrutural.\n "
					+ "� usado quando um sistema � muito complexo ou dif�cil de entender,\n "
					+ "j� que possui um grande n�mero de classes independentes ou se trechos de c�digo fonte\n"
					+ " est�o indispon�veis. Este padr�o esconde as complexidades de um sistema maior\n"
					+ " e prov� uma interface simplificada ao cliente.\n"
					+ "Tipicamente envolve uma �nica classe respons�vel por englobar uma s�rie de membros requeridos pelo cliente.\n "
					+ "Estes membros acessam o sistema em nome do Facade e escondem os detalhes de implementa��o. ");
			System.out.println("Nesse exemplo foi escondido toda a complexidade de um sistema computacional"
					+ " atraz de uma fachada simples.");
			ComputadorFACADE facade = new ComputadorFACADE();
	        facade.Executar();
			
			
		}if (num == 2) {
			System.out.println("O Padr�o State � do tipo comportamental.\n "
					+ "De acordo com a defini��o, um estado permite que um objeto altere seu comportamento quando seu estado interno muda."
					+ " O objeto parecer� mudar sua classe.Deve haver uma classe concreta separada para cada estado poss�vel de um objeto. "
					+ "Cada objeto de estado concreto ter� l�gica para aceitar ou rejeitar uma solicita��o de transi��o de estado com base em seu estado atual"
					+ " e nas informa��es de contexto passadas a ele como argumentos de m�todo.");
			
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
