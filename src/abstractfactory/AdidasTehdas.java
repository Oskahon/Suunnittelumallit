package abstractfactory;

public class AdidasTehdas implements VaateTehdas{

	public AdidasTehdas() {
		
	}
	
	public Hattu createHattu() {
		return new AdidasHattu();
	}

	@Override
	public Paita createPaita() {
		return new AdidasPaita();
	}

	@Override
	public Housut createHousut() {
		return new AdidasHousut();
	}

	@Override
	public Kengät createKengät() {
		return new AdidasKengät();
	}
	
}
