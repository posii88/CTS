package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandDepundere;
import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
	ContBancar cont=new ContBancar("ion",100);
	ManagerComenzi manager=new ManagerComenzi();
	
	manager.invoca(new ComandaConstituire(cont, 100));
	manager.invoca(new ComandDepundere(cont, 500));
	
	manager.executaComanda();
	manager.invoca(new ComandaRetragere(cont, 800));

	manager.executaComanda();

	manager.executaComanda();
	

	}

}
