package ro.ase.acs.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentMeniu {
private List<ComponentMeniu> ListaComponente;
private String numeSectiune;

public Sectiune(String numeSectiune) {
	super();
	ListaComponente = new ArrayList<ComponentMeniu>();
	this.numeSectiune = numeSectiune;
}

@Override
public void adaugaNod(ComponentMeniu componentMeniu) {
ListaComponente.add(componentMeniu);
}

@Override
public void stergeNod(ComponentMeniu componentMeniu) {
ListaComponente.remove(componentMeniu);
	
}

@Override
public ComponentMeniu getNod(int index) {
if(index<=ListaComponente.size() && index>=0) {
	return ListaComponente.get(index);
}
return null;
}

@Override
public void printeaza() {

	System.out.println("Sectiunea "+numeSectiune);
	for(ComponentMeniu componenta:ListaComponente) {
		componenta.printeaza();
	}
}


}
