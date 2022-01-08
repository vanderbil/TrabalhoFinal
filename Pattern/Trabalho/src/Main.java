
import AbstarctFactory.Main;

import java.util.Scanner;


public class Main {
      public static void main(String [] args) {
      Scanner ler = new Scanner(System.in);
	
	
	System.out.printf("Informe o primeiro valor: ");
	
	int num;
	
	if(num == 1) {
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
		
	}
	
}

   }

