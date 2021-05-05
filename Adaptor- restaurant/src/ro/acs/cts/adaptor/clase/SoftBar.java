package ro.acs.cts.adaptor.clase;

public class SoftBar {
	
private	String nume;
	private int nrBauturi;
private int pretBauturiCumparate;
	public SoftBar(String nume, int nrBauturi, int pretBauturiCumparate) {
		super();
		this.nume = nume;
		this.nrBauturi = nrBauturi;
		this.pretBauturiCumparate = pretBauturiCumparate;
	}


	public String getNume() {
		return nume;
	}


public int getNrBauturi() {
	return nrBauturi;
}
public void setNrBauturi(int nrBauturi) {
	this.nrBauturi = nrBauturi;
}
public int getPretBauturiCumparate() {
	return pretBauturiCumparate;
}
public void setPretBauturiCumparate(int pretBauturiCumparate) {
	this.pretBauturiCumparate = pretBauturiCumparate;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("SoftBar [nume=");
	builder.append(nume);
	builder.append(", nrBauturi=");
	builder.append(nrBauturi);
	builder.append(", pretBauturiCumparate=");
	builder.append(pretBauturiCumparate);
	builder.append("]");
	return builder.toString();
}


void Bauturi() {
	System.out.println("Consumatia dumeneavoastra este: "+ nrBauturi+" de "+nume+ " de "+pretBauturiCumparate+" pret ");

}




}
