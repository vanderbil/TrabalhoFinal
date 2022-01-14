import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;

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
import bridge.Transporte;
import builder.Car;
import builder.CarBuilder;
import builder.CarManualBuilder;
import builder.Director;
import builder.Manual;
import chainscfresponsibility.AbstractHandler;
import chainscfresponsibility.exampleOneTest;
import composite.Caixa;
import composite.Item;
import composite.Produto;
import chainscfresponsibility.HandlerInterface;
import chainscfresponsibility.LogErrorHandler;
import chainscfresponsibility.LogInfoHandler;
import chainscfresponsibility.LogWarningHandler;
import flyweight.CounterStrike;
import flyweight.Player;
import flyweight.PlayerFactory;
import mediator.ChatRoom;
import mediator.UsuarioPadrao;
import mediator.IChatRoom;
import mediator.User;









public class Main {

	

	public static  void main(String[] args) {
		System.out.println("Ol� para aprender mais sobre os padr�es de design de software digite um dos n�meros: ");
		System.out.println("Para Facade digite 1\n"
				          +"Para State digite 2\n"
				          +"Para Abstract Factory digite 3\n"
				          +"Para Bridge digite 4\n"
				          +"Para Builder digite 5\n"
				          +"Para Chain of Responsibility digite 6\n"
				          +"Para Composite digite 7\n"
				          +"Para Flyweight digite 8\n"
				          +"Para Mediator digite 9\n"
				          +"Para Builder digite 10\n"
				          +"Para Builder digite 11\n"
				          +"Para Builder digite 12\n"
				          +"Para Builder digite 13\n"
				
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
		    
		}if(num == 6) {
			
			System.out.println("O padr�o Chain of Responsibility � um padr�o do tipo\n"
					+ "comportamental, ou seja, foca nas rela��es entre os objetos,\n"
					+ "fazendo com que essas\n"
					+ "entidades se comuniquem mais facilmente e flexivelmente. Este padr�o,\n"
					+ "especificamente, vincula uma cadeia de objetos via agrega��o possibilitando a cada\n"
					+ "um desses objetos que realize uma responsabilidade e em seguida deleguea\n"
					+ "execu��o ao pr�ximo da sequ�ncia.\n");
			LogInfoHandler logInfoHandler = new LogInfoHandler();
			LogWarningHandler logWarningHandler = new LogWarningHandler();
			LogErrorHandler logErrorHandler = new LogErrorHandler();
			
			logInfoHandler.next(logWarningHandler);
			logWarningHandler.next(logErrorHandler);
			
			
			String response = logInfoHandler.handle("error");
			System.out.println(response);
			
			
			
		}if(num == 7) {
			System.out.println("Composite um padr�o de projeto de software utilizado para representar um objeto formado pela composi��o de objetos similares.\n"
					+ " Este conjunto de objetos pressup�e uma mesma hierarquia de classes a que ele pertence.\n"
					+ "Tal padr�o �, normalmente, utilizado para representar listas recorrentes - ou recursivas - de elementos\n."
					+ "Al�m disso, este modo de representa��o hier�rquica de classes permite que os elementos contidos em um objeto composto sejam tratados como se fossem um objeto �nico.\n "
					+ "Desta forma, os m�todos comuns �s classes podem ser aplicados, tamb�m, ao conjunto agrupado no objeto composto.\n");
			System.out.println("Nesse exemplo foi implementado a classe Caixa que implementa a interface Item, representando um Produto composto.\n "
					+ "J� o objeto Caixa pode conter Produtos ou at� mesmo outras Caixas contendo Produtos.\n");
			Caixa caixaMaster = new Caixa(new ArrayList<Item>()); 
			
			caixaMaster.addItem(new Produto("Clean Code: A Handbook of Agile Software Craftsmanship", 202.71));
			
			Caixa caixaSmartphones = new Caixa(new ArrayList<Item>()); 
			caixaSmartphones.addItem(new Produto("Samsung Galaxy S21 Ultra 5G", 5000.10));
			caixaSmartphones.addItem(new Produto("Samsung Galaxy S20 FE", 2189));
			caixaSmartphones.addItem(new Produto("iPhone 13", 12000));
			caixaSmartphones.addItem(new Produto("iPhone 13 mini", 4000));
			caixaMaster.addItem(caixaSmartphones);
			
			Caixa caixaNotebooks = new Caixa(new ArrayList<Item>());
			caixaNotebooks.addItem(new Produto("Acer Nitro AN515-44-R5YZ", 5499));
			caixaNotebooks.addItem(new Produto("Dell G15", 5301));
			caixaMaster.addItem(caixaNotebooks);
			
			Caixa caixaFerramentas = new Caixa(new ArrayList<Item>());
			caixaFerramentas.addItem(new Produto("Martelo de Unha 25mm", 37.30));
			caixaFerramentas.addItem(new Produto("Trena 5m", 17.10));
			caixaFerramentas.addItem(new Produto("Alicate 7", 25));
			caixaFerramentas.addItem(new Produto("Chave de Fenda Ponta Cruzada 1/8x6 Polegadas", 5.90));
			caixaMaster.addItem(caixaFerramentas);
			
			System.out.println("VALOR TOTAL = " + caixaMaster.calcularPrecoFinal());
			
			
		}if(num == 8){
			System.out.println("N�o roda, n�o consigo arrumar.");
			for (int i = 0; i < 4; i++) {
	            Player player = PlayerFactory.getPlayer(getRandomPlayerType());

	            player.assignWeapon(getRandomWeapon());

	            player.mission();}
		}if(num == 9) {
			System.out.println("O padr�o Mediator � um dos padr�es de design comportamental, portanto, trata dos comportamentos dos objetos.\n"
					+ "� utilizado para fornecer um meio de comunica��o centralizado entre diferentes objetos em um sistema,\n"
					+ "quando a l�gica de comunica��o entre objetos � complexa, possibilitando ter um ponto central de comunica��o que cuida da l�gica de comunica��o.\n");
			System.out.println("No exemplo fio criado a classe ChatRoom que define a interface que os objetos Colleague usam para se comunicar,\n"
					+ "na classe User se define a classe abstrata contendo uma �nica refer�ncia ao Mediador.\n"
					+ "Na ChatRoom � encapsulada a l�gica de intera��o entre objetos Colleague\n"
					+ "em ChatUser os ConcreteColleagues comunicam-se apenas por meio do Mediator");
			IChatRoom chatroom = new ChatRoom();
	         
		        User user1 = new UsuarioPadrao(chatroom,"1", "Maria");
		        User user2 = new UsuarioPadrao(chatroom,"2", "Jos�");
		        User user3 = new UsuarioPadrao(chatroom,"3", "Jo�o");
		        User user4 = new UsuarioPadrao(chatroom,"4", "Ana");
		         
		        chatroom.addUser(user1);
		        chatroom.addUser(user2);
		        chatroom.addUser(user3);
		        chatroom.addUser(user4);

		        
		        user1.send("Hello brian", "2");
		        user2.send("Hey buddy", "1");
		}	
		
	 numero.close();	

	

	}

	private static String getRandomPlayerType() {
		return null;
	}

	private static String getRandomWeapon() {
		return null;
	}

}
	
