package facade;

public class ComputadorFACADE {

	public HardDrive hd;
	public Memoria memory;
	public Processador processor;
	
	public ComputadorFACADE() {
		
		this.hd = new HardDrive();
		this.memory = new Memoria();
		this.processor = new Processador();
		
		}
	
	public void Executar() {
		hd.leDado();
		memory.CarregaDado();
		processor.ProcessaDado();
		
		
	}


	
}
