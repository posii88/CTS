package ro.ase.cts.decorator.clase;

public class DecoratorAlerta extends DecoratorACMe{

	public DecoratorAlerta(InterfataCaractereLaInceput erou) {
		super(erou);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void esteAtacat(int puncte) {
	
		super.esteAtacat(puncte);
		if(this.erou.getPuncteViata()<100) {
			System.out.println("Atentie, este ranit critic!");
		}
	}
	

	
	
}
