package com.javaexample.array;

public class DuplicateArrays {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 1, 5 };
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Found duplicate element is:" + a[i]);
					flag=true;
				}
			}
		}

		if (flag == false) {
			System.out.println("Duplicate elements not found ");

		}
	}

}
