package com.lesson7;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(new Integer(2));
		list.add(new Boolean(false));
		
		String str = (String)list.get(0);
		int i = (int)list.get(1);
		boolean b = (boolean)list.get(2);
		
		System.out.println(str);
		System.out.println(i);
		System.out.println(b);
	}
}
