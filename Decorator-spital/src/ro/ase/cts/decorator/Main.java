package ro.ase.cts.decorator;

public class Main {
	public static void main(String[] args) {
	AbstractRezultate rez=new ProdusConcret("migrena");
	
	rez.print();
	
	Decorator nou=new DecoratorOnline(rez);
	
	nou.print();
	
	nou.printOnline();
	
	
	}
}
