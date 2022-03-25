package com.javaexample.linkedlist;

class LNode{
    LNode next;
    int data;
    LNode(int d){
        data = d;
        next = null;
    }
}
public class LengthOfLinkedList {

	LNode head;
    public void push(int new_data)
    {
        LNode new_node = new LNode(new_data);
        new_node.next = head;
        head = new_node;
    }

    public int getCount()
    {
        LNode temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args)
    {
        LengthOfLinkedList llist = new LengthOfLinkedList();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        System.out.println("Count of nodes is " +
                llist.getCount());
    }
}
