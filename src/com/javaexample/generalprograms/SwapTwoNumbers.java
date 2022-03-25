package com.javaexample.generalprograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 10; int b = 20; 
		// one way using arithmetic operator e.g. + or - // won't work if sum overflows 
		System.out.println("before swapping numbers: "+a +" "+ b);  
		a = a + b;
		b = a - b;
		a = a - b; 
		System.out.println("After swapping: "+a +"  " + b);   
	}

}
