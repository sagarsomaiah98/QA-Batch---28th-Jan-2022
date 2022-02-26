package com.janbask.staticEg;

public class RunTest {

	
	//whenver you call static method or static variable in another class you need to mention classname.variablename  / clasname.methodname
	
	public static void main(String[] args) {
		//Employee e1= new Employee();
		//e1.PF();
		
		MathOp.add(20,30,40);
		
		System.out.println(MathOp.age);
		System.out.println(MathOp.name);

	}

}
