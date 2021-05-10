package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Mesaj;
import ro.ase.cts.chain.clase.MesajEmail;
import ro.ase.cts.chain.clase.MesajeTelefon;
import ro.ase.cts.chain.clase.Modul;
import ro.ase.cts.chain.clase.TrimiteManager;

public class Main {

	public static void main(String[] args) {
		

	MesajeTelefon telefon=new MesajeTelefon("sms");
	MesajEmail email=new MesajEmail("mail");
	TrimiteManager manager=new TrimiteManager("mesajManager");
	
	telefon.setNext(email);
	email.setNext(manager);
	
	Modul modul=telefon;
	
	modul.procesareMesaj(new Mesaj("","@andry"));
	modul.procesareMesaj(new Mesaj("07536963125","getfbfd"));
	modul.procesareMesaj(new Mesaj("",""));
	
	}

}
