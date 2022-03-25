package com.javaexample.linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class DetectLoop {
	static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    static public void push(int new_data)
    {
      Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    static boolean detectLoop(Node h)
    {
        ArrayList<Node> s = new ArrayList<>();
        while (h != null) {
            if (s.contains(h))
                return true;
            s.add(h);
            h = h.next;
        }
        return false;
    }

    public static void main(String[] args)
    {
    	DetectLoop llist = new DetectLoop();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        llist.head.next.next.next.next = llist.head;
        if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }
}
