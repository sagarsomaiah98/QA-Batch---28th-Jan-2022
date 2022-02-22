package com.janbask.ArrayExamples;

public class Student_array {

	public static void main(String[] args) {
		
		String[]  Students= new String[10];//syntax of array
		
		Students[1]="Steve";
		Students[2]="Rob";
		Students[3]	="Adam";
		Students[0]="Kevin";
		Students[4]="bob";
		Students[2]="Jenny";
		
		/*
		 * System.out.println(Students[0]); System.out.println(Students[1]);
		 * System.out.println(Students[2]); System.out.println(Students[3]);
		 * System.out.println(Students[4]);
		 * 
		 * System.out.println(Students.length);
		 */
		
		//two dimensional array
		
		for(int i=0;i<Students.length;i++) {
			
			//System.out.println(Students[i]);
		}
		
		
		System.out.println(Students);
		
	}

}
