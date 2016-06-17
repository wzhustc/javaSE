package com.Core;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		list.add("Tom");
		list.add("Jerry");
		list.add("Hello");
		
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			String str = (String) iter.next();
			System.out.println("str : " + str);
		}
		
//		Iterator iter = list.iterator();
//		
//		String first = (String)iter.next();
//		String second = (String) iter.next();
//		String third = (String) iter.next();
//		//remove其实删的是next刚访问过的那个元素，而不是下一个元素
//		iter.remove();
//		System.out.println(list);
	}
}	
