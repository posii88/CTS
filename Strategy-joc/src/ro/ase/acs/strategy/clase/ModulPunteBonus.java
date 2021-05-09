package ro.ase.acs.strategy.clase;
public class ModulPunteBonus {
InterfataCalculPuncteBonus strategieCurenta=null;

//optional putem cere strategia prin constructor




public void setStrategieCurenta(InterfataCalculPuncteBonus strategieCurenta) {
	this.strategieCurenta = strategieCurenta;
}

public ModulPunteBonus(InterfataCalculPuncteBonus strategieCurenta) {
	super();
	this.strategieCurenta = strategieCurenta;
}

public int getPuncteBonusJucator(String nume, int timpJoc) {
	if(strategieCurenta!=null) {
		return strategieCurenta.getPuncteBonus();
	}
	else
	{
		throw new UnsupportedOperationException();
	}
}
}
