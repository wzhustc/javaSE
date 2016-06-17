package com.lesson8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new MyComparator()); //TreeSet有这种构造方法
		
		Person p1 = new Person(10);
		Person p2 = new Person(20);
		Person p3 = new Person(30);
		Person p4 = new Person(40);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
//		System.out.println(set);
		for (Iterator iter = set.iterator(); iter.hasNext(); ) {
			Person p = (Person)iter.next();
			System.out.println(p);
		}
	}
}

class Person {
	int score;
	
	public Person(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.score);
	}
}

class MyComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		
		return p1.score - p2.score;
	}
}