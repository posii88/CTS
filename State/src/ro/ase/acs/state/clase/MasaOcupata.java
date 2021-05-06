package ro.ase.acs.state.clase;

public class MasaOcupata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
	if(masa.getStare() instanceof MasaOcupata) {
		System.out.println("Masa este deja ocupata");
	}else
	{
		masa.setStare(this);
		System.out.println("masa "+masa.getNumar()+ " este trecuta in starea ocupaata");
	}
		
	}

}
