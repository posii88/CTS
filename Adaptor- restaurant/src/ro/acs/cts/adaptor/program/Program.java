package ro.acs.cts.adaptor.program;

import ro.acs.cts.adaptor.clase.AdaptorSofturi;
import ro.acs.cts.adaptor.clase.SoftBar;
import ro.acs.cts.adaptor.clase.SoftBucatarie;

public class Program {
	
	public static void afiseazaSuma(SoftBucatarie softBucatarie,int nr, int pret, String nume) {
		softBucatarie.printareFacturi(nr, pret, nume);
	
	}


	public static void main(String[] args) {
	SoftBar softBar1=new SoftBar("Mohito", 7, 25);
	
	AdaptorSofturi adaptor=new AdaptorSofturi(softBar1);
	afiseazaSuma(adaptor, softBar1.getNrBauturi(), softBar1.getPretBauturiCumparate(), softBar1.getNume());
	
	}
}
