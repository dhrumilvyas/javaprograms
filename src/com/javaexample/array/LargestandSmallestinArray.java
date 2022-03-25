package com.javaexample.array;

public class LargestandSmallestinArray {

	public static void main(String[] args) {

		int a[] = { 50, 30, 20, 40, 60 };

		int Largest = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > Largest) {
				Largest = a[i];
			}
		}
		System.out.println("Largest no: " + Largest);

		int Smallest = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < Smallest) {
				Smallest = a[i];
			}
		}
		System.out.println("Smallest no: " + Smallest);

	}

}
