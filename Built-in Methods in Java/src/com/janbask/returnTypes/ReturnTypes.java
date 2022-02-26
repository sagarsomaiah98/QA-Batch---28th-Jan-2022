package com.janbask.returnTypes;

public class ReturnTypes {
	
	
	public String reverse(String name) {
		
      String rev="";
		
		for(int i=name.length()-1;i>=0;i--) 
		{
		System.out.print(name.charAt(i));
		
		rev=rev+name.charAt(i);
		}
		
		return rev;
	}
	
	
	public int simplinterest(int principal, int interest, int years) 
	{
		
		int simpleinterest= (principal*interest*years)/100;
		
		return simpleinterest;
		
		
		
	}


	public static void main(String[] args){
	ReturnTypes r = new ReturnTypes();
	String value =r.reverse("Bruce");
	
	System.out.println(value);
		
		

	}

}
