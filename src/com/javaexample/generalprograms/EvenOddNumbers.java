package com.javaexample.generalprograms;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter any number : ");

		//return the user input as integer
		int number =in.nextInt();
		
		if( (number&1) == 0){
		System.out.println("number  is even number");
		}else{
		System.out.println("number is odd number ");
		}


	}

}
