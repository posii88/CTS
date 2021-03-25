package ro.ase.cts.FactoryMethod.program;

import ro.ase.cts.FactoryMethod.clase.AsistentFactory;
import ro.ase.cts.FactoryMethod.clase.BrancardierFactory;
import ro.ase.cts.FactoryMethod.clase.FactoryPersonal;
import ro.ase.cts.FactoryMethod.clase.InfirmierFactory;
import ro.ase.cts.FactoryMethod.clase.MedicFactory;
import ro.ase.cts.FactoryMethod.clase.PersonalSpital;

public class Main {

	public static void printeazaPersonalSpital(FactoryPersonal fabrica, String nume) {
		PersonalSpital personal=fabrica.getPersonal(nume);
		System.out.println(personal.toString());
	}
	
	public static void main(String[] args) {
		printeazaPersonalSpital(new MedicFactory(), "Ion");
		printeazaPersonalSpital(new AsistentFactory(), "Diana");
		printeazaPersonalSpital(new BrancardierFactory(), "Mira");
	printeazaPersonalSpital(new InfirmierFactory(), "Maria");
	}

}
