package com.javaexample.linkedlist;

import java.util.LinkedList;

public class FindMiddleElement {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
	    // Add elements to LinkedList
	    ll.add(2);
	    ll.addFirst(7);
	    ll.addLast(5);
	    ll.addLast(15);
	    ll.addLast(9);
	    ll.addLast(12);
	    ll.addLast(18);
	    System.out.println("LinkedList: " + ll);
	    // access middle element
	    int middle = ll.get(ll.size()/2);
	    System.out.println("Middle Element: " + middle);

	}

}
