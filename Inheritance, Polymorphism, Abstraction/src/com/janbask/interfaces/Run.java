package com.janbask.interfaces;

public class Run {
	static ReserveBank r1;
	
	public static void main(String[] args) {
	
		
	//	ReserveBank r = new ReserveBank(); Cannot create the object of interface
		
	//	ReserveBank r1= new HSBC();
		r1= new HSBC();
		r1= new WestPac();
		
		r1.creditcard();
		r1.saving();
		r1.creditcard();
		r1.kyc();
		
		

	}

}
