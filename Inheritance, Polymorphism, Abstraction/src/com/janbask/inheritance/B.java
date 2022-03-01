package com.janbask.inheritance;

public class B extends A{
	
	public void factory() {
		
		System.out.println("Factory belongs to B");
	}

	public static void main(String[] args) 
	{
	B b= new B();
	b.factory();
	b.car();
	b.house();
	System.out.println(b.lname);
	System.out.println(b.grade);
		

	}

}
