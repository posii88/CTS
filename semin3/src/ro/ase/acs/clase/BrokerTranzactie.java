package ro.ase.acs.clase;

public class BrokerTranzactie {
	private String nume;
	private int vechime;
	private int nrTranzactiiEfectuate;
	private static BrokerTranzactie broker=new BrokerTranzactie("gigica",10,100);

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
	
	public void setNrTranzactiiEfectuate(int nrTranzactiiEfectuate) {
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}

	private BrokerTranzactie(String nume, int vechime, int nrTranzactiiEfectuate) {
		super();
		this.nume = nume;
		this.vechime = vechime;
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BrokerTranzactie [nume=");
		builder.append(nume);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append(", nrTranzactiiEfectuate=");
		builder.append(nrTranzactiiEfectuate);
		builder.append("]");
		return builder.toString();
	}
	
	public static BrokerTranzactie getInstance() {
		return broker;
	}
}