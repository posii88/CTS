package ro.ase.cts.command.clase;

public class ContBancar {
private String detinator;
private float sold;
public ContBancar(String detinator, float sold) {
	super();
	this.detinator = detinator;
	this.sold = sold;
}


public void constituire(float suma) {
	sold=suma;
	System.out.println("s a sonst suma "+ suma);
	
}

public void retragere(float suma) {
	if(suma<=sold) {
		
		sold=suma;
	System.out.println("s-a retras suma" +suma);
	}
	else {
		System.out.println("fond insuf");;
	}
}

public void depunere(float suma) {
	sold+=suma;
	System.out.println("s-a depus suma "+suma);
}
}
