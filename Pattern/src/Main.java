import java.util.Scanner;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.Veiculo;
import bridge.Caminhao;
import bridge.Cargas;
import bridge.Onibus;
import bridge.Pessoas;
import facade.ComputadorFACADE;
import state.State;
import state.TVContext;
import state.TVStartState;
import state.TVStopState;
import bridge.Caminhao;
import bridge.Cargas;
import bridge.Onibus;
import bridge.Pessoas;
import bridge.Transporte;
import builder.Car;
import builder.CarBuilder;
import builder.CarManualBuilder;
import builder.Director;
import builder.Manual;








public class Main {

	public static void main(String[] args) {
		System.out.println("Ol� para aprender mais sobre os padr�es de design de software digite um dos n�meros: ");
		System.out.println("Para Facade digite 1\n"
				          +"Para State digite 2\n"
				          +"Para Abstract Factory digite 3\n"
				          +"Para Bridge digite 4\n"
				          +"Para Builder digite 5\n"
				
				                                );
		
		
		Scanner numero = new Scanner(System.in);
	
		int num = numero.nextInt();
	
		if (num == 1) {
			System.out.println("O Padr�o Facade � do tipo estrutural.\n"
					+ "� usado quando um sistema � muito complexo ou dif�cil de entender,\n"
					+ "j� que possui um grande n�mero de classes independentes ou se trechos de c�digo fonte\n"
					+ "est�o indispon�veis. Este padr�o esconde as complexidades de um sistema maior\n"
					+ "e prov� uma interface simplificada ao cliente.\n"
					+ "Tipicamente envolve uma �nica classe respons�vel por englobar uma s�rie de membros requeridos pelo cliente.\n"
					+ "Estes membros acessam o sistema em nome do Facade e escondem os detalhes de implementa��o.");
			System.out.println("Nesse exemplo foi escondido toda a complexidade de um sistema computacional"
					+ " atraz de uma fachada simples.");
			ComputadorFACADE facade = new ComputadorFACADE();
	        facade.Executar();
			
			
		}if (num == 2) {
			System.out.println("O Padr�o State � do tipo comportamental.\n"
					+ "De acordo com a defini��o, um estado permite que um objeto altere seu comportamento quando seu estado interno muda.\n"
					+ "O objeto parecer� mudar sua classe.Deve haver uma classe concreta separada para cada estado poss�vel de um objeto.\n"
					+ "Cada objeto de estado concreto ter� l�gica para aceitar ou rejeitar uma solicita��o de transi��o de estado com base em seu estado atual\n"
					+ "e nas informa��es de contexto passadas a ele como argumentos de m�todo.");
			System.out.println("Nesse exemplo podemos mudar o estado da TV pressionando os bot�es do controle remoto. Mas o estado da TV mudar� ou n�o,\n"
					+ "depende do estado atual da TV.\n"
					+ "Se a TV estiver LIGADA, podemos deslig�-la, silenciar ou alterar os aspectos e a fonte.\n"
					+ "Mas se a TV estiver desligada, nada acontecer� quando pressionamos os bot�es do controle remoto.\n"
					+ "Para uma TV desligada. apenas o pr�ximo estado poss�vel pode ser LIGADO.\n");
			TVContext context = new TVContext();
			State tvStartState = new TVStartState();
			State tvStopState = new TVStopState();
			
			context.setState(tvStartState);
			context.doAction();
			
			
			context.setState(tvStopState);
			context.doAction();
			    
		}if (num == 3) {
			System.out.println("O Padr�o  Abstract Factory � do tipo criacional.\n"
					+"Esse padr�o fornece uma das melhores maneiras de criar um objeto.\n"
					+"Os padr�es Abstract Factory funcionam em torno de uma superf�brica que cria outras f�bricas.\n" 
					+"Esta f�brica tamb�m � chamada de f�brica de f�bricas.\n"
					+"No padr�o Abstract Factory uma interface � respons�vel por criar uma f�brica de objetos relacionados sem especificar explicitamente suas classes.\n" 
					+"Cada f�brica gerada pode fornecer os objetos conforme o padr�o Factory.");
			System.out.println("Nesse exemplo o metodo veiculo esta relacionado com com dois modelos de carros sem especificar qual classe o objeto se relaciona.");		
					
					
         AbstractFactory offRoadFactory = FactoryProducer.getFactory("OffRoad");
		
		Veiculo carro1 = offRoadFactory.getVeiculo("X");
		carro1.method();
		
		Veiculo carro2 = offRoadFactory.getVeiculo("Y");
		carro2.method();
		
		AbstractFactory streetFactory = FactoryProducer.getFactory("Street");
		
		Veiculo carro3 = streetFactory.getVeiculo("X");
		carro3.method();
		
		Veiculo carro4 = streetFactory.getVeiculo("Y");
		carro4.method();
			
		}if (num == 4) {
			System.out.println("O Padr�o Bridge � um padr�o Estrutural.\n"
					+ "Ele define a organiza��o do projeto a ser implementado. � baseado na ideia da\n"
					+ "separa��o de uma classe em duas frentes: a implementa��o e a abstra��o. Dessa\n"
					+ "forma, se monta uma hierarquia baseada em duas ou mais classes distintas, cada\n"
					+ "parte especializada em uma abordagem, mas ligadas por uma composi��o.\n"
					+"Composi��o que liga as duas pontas representaria a �ponte� de comunica��o entre as entidades.\n");
			System.out.println("No exemplo foi implementado a classe Ve�culo e a Interface Transporte que fazem parte da abistra��o\n"
					+ "na parte da implementa��o representa as interfaces criadas que v�o definir o comportamento da Abstra��o.");
			System.out.println(" ---------------------------------------- ");

	        Caminhao caminhao = new Caminhao("Scania", new Cargas());
	        caminhao.realizarAtividade();

	        System.out.println(" ---------------------------------------- ");

	        Onibus onibus = new Onibus("Mercedes", new Pessoas());
	        onibus.realizarAtividade();

	        System.out.println(" ---------------------------------------- ");
			
			
		}if (num == 5) {
			System.out.println("O Builder � um padr�o de projeto criacional que permite a voc� construir objetos\n "
					+ "complexos passo a passo. O padr�o permite que voc� produza diferentes tipos e representa��es\n"
					+ "de um objeto usando o mesmo c�digo de constru��o.\n"
					+ "Ap�s implementar o padr�o, voc� n�o vai mais precisar\n"
					+ "amontoar d�zias de par�metros em seus construtores.\n");
			
			 Director director = new Director();

		        // Director gets the concrete builder object from the client
		        // (application code). That's because application knows better which
		        // builder to use to get a specific product.
		        CarBuilder builder = new CarBuilder();
		        director.constructSportsCar(builder);

		        // The final product is often retrieved from a builder object, since
		        // Director is not aware and not dependent on concrete builders and
		        // products.
		        Car car = builder.getResult();
		        System.out.println("Car built:\n" + car.getCarType());


		        CarManualBuilder manualBuilder = new CarManualBuilder();

		        // Director may know several building recipes.
		        director.constructSportsCar(manualBuilder);
		        Manual carManual = manualBuilder.getResult();
		        System.out.println("\nCar manual built:\n" + carManual.print());
		    
		}	
			
		
			
			
			
			
		
	 numero.close();	

	}

}
