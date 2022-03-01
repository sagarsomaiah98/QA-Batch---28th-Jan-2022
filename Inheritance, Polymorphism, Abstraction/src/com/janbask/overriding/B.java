package com.janbask.overriding;

public class B extends A{
	
	public void factory() {
		
		System.out.println("Factory belongs to B");
	}
	
	
public void house() {//method overriding- changing the implementation of methods inherited
		
		System.out.println("changes in place for house now belongs to b");
	}


	public static void main(String[] args) 
	{
	B b= new B();
	b.factory();
	b.car();
	b.house();
	
		

	}

}
