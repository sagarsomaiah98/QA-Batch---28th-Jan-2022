package com.janbask.overriding;

public class A {
	
	String lname="Xavier";
	char grade='A';
	
	public void car() {
		
		System.out.println("car belongs to A");
		
	}
	
	public void house() {
		
		System.out.println("house belongs to A");
	}

	public static void main(String[] args)
	{
	
		A a = new A();
		a.car();
		a.house();
		System.out.println(a.lname);
		System.out.println(a.grade);
		
		

	}

}
