package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Cash;
import ro.ase.cts.strategy.clase.Plata;

public class Main {

	public static void main(String[] args) {
	Card card=new Card();
	card.setSumaDisponibila(1000);
		Plata p1=new Plata(card);
	
	
	p1.ModPlata(500);
	p1.ModPlata(500);
	p1.ModPlata(500);

	
	Plata p2=new Plata(new Cash(6700));
	
	p2.ModPlata(5200);
	p2.ModPlata(1200);
	p2.ModPlata(1200);
	}

}
