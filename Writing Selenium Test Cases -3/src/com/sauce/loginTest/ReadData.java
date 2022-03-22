package com.sauce.loginTest;

public class ReadData {

	public static void main(String[] args) {
	
		
		Xls_Reader xls= new Xls_Reader("S:\\JANBASK\\FEB_WORKSPACE\\Writing Selenium Test Cases -3\\src\\TESTDATA\\SAUCE_LOGIN.xlsx");
		
		int rowCount=xls.getRowCount("SAUCE");
		System.out.println(rowCount);
		
		
		
		for(int i=2;i<=rowCount;i++) 
		{
			String uname=xls.getCellData("SAUCE", "USERNAME", i);
			String pwd=xls.getCellData("SAUCE", "PASSWORD", i);
			
			System.out.println(uname+" | "+pwd);
			
		}
		
		

	}

}
