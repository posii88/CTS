package ro.ase.cts.chain.clase;

public class FiltruCopii extends ChainAbstract{

	public FiltruCopii(String numeModul) {
		super(numeModul);
		
	}

	@Override
	public void procesareMesaj(Mesaj mesaj) {
		String[] dictionarCuvinteViolente= 
				new String[] {"te urasc","prost"};
		for(String cuvant:dictionarCuvinteViolente)
		{
			if(mesaj.getText().contains(cuvant)) {
				System.out.println("Filtrare mesaj: "+mesaj.getText());
				return;
			}
		}
		if(this.next!=null)
			this.next.procesareMesaj(mesaj);
		
	}

}
