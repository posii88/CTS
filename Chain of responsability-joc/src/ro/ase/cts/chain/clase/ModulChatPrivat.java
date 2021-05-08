package ro.ase.cts.chain.clase;

public class ModulChatPrivat extends ChainAbstract {

	public ModulChatPrivat(String numeModul) {
		super(numeModul);
	
	}

	@Override
	public void procesareMesaj(Mesaj mesaj) {
		if(!mesaj.getDestinatar().isEmpty()) {
			System.out.println("Trimit mesajul catre "+mesaj.destinatar);
				System.out.println(mesaj.getText());
			return;
			}else
			{
				if(this.next!=null) {
					this.next.procesareMesaj(mesaj);
				}
		}
	
		
	}

}
