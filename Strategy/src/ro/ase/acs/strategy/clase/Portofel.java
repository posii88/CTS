package ro.ase.acs.strategy.clase;

public class Portofel implements Strategy{
	
private float sumaDisponibila;
	
	

	public Portofel(float sumaDisponibila) {
		super();
		this.sumaDisponibila = sumaDisponibila;
	}



	@Override
	public void realizeazaPlata(float suma) {
		if(sumaDisponibila>=suma) {
	System.out.println("tranzactie cu cash de "+suma);
		sumaDisponibila-=suma;
	}
		System.out.println("fonduri insuf");
	}
}
