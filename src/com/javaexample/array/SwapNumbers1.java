package com.javaexample.array;

public class SwapNumbers1 {

	public static void main(String[] args) {

		int no1 = 20, no2 = 30;

		System.out.println("Before Swap numbers");
		System.out.println("First number = " + no1);
		System.out.println("Second number = " + no2);

		no1 = no1 - no2;
		no2 = no1 + no2;
		no1 = no2 - no1;

		System.out.println("After Swap Numbers");
		System.out.println("First number = " + no1);
		System.out.println("Second number = " + no2);

	}

}
