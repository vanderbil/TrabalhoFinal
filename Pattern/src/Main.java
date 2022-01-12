import java.util.Scanner;
import facade.ComputadorFACADE;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá para aprender mais sobre os padrões digite um dos números: ");
		System.out.println("Para Facade digite 1 \n"
				          + "Para Facade digite 2 ");
		
		
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
			
			
		}
		
		
	 numero.close();	

	}

}
