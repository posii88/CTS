package ro.ase.acs.composite.program;

import ro.ase.acs.composite.clase.ComponentMeniu;
import ro.ase.acs.composite.clase.Element;
import ro.ase.acs.composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		ComponentMeniu sectiuneBauturi=new Sectiune("bauturi");
		ComponentMeniu sectiuneDesert=new Sectiune("desert");
		
		ComponentMeniu elementCafea=new Element("cafea");
		ComponentMeniu elementFrappe=new Element("frappe");
		ComponentMeniu elementTiramisu=new Element("Tiramisu");
		
		sectiuneBauturi.adaugaNod(elementFrappe);
		sectiuneBauturi.adaugaNod(elementCafea);
		sectiuneDesert.adaugaNod(elementTiramisu);
		
		
	ComponentMeniu meniu = new Sectiune("meniu");
	meniu.adaugaNod(sectiuneBauturi);
	meniu.adaugaNod(sectiuneDesert);
	
	meniu.printeaza();
	
	
	sectiuneBauturi.stergeNod(elementFrappe);
	sectiuneDesert.adaugaNod(elementFrappe);
	
	System.out.println(    );
	meniu.printeaza();
	
	}
	
}
