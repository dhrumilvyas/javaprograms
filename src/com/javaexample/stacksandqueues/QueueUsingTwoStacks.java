package com.javaexample.stacksandqueues;

import java.util.Stack;

public class QueueUsingTwoStacks {
	Stack<Integer> st1;
	Stack<Integer> st2;
private int front;

public QueueUsingTwoStacks() {
    st1 = new Stack<>();
    st2 = new Stack<>();
}

//Push the element in first stack
public void push(int x) {
    st1.push(x);
}

/* Pop the element from second stack, 
   If second stack is empty and first stack is not empty then pop all the elements from first stack 
   and push them in a second stack. 
*/
public int pop() {
    shiftStackElement();
    return st2.pop();
}

public int peek() {
    shiftStackElement();
    return st2.peek();
}

public boolean empty() {
    return st1.isEmpty() && st2.isEmpty();
}


private void shiftStackElement() {
    if(st2.isEmpty() && !st1.isEmpty()) {
        
        while(!st1.isEmpty()) {
            st2.push(st1.pop());
        }
    }
}

	public static void main(String[] args) {
		QueueUsingTwoStacks qu=new QueueUsingTwoStacks();
		qu.push(3);
		qu.push(4);
		qu.peek();
		qu.pop();
		qu.empty();
		
	}
	

}
