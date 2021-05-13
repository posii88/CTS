package ro.ase.cts.composite.clase;

import java.util.ArrayList;

public class Grup extends AbstractNod {

	//aici vb la nivel de grup, gen mai multe caractere din joc
	
	ArrayList<AbstractNod> noduri=new ArrayList<>();
	
	public Grup(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ataca(String inamic) {
	for(AbstractNod nod:noduri) {
		nod.ataca(inamic);
	}
		
	}

	@Override
	public void seApara() {
		for(AbstractNod nod:noduri)
			if(nod instanceof CaracterJoc)
			nod.seApara();
		
	}

	@Override
	public void seVindeca(int puncte) {
	throw new UnsupportedOperationException();
	}

	@Override
	public void adauga(AbstractNod nod) {
		this.noduri.add(nod);
	
	}

	@Override
	public void sterge(int index) {
	if(index>=0 &&index<this.noduri.size()) {
		this.noduri.remove(index);
	}
	}

	@Override
	public AbstractNod get(String nume) {
		
		AbstractNod ref=null;
		for(AbstractNod nod:noduri) {
			if(nod.nume.equals(nume))
				ref=nod;
		}
				
				return ref;
	}
	
	 

}
