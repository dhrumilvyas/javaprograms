package com.javaexample.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		  
        // Appending elements at the end of the list
        ll.add(new Integer(1));
        ll.add(new Integer(2));
        ll.add(new Integer(3));
        ll.add(new Integer(4));
        ll.add(new Integer(5));
        System.out.println("The elements of the linked list before reversing: " + ll);
        // Collections.reverse method to reverse the list
        Collections.reverse(ll);
        System.out.println("The elements of the linked list after reversing: " + ll);

	}

}
