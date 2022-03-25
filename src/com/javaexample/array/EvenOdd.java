package com.javaexample.array;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		int Number = sc.nextInt();

		if (Number % 2 == 0) {
			System.out.println("is even" + Number);
		} else {
			System.out.println("is odd" + Number);

		}

	}

}
