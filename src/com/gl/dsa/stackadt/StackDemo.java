package com.gl.dsa.stackadt;

class Stack {
	int size;
	int top;
	int[] arr;

	public Stack(int size) {
		super();
		this.size = size;
		arr = new int[size];
		top = -1;
	}

	boolean isEmpty() {
		return top == -1;
	}

	boolean isFull() {
		return top == size - 1;
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack is Full...");
			System.exit(0);
		}
		arr[++top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty..");
			System.exit(0);
		}
		return arr[top--];
	}

	public void display() {
		for (int i = top; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	int peek(int pos) {
		int data = 0;
		if (top - pos + 1 < 0) {
			System.out.println("Invalid position....");
			System.exit(0);
		}
		data = arr[top - pos + 1];
		return data;
	}

}

public class StackDemo {
	public static void main(String[] args) {
		int size = 4;
		Stack st = new Stack(size);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		// st.push(50);
		st.display();
		System.out.println(st.peek(2));
		 
	}

}
