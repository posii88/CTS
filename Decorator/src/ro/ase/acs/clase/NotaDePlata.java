package ro.ase.acs.clase;

public class NotaDePlata implements NotaAbstracta {
private float suma;
	
	public NotaDePlata(float suma) {
	super();
	this.suma = suma;
}

	@Override
	public void printeaza() {
			System.out.println("suma esta"+ suma);
		
	}

}
