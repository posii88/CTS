package ro.ase.cts.command.clase;

public class ComandDepundere extends Comanda{

	public ComandDepundere(ContBancar cont, float suma) {
		super(cont, suma);

	}

	@Override
	public void executa() {
		super.getCont().depunere(getSuma());
		
	}

}
