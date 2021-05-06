package ro.ase.acs.program;

import ro.ase.acs.clase.Cont;
import ro.ase.acs.clase.ContCredit;
import ro.ase.acs.clase.ContCurent;
import ro.ase.acs.clase.ContEconomii;

public class Main {

	public static void main(String[] args) {
	
		Cont ce=new ContEconomii(150);
		Cont cd=new ContCredit(200);
		Cont cc=new ContCurent(800);
		
		cc.setSuccesor(ce);
		ce.setSuccesor(cd);
		
		cc.plateste(20);
		cc.plateste(180);
		cc.plateste(590);
		cc.plateste(160);
		cc.plateste(110);
		cc.plateste(110);

	}

}
