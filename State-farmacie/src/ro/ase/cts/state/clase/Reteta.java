package ro.ase.cts.state.clase;



public class Reteta{
	
	int cod;
	int cost;
	int timpProcesare;
	Stare stareCurenta=null;

	
	
	
	public Reteta(int cod, int cost, int timpProcesare) {
		super();
		this.cod = cod;
		this.cost = cost;
		this.timpProcesare = timpProcesare;
		this.stareCurenta=new StareInexistenta();
	}




	


	public int getCod() {
		return cod;
	}







	public void setCod(int cod) {
		this.cod = cod;
	}







	public int getTimpProcesare() {
		return timpProcesare;
	}







	public void setTimpProcesare(int timpProcesare) {
		this.timpProcesare = timpProcesare;
	}







	public void setCost(int cost) {
		this.cost = cost;
	}







	public void setStareCurenta(Stare stareCurenta) {
		this.stareCurenta = stareCurenta;
	}

	

	
	public int getCost() {
		return cost;
	}







	public void seRealizeazaReteta() {
		StareCreata stareCreata=new StareCreata();
		stareCreata.seSchimbaStarea(this);
	}
		public void seSolicitaReteta() {
			
		if(this.getTimpProcesare()<100) {
			StareSolicitata stareSolicitata=new StareSolicitata();
			stareSolicitata.seSchimbaStarea(this);
		}}
		
		public void seCumpara() {
			Reteta r2=new Reteta(cod, cod, cod);
			if(this.getCost()<1000) {
				StareAchizitionata stareAchizitionata=new StareAchizitionata();
				stareAchizitionata.seSchimbaStarea(this);
			}	
	}
	}

	









