package ro.ase.cts.program;

import ro.ase.cts.clase.Facade;
import ro.ase.cts.clase.Persoana;

public class Main {

	public static void main(String[] args) {
		Persoana persoana =new Persoana("2990150236955","maria");
		Persoana persoana2 =new Persoana("2990150236978","maia");
		if(Facade.esteEligibil(persoana)){
			System.out.println("oferim credit");
		}else
		{
			System.out.println("nu oferim credit");
		}
		if(Facade.esteEligibil(persoana2)){
			System.out.println("oferim credit");
		}else
		{
			System.out.println("nu oferim credit");
		}
	}

}
