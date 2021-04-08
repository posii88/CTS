package ro.ase.acs.adaptorClase.program;


import ro.ase.cts.adaptorClase.clase.AdapterCreditClase;
import ro.ase.cts.adaptorClase.clase.CreditAbstract;

public class Main {
	
	
	
public static void afiseazaInformatiiCredit(CreditAbstract credit) {
credit.oferaCredit();
}
public static void main(String[] args) {
	AdapterCreditClase adaptor=new AdapterCreditClase(50,"ana");
	afiseazaInformatiiCredit(adaptor);
}
}

