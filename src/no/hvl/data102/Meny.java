package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;
	public Meny(FilmarkivADT filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
		
	}
	
	public void start() {
		
	}
}
