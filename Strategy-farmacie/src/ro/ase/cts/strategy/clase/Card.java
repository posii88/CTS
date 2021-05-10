package ro.ase.cts.strategy.clase;

public class Card implements InterfataModPlata{

	float sumaDisponibila;
	
	
	
	public float getSumaDisponibila() {
		return sumaDisponibila;
	}



	public void setSumaDisponibila(float sumaDisponibila) {
		this.sumaDisponibila = sumaDisponibila;
	}



	@Override

	public void ModPlata(float suma) {
		if(sumaDisponibila>=suma) {
			System.out.println("se realizeaza plata de "+suma+ "cu cardul");
			sumaDisponibila=sumaDisponibila-suma;
			}
		else
			System.out.println("nu exitsta fonduri disponibile pe card");
	}

}
