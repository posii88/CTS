package ro.ase.acs.program;

import ro.ase.acs.clase.BrokerTranzactie;
import ro.ase.acs.clase.BrokerTranzactieLazy;

public class Main {
public static void main (String[] args) {
	BrokerTranzactie br1=BrokerTranzactie.getInstance();
	BrokerTranzactie br2=BrokerTranzactie.getInstance();
	BrokerTranzactie br3=BrokerTranzactie.getInstance();
	System.out.println(br1);
	System.out.println(br2);
	System.out.println(br3);
	
	br1.setNume("alina");
	br2.setNrTranzactiiEfectuate(9);
	System.out.println(br1.toString());
	System.out.println(br2.toString());
	
	BrokerTranzactieLazy lazy2=BrokerTranzactieLazy.getInstance("radu", 25, 5553);
	BrokerTranzactieLazy lazy1=BrokerTranzactieLazy.getInstance("ana", 2, 3);
	System.out.println(lazy1.toString());
	System.out.println(lazy2.toString());
}
}
