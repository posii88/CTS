package acs.ase.prototype.clase;

public class ContClient implements AbstractPrototype {

	private String nume;
	private int cod;

	public ContClient(String nume, int cod) {
		super();
		if(nume.length()<3 || nume.contains("1")) {
			nume="nume incorect";
		}else
		this.nume = nume;
		this.cod = cod;
	}



	private ContClient() {
		super();
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContClient [nume=");
		builder.append(nume);
		builder.append(", cod=");
		builder.append(cod);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public AbstractPrototype clona() {
		ContClient client=new ContClient();
		client.nume=this.nume;
		client.cod=this.cod;
		return client;
	}

}
