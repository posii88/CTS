package ro.ase.cts.state.clase;

public class StareSolicitata implements Stare{


	@Override
	public void seSchimbaStarea(Reteta r) {
		System.out.println("s-au solicitat reteta cu codul" +r.getCod()+ "si cu costul de " +r.getCost()+" lei");
	}


}
