package ro.ase.cts.facade;

public class Medic {

	public boolean trebuieInternat(Pacient pacient) {
		if(pacient.Stare=="grava") {
			return true;
		}
		else return false;
	}
}
