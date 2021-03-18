package ro.ase.acs.clase;

public class HainaLazy {
private String firma;
private int anFabricare;
private float pret;

private static HainaLazy haina = null;


private HainaLazy(String firma, int anFabricare, float pret) {
	super();
	this.firma = firma;
	this.anFabricare = anFabricare;
	this.pret = pret;
}


public String getFirma() {
	return firma;
}


public void setFirma(String firma) {
	this.firma = firma;
}


public int getAnFabricare() {
	return anFabricare;
}


public void setAnFabricare(int anFabricare) {
	this.anFabricare = anFabricare;
}


public float getPret() {
	return pret;
}


public void setPret(float pret) {
	this.pret = pret;
}


@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("HainaLazy [firma=");
	builder.append(firma);
	builder.append(", anFabricare=");
	builder.append(anFabricare);
	builder.append(", pret=");
	builder.append(pret);
	builder.append("]");
	return builder.toString();
}


public static synchronized HainaLazy getInstance(String firma, int anFabricare, float pret) {
	if (haina == null) {
		haina = new HainaLazy(firma, anFabricare, pret);
	}
		return haina;
}

}
