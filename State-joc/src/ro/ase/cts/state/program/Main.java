package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.CaracterJoc;

public class Main {

	public static void main(String[] args) {
		
		CaracterJoc c1=new CaracterJoc("Superman", 1000);
		c1.merge();
		c1.ataca("Joker", 100);
		
		c1.esteLovit(200);
		c1.merge();
		c1.ataca("Joker", 100);
		
		c1.esteLovit(400);
		c1.merge();
		c1.ataca("Joker", 100);
		
		c1.esteLovit(400);
		c1.merge();
		c1.ataca("Joker", 100);
		
		
	c1.seVindeca(500);
	c1.esteLovit(400);
	c1.merge();
	c1.ataca("Joker", 100);
	}

}
