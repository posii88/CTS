package ro.ase.acs.builder.program;

import ro.ase.acs.builder.clase.Rezervare;
import ro.ase.acs.builder.clase.RezervareBuilder;
import ro.ase.acs.builder.clase.RezervareBuilderV2;
import ro.ase.acs.builder.clase.RezervareBuilderV2;
public class Main {

	public static void main(String[] args) {
	
		Rezervare rezervare1=new RezervareBuilder().setAreBauturaInclusa(true).setAreMancareInclusa(false).setCodRezervare(10).build();
		Rezervare rezervare2=new RezervareBuilder().setAreMancareInclusa(true).setAreScaunErgonomic(true).setCodRezervare(40).build();
	Rezervare rezervare3=new Rezervare(false,false,true,false,null,70);
	
	RezervareBuilder newBuilder=new RezervareBuilder().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
	Rezervare rezervare4=newBuilder.setCodRezervare(80).build();
	Rezervare rezervare5=newBuilder.setCodRezervare(81).build();
	
	
	System.out.println(rezervare1);
	System.out.println(rezervare2);
	System.out.println(rezervare3);
	
	RezervareBuilderV2 builderV2=new RezervareBuilderV2().setMancareInclusa(true)
			.setBauturaInclusa(true).setScaunErgonomic(true).setMuzicaAmbientala(true).setBauturaInclusa(true);
	Rezervare rezervare6=builderV2.setCodRezervare(100).build();
	Rezervare rezervare7=builderV2.setCodRezervare(101).build();

		}

}
