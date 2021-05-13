package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Observer client1=new Client("Dana");
		Observer client2=new Client("Miruna");
		Observer client3=new Client("Alexandru");
		

		ManagerSala managerSala=new ManagerSala("sala nr 3");
		managerSala.adaugareAbonat(client1);
		managerSala.adaugareAbonat(client2);
		managerSala.adaugareAbonat(client3);
		
		managerSala.trimiteAnuntImportant("Fotbal");
		managerSala.trimiteAnuntImportant("Volei");
		
		managerSala.stergereAbonat(client3);
		managerSala.trimiteAnuntImportant("Handbal");


	}

}
