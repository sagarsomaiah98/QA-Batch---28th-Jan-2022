package com.janbask.abstractions;

public class RunAbs extends Abs_Eg {
	
	//if class as unimplemented method then method should be abstract
	//if class as atleast one abstract method then class should be abstract class
	//you cannot create a object of abstract class
	// in order to call methods in abstract class you have extend in another class then call from child class

	public static void main(String[] args) {
		
		RunAbs r= new RunAbs();
		r.method1();
		r.method2();
		r.method3();
		
	}

	@Override
	public void method1() {
		System.out.println("calling method 1");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("calling method 2");
		
	}

}
