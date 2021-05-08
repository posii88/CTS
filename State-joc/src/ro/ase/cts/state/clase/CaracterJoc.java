package ro.ase.cts.state.clase;

public class CaracterJoc {
String nume;
int puncteViata;

InterfataActiuniCaractere stareCurenta=null;

public CaracterJoc(String nume, int puncteViata) {
	super();
	this.nume = nume;
	this.puncteViata = puncteViata;

this.stareCurenta=new StareNormal();
}


//la strategy set ar trebui sa fie publica pentru a-si schimba obiectul singur strategia,
//aici insa nu trebuie asa
private void setStareCurenta(InterfataActiuniCaractere stareCurenta) {
	this.stareCurenta = stareCurenta;
}

public void merge() {
	this.stareCurenta.seDeplaseaza();
	
	
	System.out.println(this.nume+" alearga");
}

public void ataca(String inamic, int pucte) {
	this.stareCurenta.ataca(inamic, pucte, this);
}

public void seVindeca(int puncte)
{
	this.puncteViata+=puncte;
	if(this.puncteViata<500) {
		this.setStareCurenta(new StareRanit());
	}else
	{
		if(this.puncteViata<1000)
			this.setStareCurenta(new StareNormal());
	}
}
public void esteLovit(int puncte) {
	this.puncteViata-=puncte;
	if(this.puncteViata<50)
		this.setStareCurenta(new StareRanitCritic());
	else
		if(this.puncteViata<500)
		{
			this.setStareCurenta(new StareRanit());
		}
}
}