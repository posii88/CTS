package ro.ase.acs.adaptorClase.peogram;

import java.util.ArrayList;

import ro.ase.acs.adaptorClase.clae.AdaptorDisneyToAcme;
import ro.ase.acs.adaptorClase.clae.CaracterAMCME;
import ro.ase.acs.adaptorClase.clae.CaracterDisney;
import ro.ase.acs.adaptorClase.clae.InterfataCaractereLaInceput;
import ro.ase.acs.adaptorClase.clae.LooneyTune;

public class TestClient {

	public static void main(String[] args) {
		
		//asa rezolvam inainte, gestionate fiecare separat
		
		ArrayList<InterfataCaractereLaInceput> eroi=new ArrayList<>();
		
		eroi.add(new CaracterAMCME("superman", 1000));
		eroi.add(new CaracterAMCME("batman", 800));
		
		for(InterfataCaractereLaInceput erou:eroi) {
			erou.getDescriere();
			erou.esteAtacat(50);
		}
CaracterDisney tweety=new LooneyTune("twetty", 500);
ArrayList<CaracterDisney> caractereDisney=new ArrayList<>();
caractereDisney.add(tweety);

//sf. prima solutie

//a doua solutie cu adaptor de obiete

//eroi.add(twetty)  --nu merge da pentru a fi evidentiat scopul

AdaptorDisneyToAcme adaptorTwetty=new AdaptorDisneyToAcme(tweety);

eroi.add(adaptorTwetty);

System.out.println("---------------------");
for(InterfataCaractereLaInceput erou:eroi) {
	erou.getDescriere();
	erou.esteAtacat(50);
}
	}

}
