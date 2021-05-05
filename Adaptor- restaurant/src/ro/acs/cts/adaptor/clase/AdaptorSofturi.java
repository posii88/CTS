package ro.acs.cts.adaptor.clase;

public class AdaptorSofturi implements SoftBucatarie{

	private SoftBar softBar;
	
	
	public AdaptorSofturi(SoftBar softBar) {
		super();
		this.softBar = softBar;
	}



	@Override
	public void printareFacturi(int nr, int pret, String nume) {
		softBar.Bauturi();
		
	}

}
