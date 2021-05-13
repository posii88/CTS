package ro.ase.acs.adaptorClase.clae;

public class LooneyTune extends CaracterDisney{

	public LooneyTune(String denumire, float nivelEnergie) {
		super(denumire, nivelEnergie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interactioneaza(float energie) {
	System.out.println("Disney: "+denumire);
	this.nivelEnergie-=energie;
		
	}

	@Override
	public void resetareEnergie() {
		System.out.println("nivel de energie resetat");
		this.nivelEnergie=100;
		
	}

}
