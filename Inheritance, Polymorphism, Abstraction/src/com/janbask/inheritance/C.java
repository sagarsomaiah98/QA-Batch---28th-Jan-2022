package com.janbask.inheritance;

public class C extends A{
	
	public void gold() {
		
		System.out.println("Gold belongs C");
	}

	public static void main(String[] args) {
		C c = new C();
//		c.gold();
//		c.car();
//		c.house();
//		c.factory();
//		System.out.println(c.lname);
//		System.out.println(c.grade);
//		
		c.house();
		c.car();
		System.out.println(c.lname);
		System.out.println(c.grade);

	}

}
