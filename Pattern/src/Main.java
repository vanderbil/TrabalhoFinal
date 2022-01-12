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
			System.out.println("Olá para aprender mais sobre os padrões digite um dos números: ");
			ComputadorFACADE facade = new ComputadorFACADE();
	        facade.Executar();
			
			
		}
		
		
	 numero.close();	

	}

}
