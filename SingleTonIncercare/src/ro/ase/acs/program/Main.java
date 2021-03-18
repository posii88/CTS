package ro.ase.acs.program;

import ro.ase.acs.clase.HainaLazy;

public class Main {
	public static void main (String[] args) {
	
		HainaLazy haina1=HainaLazy.getInstance("HM", 1999, 263);
		HainaLazy haina2=HainaLazy.getInstance("YSL", 2020, 3666);
		HainaLazy haina3=HainaLazy.getInstance("LV", 2018, 2566);
		System.out.println(haina1.toString());
		System.out.println(haina2.toString());
		System.out.println(haina3.toString());
	}
}
