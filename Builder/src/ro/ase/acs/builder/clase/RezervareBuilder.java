package ro.ase.acs.builder.clase;

public class RezervareBuilder implements AbstractBuilder{

	private Rezervare rezervare;
	
	public RezervareBuilder() {
		super();
		this.rezervare = new Rezervare(false,false,false,false, "",0);
	}
	
	public RezervareBuilder(int codRezervare) {
		super();
		this.rezervare = new Rezervare(false,false,false,false, "",codRezervare);
	}
	
	public RezervareBuilder setAreMancareInclusa(Boolean areMancareInclusa)
	{
		rezervare.setAreMancareInclusa(areMancareInclusa);;
		return this;
	}
	
	public RezervareBuilder setAreScaunErgonomic(Boolean areScaunErgonomic)
	{
		rezervare.setAreScaunErgonomic(areScaunErgonomic);;
		return this;
	}
	
	public RezervareBuilder setAreBauturaInclusa(Boolean areBauturaInclusa)
	{
		rezervare.setAreBauturaInclusa(areBauturaInclusa);;
		return this;
	}
	
	
	public RezervareBuilder setAreMuzicaAmbientala(Boolean areMuzicaAmbientala)
	{
		rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);;
		return this;
	}
	
	public RezervareBuilder setGenMuzica(String genMuzica)
	{
		rezervare.setGenMuzica(genMuzica);;
		return this;
	}
	
	public RezervareBuilder setCodRezervare(int codRezervare)
	{
		rezervare.setCodRezervare(codRezervare);;
		return this;
	}
	
	
	@Override
	public Rezervare build() {
		
		
		return rezervare;
	}

}
