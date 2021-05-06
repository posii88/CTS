package ro.ase.acs.state.clase;

public class MasaRezervata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof MasaLibera) {
			System.out.println("Masa "+masa.getNumar()+" trece in stare rezervata");
			masa.setStare(this);
		}else
		{
			System.out.println("masa "+masa.getNumar()+ " este deja rezervata");
		}
			
		}
		
	}


