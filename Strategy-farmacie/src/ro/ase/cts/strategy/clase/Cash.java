package ro.ase.cts.strategy.clase;

public class Cash implements InterfataModPlata{
float sumaDisponibila;


	public Cash(float sumaDisponibila) {
	super();
	this.sumaDisponibila = sumaDisponibila;
}


	public float getSumaDisponibila() {
		return sumaDisponibila;
	}


	@Override
	public void ModPlata(float suma) {
		if(suma<sumaDisponibila) {
	System.out.println("plata se realizeazza cu bani cash in valoare de" +suma);
		sumaDisponibila=sumaDisponibila-suma;
		}
		else
			System.out.println("nu aveti fonduri suficiente pentru a efectua plata de "+ suma + " lei");
	}

}
