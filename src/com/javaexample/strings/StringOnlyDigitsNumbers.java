package com.javaexample.strings;

public class StringOnlyDigitsNumbers {

	public static void main(String[] args) {
		 String str = "4434";
	      if(str.matches("[0-9]+") && str.length() > 2) {
	         System.out.println("String contains only digits!");
	      }
	}

}
