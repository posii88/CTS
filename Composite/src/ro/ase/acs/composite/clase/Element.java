package ro.ase.acs.composite.clase;

public class Element implements ComponentMeniu{
	
	public String numeElement;

	public Element(String numeElement) {
		super();
		this.numeElement = numeElement;
	}

	@Override
	public void adaugaNod(ComponentMeniu componentMeniu) {
throw new IllegalArgumentException("nu este implementata");
		
	}

	@Override
	public void stergeNod(ComponentMeniu componentMeniu) {

		throw new IllegalArgumentException("nu este implementata");
	}

	@Override
	public ComponentMeniu getNod(int index) {
		throw new IllegalArgumentException("nu este implementata");

	}

	@Override
	public void printeaza() {
		System.out.println("nu e implementata"+numeElement);
	}

}
