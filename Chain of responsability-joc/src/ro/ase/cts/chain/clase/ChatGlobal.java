package ro.ase.cts.chain.clase;

public class ChatGlobal extends ChainAbstract {

	public ChatGlobal(String numeModul) {
		super(numeModul);
		
	}

	@Override
	public void procesareMesaj(Mesaj mesaj) {
		System.out.println("mesajul e catre toti: "+mesaj.getText());
		
		if(this.next!=null)
			this.next.procesareMesaj(mesaj);
		
	}

}
