package com.janbask.trycatchExample;

public class TRY_CATCH_ARTHEXC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
		try 
		{
			
		
		 int a = 30;
         int b = 0;
         int c = a/b;  // cannot divide by zero
         System.out.println ("Result = " + c);
		}
		catch(Exception v) 
		{
			v.printStackTrace();
		System.out.println("try block failed");	
			
		}
		
         System.out.println("eND OF THE PROGRAM");
         
         System.out.println("starting new program");
         
         System.out.println(" test case 1");
         System.out.println(" test case 2");

	}

}
