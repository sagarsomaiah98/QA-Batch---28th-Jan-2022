package com.janbask.interfaces;

public class WestPac implements ReserveBank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WestPac p = new WestPac();
		p.saving();
		p.creditcard();
		p.insurance();
		

	}

	@Override
	public void saving() {
		System.out.println("WESTPAC SAVINGS ACCOUNT IS 0$");
		
	}

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		
		System.out.println("WESTPAC CREDTI CARD IS FREE");
		
	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		System.out.println("WESPACE INSURANCE IS FREE");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
