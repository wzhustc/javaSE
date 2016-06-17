package com.lesson8;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		set.add("A");
		set.add("V");
		set.add("T");
		set.add("J");
		set.add("X");
		
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.contains("X"));
		
		System.out.println("----------------------------");
		
		Iterator it = set.descendingIterator();
		while (it.hasNext()) {
			String value = (String) it.next();
			System.out.println(value);
		}
		System.out.println("---------------------------");
		for (Iterator iter = set.iterator(); iter.hasNext(); ) {
			String value = (String)iter.next();
			System.out.println(value);
		}
	}
}
