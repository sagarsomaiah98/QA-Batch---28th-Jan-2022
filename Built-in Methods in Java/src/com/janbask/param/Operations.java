package com.janbask.param;

public class Operations {
	
	public void add(int a, int b, int c) {
		
		int d=a+b+c;
		
		System.out.println("Addition of three numbers "+a+"  and "+b+" and "+c+" is "+d);
		
		
	}

	public static void main(String[] args) {
		Operations  t=new Operations();
		t.add(15, 10, 30);
		
		
		
		
	}

}
