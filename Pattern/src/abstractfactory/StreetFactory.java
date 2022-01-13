package abstractfactory;

public class StreetFactory extends AbstractFactory {

	@Override
	public
	Veiculo getVeiculo(String modeloVeiculo) {
		if (modeloVeiculo.equalsIgnoreCase("X")) {
			return new XStreet();
		} else if (modeloVeiculo.equalsIgnoreCase("Y")) {
			return new YStreet();
		}
		return null;
	}

}
