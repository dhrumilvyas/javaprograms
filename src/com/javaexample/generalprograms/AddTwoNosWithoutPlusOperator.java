package com.javaexample.generalprograms;

public class AddTwoNosWithoutPlusOperator {

	public static void main(String[] args) {
		int x=10,y=20;
		while(y != 0){
            int temp = x & y;
            x = x ^ y;
            y = temp << 1;
        }
        System.out.print("Sum = "+x); 
		System.out.print("\n");     	
	}

}
