package com.janbask.ArrayExamples;

import java.util.Arrays;

public class Array_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
String[] stud= {"marks","steve","jenny","kevin","Joe","Chris"};

System.out.println(stud.length);

System.out.println(stud[3]);
		
	System.out.println(Arrays.asList(stud).contains("marks"));//true
	System.out.println(Arrays.asList(stud).contains("henry"));//false
	
	
	}

}
