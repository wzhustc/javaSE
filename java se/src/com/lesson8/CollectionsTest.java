package com.lesson8;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add(new Integer(-20));
		list.add(new Integer(-10));
		list.add(new Integer(10));
		list.add(new Integer(20));
		
		
		Comparator r = Collections.reverseOrder();
//		Collections.sort(list, r);
		Collections.shuffle(list);
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println("minimum:" + Collections.min(list));
		System.out.println("minimum:" + Collections.max(list));
		
		
		
	}
}	
