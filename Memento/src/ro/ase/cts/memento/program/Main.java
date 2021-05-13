package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.Manager;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MeciJucat meciJucat=new MeciJucat("echipa1", "echipa2",401, 55, 58, 20);
		Manager manager=new Manager();
		manager.adaugaMemento(meciJucat.creareMemento());
		

		meciJucat.setNumeGazda("echipa3");
		meciJucat.setNumeOaspeti("ech5");
		meciJucat.setNrBilete(73);
		meciJucat.setNrSpectatori(50);
		meciJucat.setNrJandarmi(40);
		
		manager.adaugaMemento(meciJucat.creareMemento());
		
		System.out.println(meciJucat.toString());
		
		meciJucat.setMemento(manager.getMemento(0));
		System.out.println(meciJucat.toString());

	}
}
