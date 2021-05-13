package ro.ase.cts.flyweight.program;

import java.util.Random;

import ro.ase.cts.flyweight.clasa.DetaliiAfisareEcran;
import ro.ase.cts.flyweight.clasa.FactoryFly;
import ro.ase.cts.flyweight.clasa.FlyModdel3D;
import ro.ase.cts.flyweight.clasa.TipModel3D;

public class TestClient {

	public static void main(String[] args) {

//Flyweight
		
		FlyModdel3D copac1=(FlyModdel3D) FactoryFly.getModel(TipModel3D.COPAC);
		FlyModdel3D copac2=(FlyModdel3D) FactoryFly.getModel(TipModel3D.COPAC);
		FlyModdel3D copac3=(FlyModdel3D) FactoryFly.getModel(TipModel3D.COPAC);
	
		Random random=new Random();
		copac1.afisareEcran(new DetaliiAfisareEcran(random.nextInt(100), random.nextInt(100), "albastru"));
		copac2.afisareEcran(new DetaliiAfisareEcran(random.nextInt(100), random.nextInt(100), "galbem"));
		copac3.afisareEcran(new DetaliiAfisareEcran(random.nextInt(100), random.nextInt(100), "verde"));
	}

}
