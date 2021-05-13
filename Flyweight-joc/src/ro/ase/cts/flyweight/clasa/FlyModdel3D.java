package ro.ase.cts.flyweight.clasa;

import java.util.ArrayList;
import java.util.Random;

public class FlyModdel3D implements InterfataFlyModel3D{

	//stare permanenta
	String fisierModel;
	String numeModel;
	ArrayList<Integer> puncte;
	
	
	
	public FlyModdel3D(String fisierModel, String numeModel) {
		super();
		this.fisierModel = fisierModel;
		this.numeModel = numeModel;
		Random random=new Random();
		this.puncte=new ArrayList<>(random.nextInt(1000));
	}



	//Stare temporala e data de detalii
	
	@Override
	public void afisareEcran(DetaliiAfisareEcran detalii) {
		System.out.println("Afisare model 3D pt: "+ numeModel);
		System.out.println("Numar puncte: "+this.puncte);
		System.out.println(String.format("Coordonate X=%d, Y=%d, Culoare=%s", 
				detalii.X,detalii.Y,detalii.Culoare));
		
	}

}
