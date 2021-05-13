package ro.ase.cts.flyweight.clasa;

import java.util.HashMap;

public class FactoryFly {

	private static HashMap<TipModel3D, InterfataFlyModel3D> modele3D=
			new HashMap<>();
	
	//versiune eager instantiation
//	static {
//		getModel(TipModel3D.COPAC);
//		getModel(TipModel3D.SOLDAT);
//		getModel(TipModel3D.STANCA);
//	}
//	
	
	public static InterfataFlyModel3D getModel(TipModel3D tip) {
		
		//versiune lazy instantitation
		InterfataFlyModel3D model=modele3D.get(tip);
	
	if(model==null) {
		switch(tip) {
		case COPAC:
			model=new FlyModdel3D("copac.img", "Copac");
			break;
		case STANCA:
			model=new FlyModdel3D("stanca.img", "stanca");
			break;
		case SOLDAT:
			model=new FlyModdel3D("soldat.img", "soldat");
			break;
		default:
				throw new UnsupportedOperationException();
		}
		
		modele3D.put(tip, model);
	}
	return model;
	}
}
