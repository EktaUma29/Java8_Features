package com.data.structure;

public class CustomStack {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.pop();
		s.push(10);
		s.push(20);
		s.pop();
		System.out.println(s.peek());
		
	}

}

class Stack {

	int top = 0;
	static final int MAX = 2;
	int arr[] = new int[MAX];

	boolean isEmpty() {
		return (top < 0);
	}

	Stack() {
		top = -1;
	}

	boolean push(int x) {
		if (top >= (MAX - 1)) {
			throw new StackOverFlowException();
		} else {
			arr[++top] = x;
			System.out.println(x + " Pushed into stack");
			return true;
		}
	}
	
	int pop() {
		if(top < 0) {
			throw new StackOverFlowException();
		}else {
			int x = arr[top--];
			return x;
		}
	}
	
	int peek() {
		if(top < 0) {
			throw new StackOverFlowException();
		}
		else {
			int x = arr[top];
			return x;
		}
	}

}