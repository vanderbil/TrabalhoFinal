import java.util.Scanner;
import facade.ComputadorFACADE;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ol� para aprender mais sobre os padr�es digite um dos n�meros: ");
		System.out.println("Para Facade digite 1 \n"
				          + "Para Facade digite 2 ");
		
		
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
			
			
		}
		
		
	 numero.close();	

	}

}
