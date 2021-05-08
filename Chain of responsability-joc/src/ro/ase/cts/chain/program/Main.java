package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.ChainAbstract;
import ro.ase.cts.chain.clase.ChatGlobal;
import ro.ase.cts.chain.clase.FiltruCopii;
import ro.ase.cts.chain.clase.Mesaj;
import ro.ase.cts.chain.clase.ModulChatPrivat;

public class Main {

	public static void main(String[] args) {
	FiltruCopii filtru=new FiltruCopii("Filtru");
	ModulChatPrivat privat=new ModulChatPrivat("privat");
	ChatGlobal global=new ChatGlobal("global");
	
	filtru.setNext(privat);
	privat.setNext(global);
	
	ChainAbstract chat=filtru;
	
	chat.procesareMesaj(new Mesaj("Slaut",1,"Gigel"));
	chat.procesareMesaj(new Mesaj("Slaut esti prost",1,"Gigel"));
	chat.procesareMesaj(new Mesaj("Slaut",1,""));
	}

}
