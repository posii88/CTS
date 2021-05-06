package ro.ase.acs.state.program;

import ro.ase.acs.state.clase.Masa;
import ro.ase.acs.state.clase.MasaLibera;

public class Main {

	public static void main(String[] args) {

Masa masa=new Masa(3);

masa.elibereazaMasa();

masa.rezervaMasa();
masa.ocupaMasa();

masa.elibereazaMasa();

	}

}
