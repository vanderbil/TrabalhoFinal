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
		System.out.println("Olá para aprender mais sobre os padrões de design de software digite um dos números: ");
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
			System.out.println("O Padrão Facade é do tipo estrutural.\n"
					+ "É usado quando um sistema é muito complexo ou difícil de entender,\n"
					+ "já que possui um grande número de classes independentes ou se trechos de código fonte\n"
					+ "estão indisponíveis. Este padrão esconde as complexidades de um sistema maior\n"
					+ "e provê uma interface simplificada ao cliente.\n"
					+ "Tipicamente envolve uma única classe responsável por englobar uma série de membros requeridos pelo cliente.\n"
					+ "Estes membros acessam o sistema em nome do Facade e escondem os detalhes de implementação.");
			System.out.println("Nesse exemplo foi escondido toda a complexidade de um sistema computacional"
					+ " atraz de uma fachada simples.");
			ComputadorFACADE facade = new ComputadorFACADE();
	        facade.Executar();
			
			
		}if (num == 2) {
			System.out.println("O Padrão State é do tipo comportamental.\n"
					+ "De acordo com a definição, um estado permite que um objeto altere seu comportamento quando seu estado interno muda.\n"
					+ "O objeto parecerá mudar sua classe.Deve haver uma classe concreta separada para cada estado possível de um objeto.\n"
					+ "Cada objeto de estado concreto terá lógica para aceitar ou rejeitar uma solicitação de transição de estado com base em seu estado atual\n"
					+ "e nas informações de contexto passadas a ele como argumentos de método.");
			System.out.println("Nesse exemplo podemos mudar o estado da TV pressionando os botões do controle remoto. Mas o estado da TV mudará ou não,\n"
					+ "depende do estado atual da TV.\n"
					+ "Se a TV estiver LIGADA, podemos desligá-la, silenciar ou alterar os aspectos e a fonte.\n"
					+ "Mas se a TV estiver desligada, nada acontecerá quando pressionamos os botões do controle remoto.\n"
					+ "Para uma TV desligada. apenas o próximo estado possível pode ser LIGADO.\n");
			TVContext context = new TVContext();
			State tvStartState = new TVStartState();
			State tvStopState = new TVStopState();
			
			context.setState(tvStartState);
			context.doAction();
			
			
			context.setState(tvStopState);
			context.doAction();
			    
		}if (num == 3) {
			System.out.println("O Padrão  Abstract Factory é do tipo criacional.\n"
					+"Esse padrão fornece uma das melhores maneiras de criar um objeto.\n"
					+"Os padrões Abstract Factory funcionam em torno de uma superfábrica que cria outras fábricas.\n" 
					+"Esta fábrica também é chamada de fábrica de fábricas.\n"
					+"No padrão Abstract Factory uma interface é responsável por criar uma fábrica de objetos relacionados sem especificar explicitamente suas classes.\n" 
					+"Cada fábrica gerada pode fornecer os objetos conforme o padrão Factory.");
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
			System.out.println("O Padrão Bridge é um padrão Estrutural.\n"
					+ "Ele define a organização do projeto a ser implementado. É baseado na ideia da\n"
					+ "separação de uma classe em duas frentes: a implementação e a abstração. Dessa\n"
					+ "forma, se monta uma hierarquia baseada em duas ou mais classes distintas, cada\n"
					+ "parte especializada em uma abordagem, mas ligadas por uma composição.\n"
					+"Composição que liga as duas pontas representaria a “ponte” de comunicação entre as entidades.\n");
			System.out.println("No exemplo foi implementado a classe Veículo e a Interface Transporte que fazem parte da abistração\n"
					+ "na parte da implementação representa as interfaces criadas que vão definir o comportamento da Abstração.");
			System.out.println(" ---------------------------------------- ");

	        Caminhao caminhao = new Caminhao("Scania", new Cargas());
	        caminhao.realizarAtividade();

	        System.out.println(" ---------------------------------------- ");

	        Onibus onibus = new Onibus("Mercedes", new Pessoas());
	        onibus.realizarAtividade();

	        System.out.println(" ---------------------------------------- ");
			
			
		}if (num == 5) {
			System.out.println("O Builder é um padrão de projeto criacional que permite a você construir objetos\n "
					+ "complexos passo a passo. O padrão permite que você produza diferentes tipos e representações\n"
					+ "de um objeto usando o mesmo código de construção.\n"
					+ "Após implementar o padrão, você não vai mais precisar\n"
					+ "amontoar dúzias de parâmetros em seus construtores.\n");
			
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
			
			System.out.println("O padrão Chain of Responsibility é um padrão do tipo\n"
					+ "comportamental, ou seja, foca nas relações entre os objetos,\n"
					+ "fazendo com que essas\n"
					+ "entidades se comuniquem mais facilmente e flexivelmente. Este padrão,\n"
					+ "especificamente, vincula uma cadeia de objetos via agregação possibilitando a cada\n"
					+ "um desses objetos que realize uma responsabilidade e em seguida deleguea\n"
					+ "execução ao próximo da sequência.\n");
			LogInfoHandler logInfoHandler = new LogInfoHandler();
			LogWarningHandler logWarningHandler = new LogWarningHandler();
			LogErrorHandler logErrorHandler = new LogErrorHandler();
			
			logInfoHandler.next(logWarningHandler);
			logWarningHandler.next(logErrorHandler);
			
			
			String response = logInfoHandler.handle("error");
			System.out.println(response);
			
			
			
		}if(num == 7) {
			System.out.println("Composite um padrão de projeto de software utilizado para representar um objeto formado pela composição de objetos similares.\n"
					+ " Este conjunto de objetos pressupõe uma mesma hierarquia de classes a que ele pertence.\n"
					+ "Tal padrão é, normalmente, utilizado para representar listas recorrentes - ou recursivas - de elementos\n."
					+ "Além disso, este modo de representação hierárquica de classes permite que os elementos contidos em um objeto composto sejam tratados como se fossem um objeto único.\n "
					+ "Desta forma, os métodos comuns às classes podem ser aplicados, também, ao conjunto agrupado no objeto composto.\n");
			System.out.println("Nesse exemplo foi implementado a classe Caixa que implementa a interface Item, representando um Produto composto.\n "
					+ "Já o objeto Caixa pode conter Produtos ou até mesmo outras Caixas contendo Produtos.\n");
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
			System.out.println("Não roda, não consigo arrumar.");
			for (int i = 0; i < 4; i++) {
	            Player player = PlayerFactory.getPlayer(getRandomPlayerType());

	            player.assignWeapon(getRandomWeapon());

	            player.mission();}
		}if(num == 9) {
			System.out.println("O padrão Mediator é um dos padrões de design comportamental, portanto, trata dos comportamentos dos objetos.\n"
					+ "É utilizado para fornecer um meio de comunicação centralizado entre diferentes objetos em um sistema,\n"
					+ "quando a lógica de comunicação entre objetos é complexa, possibilitando ter um ponto central de comunicação que cuida da lógica de comunicação.\n");
			System.out.println("No exemplo fio criado a classe ChatRoom que define a interface que os objetos Colleague usam para se comunicar,\n"
					+ "na classe User se define a classe abstrata contendo uma única referência ao Mediador.\n"
					+ "Na ChatRoom é encapsulada a lógica de interação entre objetos Colleague\n"
					+ "em ChatUser os ConcreteColleagues comunicam-se apenas por meio do Mediator");
			IChatRoom chatroom = new ChatRoom();
	         
		        User user1 = new UsuarioPadrao(chatroom,"1", "Maria");
		        User user2 = new UsuarioPadrao(chatroom,"2", "José");
		        User user3 = new UsuarioPadrao(chatroom,"3", "João");
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
	
