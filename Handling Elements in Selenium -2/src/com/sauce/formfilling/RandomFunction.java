package com.sauce.formfilling;

public class RandomFunction {

	public static void main(String[] args) {
		
		String[] random= {"K","L","P","O","M","B","2","4"};	
		//System.out.println(random.length);
		
	
		int v= (int) (Math.random()*10);
		
		System.out.println(v);
		System.out.println(random[v]);
		
		//System.out.println(v);
	}

}
