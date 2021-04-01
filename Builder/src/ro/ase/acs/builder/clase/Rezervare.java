package ro.ase.acs.builder.clase;

public class Rezervare {
	private Boolean areMancareInclusa;
	private Boolean areScaunErgonomic;
	private Boolean areBauturaInclusa;
	private Boolean areMuzicaAmbientala;
	private String genMuzica;
	private int codRezervare;

	public Rezervare(Boolean areMancareInclusa, Boolean areScaunErgonomic, Boolean areBauturaInclusa,
			Boolean areMuzicaAmbientala, String genMuzica, int codRezervare) {
		super();
		this.areMancareInclusa = areMancareInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areBauturaInclusa = areBauturaInclusa;
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		this.genMuzica = genMuzica;
		this.codRezervare = codRezervare;
	}

	public void setAreMancareInclusa(Boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}

	public void setAreScaunErgonomic(Boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}



	public void setAreBauturaInclusa(Boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
	}

	public void setAreMuzicaAmbientala(Boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [areMancareInclusa=");
		builder.append(areMancareInclusa);
		builder.append(", areScaunErgonomic=");
		builder.append(areScaunErgonomic);
		builder.append(", areBauturaInclusa=");
		builder.append(areBauturaInclusa);
		builder.append(", areMuzicaAmbientala=");
		builder.append(areMuzicaAmbientala);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append(", codRezervare=");
		builder.append(codRezervare);
		builder.append("]");
		return builder.toString();
	}
	
	

}
