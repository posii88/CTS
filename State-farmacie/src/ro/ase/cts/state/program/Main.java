package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Reteta;

public class Main {

	public static void main(String[] args) {
		
		Reteta r1=new Reteta(12, 88, 55);
		
		
		
		r1.seRealizeazaReteta();
		
		r1.seSolicitaReteta();
		
		r1.seCumpara();
		
		r1.seRealizeazaReteta();
	}

}
