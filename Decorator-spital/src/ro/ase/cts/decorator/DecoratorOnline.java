package ro.ase.cts.decorator;

public class DecoratorOnline extends Decorator {

	public DecoratorOnline(AbstractRezultate decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printOnline() {
		System.out.println("Se printeaza in mediul online");
		
	}

	@Override
	public void print() {
		
	}

	
	
}
