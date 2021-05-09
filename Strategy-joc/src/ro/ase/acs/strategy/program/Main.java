package ro.ase.acs.strategy.program;

import ro.ase.acs.strategy.clase.ModulPunteBonus;
import ro.ase.acs.strategy.clase.StaraterieRandom;
import ro.ase.acs.strategy.clase.StrategieFixa;

public class Main {

	public static void main(String[] args) {
		
		ModulPunteBonus modul=new ModulPunteBonus(new StrategieFixa());
		
		int puncte=modul.getPuncteBonusJucator("Ion", 1001);
		System.out.println("Ion a primit "+ puncte);

		
		//modificare strategie
		modul.setStrategieCurenta(new StaraterieRandom());
		puncte=modul.getPuncteBonusJucator("Ion", 1001);
		System.out.println("Ion a primit "+ puncte);

		
	}

}
