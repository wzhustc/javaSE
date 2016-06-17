package com.lesson8;

import java.util.LinkedList;

public class MyStack {
	private LinkedList<Object> list = new LinkedList<Object>();
	
	public void push(Object o) {
		list.addFirst(o);
	}
	
	public Object pop() {
		return list.removeFirst();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public Object peek() {
		return list.getFirst();
	}
	
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		
		myStack.push("hello");
		myStack.push("world");
		myStack.push("welcome");
		myStack.push("here");
		
		System.out.println(myStack.peek());
		myStack.pop();
		System.out.println(myStack.peek());
		myStack.pop();
		System.out.println(myStack.peek());
		myStack.pop();
		System.out.println(myStack.peek());
		myStack.pop();
		
		System.out.println(myStack.isEmpty());
	}
}
