package visitor;
public class VisitorConcreto implements Visitor {
	
	public void visit (ElementoConcreto elementoConcreto) {
		
		System.out.println ("Estou visitando a Classe " +
			elementoConcreto.getClass() +" do Objeto  " + elementoConcreto.getClass().getName());
	}

}