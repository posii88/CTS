package acs.ase.ro.FactoryMethodRestaurant.program;

import acs.ase.ro.FactoryMethodRestaurant.clase.FabricaSupa;
import acs.ase.ro.FactoryMethodRestaurant.clase.FabricaSupaDeCreveti;
import acs.ase.ro.FactoryMethodRestaurant.clase.FabricaSupaDeLegume;
import acs.ase.ro.FactoryMethodRestaurant.clase.FabricaSupaDeRosii;
import acs.ase.ro.FactoryMethodRestaurant.clase.Supa;

public class Main {
	
	public static void printeazaSupa(FabricaSupa fab,int gramaj) {
		Supa supa=fab.getSupe(gramaj);
	System.out.println(supa.toString());
	}


	
	public static void main(String[] args) {
		
		printeazaSupa(new FabricaSupaDeLegume(), 389);
		printeazaSupa(new FabricaSupaDeRosii(), 444);
		printeazaSupa(new FabricaSupaDeCreveti(), 355);
	}
}
