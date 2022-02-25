package com.janbask.methods;

public class Maths_Operations {
	
public	void Addition()
	
	{
		int a=10;
		int b=20;
		
		int c=a+b;
		System.out.println("Addition of two numbers "+a+"  and "+b+" is "+c);
		
		
	}
	
public void	Subtraction()// method declaration - Access Modifier  returnType methodname
	{
	
		int k=50;
		int l=25;
		
		int j=k-l;
		System.out.println("Subtraction of two numbers "+k+"  and "+l+" is "+j);	
		
	}
	

	public static void main(String[] args) 
	{
		
	// creating a object
	//ClassName objectname(anything) = new Classname();
		Maths_Operations m = new Maths_Operations();
		m.Subtraction();
		m.Addition();
		
		
		
		
		
		
		
		
		
		
	}

}
