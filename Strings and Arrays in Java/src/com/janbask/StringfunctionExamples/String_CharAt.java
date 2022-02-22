package com.janbask.StringfunctionExamples;

public class String_CharAt {

	public static void main(String[] args) {
		
		String value="Welcome to Janbask   training";
		
		//System.out.println(value.charAt(10));
		
		
		for(int i=value.length()-1;i>=0;i--) {
			
			System.out.println(value.charAt(i));
		}

	}

}
