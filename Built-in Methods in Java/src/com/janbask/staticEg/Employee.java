package com.janbask.staticEg;

public class Employee {
	
	static String name="John";
	static int age =30;
	double height=6.5;
	
	
	//static method can have only static variables
	//non static method can have both static and non static variables
	//
	public  void PF() {//non static method
		
		System.out.println("Employee : "+name);//static variables
		System.out.println("Age: "+age);//static variables
		System.out.println("Height:"+height);//non static variables
		
	}

	public static void main(String[] args) {
		
		Employee e= new Employee();
		
		e.PF();
		
		System.out.println(name);
		

	}

}
