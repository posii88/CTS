package ro.ase.cts.strategy.clase;

public class Plata implements InterfataModPlata {

	InterfataModPlata strategie;
	
	
	
	public Plata(InterfataModPlata strategie) {
		super();
		this.strategie = strategie;
	}



	public InterfataModPlata getStrategie() {
		return strategie;
	}



	public void setStrategie(InterfataModPlata strategie) {
		this.strategie = strategie;
	}



	@Override
	public void ModPlata(float suma) {
		System.out.println("trebuie achitata suma de "+suma + " lei");
		strategie.ModPlata(suma);
	
	}



}
