package acs.ase.prototype.program;

import acs.ase.prototype.clase.ContClient;

public class Program {
	public static void main(String[] args) {
		ContClient c1=new ContClient("Ion",1);
		
		ContClient c2=(ContClient) c1.clona();
		
		System.out.println(c1+"----original");
		
		System.out.println(c2+"----copie");
	}
}
