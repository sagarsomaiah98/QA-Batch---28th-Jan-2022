package com.janbask.staticEg;

import com.janbask.param.Operations;
   
   public class MathOp {
	    //static variables
	   
	      int age=40;  
	   static  String name="Kevin";
	   
	   //static methods
     public static void add(int a, int b, int c) {
		
		int d=a+b+c;
		
		System.out.println("Addition of three numbers "+a+"  and "+b+" and "+c+" is "+d);
		
		
	}

	public static void main(String[] args) {
	
		add(10,20,50);
		MathOp m = new MathOp();
		
		System.out.println(m.age);
	    System.out.println(name);
		
		
		
		
		
	}
}
