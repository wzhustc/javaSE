package com.lesson7;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("F");
		list.add("D");
		list.add("G");
		list.add("H");
		
		list.addFirst("A");
		list.addLast("Z");
		
		System.out.println(list);
	}
}
