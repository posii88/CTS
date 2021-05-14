package ro.ase.cts.composite;

import java.util.ArrayList;

public class CompositeSubDepartament implements AbstractComponent{

	ArrayList<Nod> subDepartament=new ArrayList<>();
	String numeDepartament;
	
	
	
	public CompositeSubDepartament( String numeDepartament) {
		super();
		this.subDepartament = new ArrayList<Nod>();
		this.numeDepartament = numeDepartament;
	}

	@Override
	public void adaugaNod(Nod nod) {
		this.subDepartament.add(nod);
		
	}

	@Override
	public void stergeNod(int index) {
		if(index>0 && index<this.subDepartament.size()) {
			subDepartament.remove(index);
		}
		
	}

	@Override
	public Nod genComponenta(int index) {
		if(index>0 && index<subDepartament.size()) {
		return subDepartament.get(index);
		}
		return null;
	}

	@Override
	public void printeazaNume() {
		System.out.println("nume subdepartament: "+numeDepartament);
		for(Nod nod: subDepartament) {
			nod.printeazaNume();
		}
	}

}
