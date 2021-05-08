package ro.ase.cts.state.clase;

public class StareRanitCritic implements InterfataActiuniCaractere {

	@Override
	public void seDeplaseaza() {
	System.out.println("nu se mai poate deplasa");
		
	}

	@Override
	public void ataca(String inamic, int pucte, CaracterJoc caracter) {
		System.out.println(caracter.nume+ " abia il atinge pe "+inamic);
		System.out.println("Putere lovitura "+pucte/10);
		
	}

}
