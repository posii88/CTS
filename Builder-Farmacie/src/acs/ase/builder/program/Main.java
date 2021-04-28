package acs.ase.builder.program;

import acs.ase.builder.clase.Factura;
import acs.ase.builder.clase.FacturaBuilder;

public class Main {

	public static void main(String[] args) {
	Factura f1=new Factura(true, 22, true, false, false, 0);
	
	Factura f2=new FacturaBuilder().CotaTVA(false, 80).build();
	
	System.out.println(f1);
	System.out.println(f2);
	
	Factura f3=new FacturaBuilder().NrPungi(0, true).build();
	
	System.out.println(f3);
	}

}
