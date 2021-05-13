package ro.ase.acs.adaptorClase.clae;

public abstract class CaracterDisney {
	
	protected String denumire;
	protected float nivelEnergie;
	
	public CaracterDisney(String denumire, float nivelEnergie) {
		super();
		this.denumire = denumire;
		this.nivelEnergie = nivelEnergie;
	}

	public String getDenumire() {
		return denumire;
	}

	public float getNivelEnergie() {
		return nivelEnergie;
	}
	
	public abstract void interactioneaza(float energie);

	public abstract void resetareEnergie();
}
