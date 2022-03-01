package com.janbask.interfaces;

public class HSBC implements ReserveBank {
	
	
	

	public static void main(String[] args) {
		HSBC h= new HSBC();
		h.saving();
		h.creditcard();
		h.insurance();

	}

	@Override
	public void saving() {
		System.out.println("HSBC SAVINGS ACCOUNT IS 25K");
		
	}

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		
		System.out.println("HSBC CREDIT CARD IS 100$");
		
	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		System.out.println("HSBC INSURANCE IS 50$");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
