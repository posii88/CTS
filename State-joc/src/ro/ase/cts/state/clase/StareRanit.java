package ro.ase.cts.state.clase;

public class StareRanit implements InterfataActiuniCaractere {

	@Override
	public void seDeplaseaza() {
		System.out.println("se misca cu greutate");
		
	}

	@Override
	public void ataca(String inamic, int pucte, CaracterJoc caracter) {
	System.out.println(caracter.nume+ " il loveste pe "+inamic);
		System.out.println("Putere lovitura "+pucte/2);
	}

}
