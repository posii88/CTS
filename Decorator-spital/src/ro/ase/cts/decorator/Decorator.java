package ro.ase.cts.decorator;

public abstract class Decorator implements AbstractRezultate{

	AbstractRezultate decorator;
	
	
	
	public Decorator(AbstractRezultate decorator) {
		super();
		this.decorator = decorator;
	}



	@Override
	public void print() {
		decorator.print();
	}

	public abstract void printOnline() ;
	
}
