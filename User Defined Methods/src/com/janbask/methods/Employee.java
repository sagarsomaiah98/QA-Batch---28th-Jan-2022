package com.janbask.methods;

public class Employee {
	//global/class variable
	 
	String name="john";
	double height=6.2;
	
	
	public void Salary()
	{
	String designation="Manager";	//local variables
		
	System.out.println(name+" salary is 1000$");
	System.out.println(name+" has height "+height);
	
	System.out.println(name+" is " +designation);
	//System.out.println("Grade"+" is " +grade);
	

		
	}
	
	public void age() {
		
		System.out.println(name+" age is 40 years");
		char grade='A';//local variable
		System.out.println("Grade"+" is " +grade);
	}
	

	public static void main(String[] args)
	{
		// how to create object of class?
		//clasname objectname = new classname()
		
		Employee e= new Employee();
		e.Salary();
		e.age();
		//System.out.println(e.name);
		//System.out.println(e.height);
	
		
		
	}

}
