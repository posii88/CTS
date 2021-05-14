package ro.ase.cts.facade;

import java.util.ArrayList;

public class Facade {
public static boolean Internam(Pacient pacient,Medic medic,Salon salon) {
	if(pacient.esteStareGrava("grava")) {
		if(medic.trebuieInternat(pacient)==true) {
			if(salon.paturiLibere(new ArrayList<Integer>(10),new ArrayList<>(5))==true){
				return true;
			}else return false;
					
		}else return false;
	}else return false;
}
}
