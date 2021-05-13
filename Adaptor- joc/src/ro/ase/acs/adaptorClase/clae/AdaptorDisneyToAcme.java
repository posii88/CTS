package ro.ase.acs.adaptorClase.clae;

public class AdaptorDisneyToAcme implements InterfataCaractereLaInceput{
CaracterDisney caracter;

public AdaptorDisneyToAcme(CaracterDisney caracter) {
	super();
	this.caracter = caracter;
}

@Override
public String getNume() {
	// TODO Auto-generated method stub
	return caracter.getDenumire();
}

@Override
public int getPuncteViata() {
	// TODO Auto-generated method stub
	return (int)this.caracter.getNivelEnergie();
}

@Override
public void getDescriere() {
	System.out.println(caracter.getDenumire()+ " - - "+caracter.getNivelEnergie());
	
}

@Override
public void esteAtacat(int puncte) {
caracter.interactioneaza(puncte);
	
}

@Override
public void seVindeca(int puncte) {
	caracter.resetareEnergie();
	
}


}
