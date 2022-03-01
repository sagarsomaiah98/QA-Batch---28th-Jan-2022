package com.janbask.overloading;

public class Addition {
	//Method overloading- you can have same method name but different arguments /parameters/signatures
	
	public void add(int a, int b) {
		
		int c=a+b;
		
		System.out.println("Addition of two numbers is "+c);
	}
	
	
	public void add(int a, int b,int c) {
	System.out.println("calling second method");	
		
	}
	
	public void add(String name, int age) {
		System.out.println(name +"and"+age);
		
	}
	

	public static void main(String[] args) {
		
		Addition a= new Addition();
		a.add("john",24);//johnand24
		a.add(12,55, 90);//calling second method
		a.add(25, 10);//Addition of two numbers is 35

	}

}
