package ro.ase.cts.facade;

import java.util.ArrayList;

public class Salon {
public ArrayList<Integer> paturiLibere=new ArrayList<>();
public ArrayList<Integer> paturiOcupate=new ArrayList<>();


public Salon() {
	super();
	this.paturiLibere =new ArrayList<Integer>();
	this.paturiOcupate =new ArrayList<Integer>();
}


public boolean paturiLibere(ArrayList<Integer> paturiLibere,ArrayList<Integer> paturiOcupate) {
for(int i:paturiLibere) {
	if(paturiLibere.get(i)!=null) {
		paturiLibere.remove(i);
		paturiOcupate.add(i);
		if(paturiLibere.isEmpty())
		return false;
	}
}
return true;
}
}
