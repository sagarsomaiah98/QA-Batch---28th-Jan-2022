package com.janbask.parameters;

public class Addition {
	
public	void Add(int a, int b)//arguments/paramaters
	
	{
		
		
		int c=a+b;
		System.out.println("Addition of two numbers "+a+"  and "+b+" is "+c);
		
		
	}

	public static void main(String[] args)
	{
	Addition a=new Addition();
	a.Add(20,30);
	a.Add(90, 80);
     a.Add(88, 10);
     a.Add(74, 85);

	}

}
