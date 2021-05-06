package ro.ase.acs.state.clase;

public class MasaLibera implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof MasaOcupata || masa.getStare() instanceof MasaRezervata) {
			System.out.println("masa "+ masa.getNumar()+ " trece in stare libera eliberata");
		masa.setStare(this);
		}else
		{
			System.out.println("Masa "+masa.getNumar()+  " este deja libera");
		}
		
	}

}
