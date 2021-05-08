package ro.ase.cts.state.clase;

public class StareNormal implements InterfataActiuniCaractere {

	@Override
	public void seDeplaseaza() {
		System.out.println("Caracterul alearga");
		
	}

	@Override
	public void ataca(String inamic, int pucte, CaracterJoc caracter) {
	System.out.println(caracter.nume+" ataaca pe "+inamic);
	System.out.println("Lovitura are "+pucte+" puncte");
	}

}
