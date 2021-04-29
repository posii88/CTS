package ro.ase.acs.factoryMet.main;

import ro.ase.acs.factoryMet.clase.FabBody;
import ro.ase.acs.factoryMet.clase.FabDurere;
import ro.ase.acs.factoryMet.clase.FabRaceala;
import ro.ase.acs.factoryMet.clase.Produse;

public class Main {

	
	public static void main(String[] args) {
	
		Produse p1=new FabRaceala().getProduse(55, "acetona");
		
		Produse p2=new FabDurere().getProduse(1330, "ditox");
		Produse p3=new FabBody().getProduse(18, "nala");
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
