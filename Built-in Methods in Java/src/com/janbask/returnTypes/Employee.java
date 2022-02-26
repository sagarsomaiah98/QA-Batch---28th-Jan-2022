package com.janbask.returnTypes;

public class Employee {
	
	public int age() 
	{
	int age = 49;// local variable
	
	System.out.println("Employee age  is "+age);
	
	return age;
		
	}

	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		
	 int value=	e.age();
		
		
		System.out.println(value);
		
		
		  if(value>=60) System.out.println("Employee is a senior citizen"); else
		  System.out.println("Employee is  not a senior citizen");
		 
	}

}
