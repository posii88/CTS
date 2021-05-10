package ro.ase.cts.state.clase;

public class StareInexistenta implements Stare {

	@Override
	public void seSchimbaStarea(Reteta r) {
		System.out.println("reteta nu exxista in acest moment");
		
	}

}
