package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.CaracterJoc;
import ro.ase.cts.composite.clase.Grup;

public abstract class TestClient {
	
public static void main(String[] args) {
	
	
	//Coomposite
	CaracterJoc superman=new CaracterJoc("Superman");
	CaracterJoc batman=new CaracterJoc("batman");
	Grup ech1=new Grup("echipa rosie");
	ech1.adauga(batman);
	ech1.adauga(superman);
	
	Grup ech2=new Grup("Liga dreptatii");
	ech2.adauga(ech1);
	ech2.adauga(new CaracterJoc("femeia minune"));
	
	ech2.ataca("Joker");
	ech2.seApara();
	ech2.get("femeia minune").seVindeca(100);
	
}
	
}
