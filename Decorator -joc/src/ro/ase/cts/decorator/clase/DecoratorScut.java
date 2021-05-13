package ro.ase.cts.decorator.clase;

public class DecoratorScut extends DecoratorACMe {

	String scut;
	
	public DecoratorScut(InterfataCaractereLaInceput erou,String scut) {
		super(erou);
		this.scut=scut;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void esteAtacat(int puncte) {
		System.out.println("se apara cu un scut"+ scut);
		super.esteAtacat(puncte/2);
	}
	
	

}
