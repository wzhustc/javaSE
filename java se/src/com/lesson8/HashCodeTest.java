package com.lesson8;

import java.util.HashSet;

public class HashCodeTest {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		Student s1 = new Student("zhangsan");
		Student s2 = new Student("zhangsan".toString());
		set.add(s1);
		set.add(s2);
//		System.out.println(set);
//		set.add("zhangsan");
//		set.add("lisi");
		
		System.out.println(set);
	}
}

class Student {
	String name;
	
	public Student(String name) {
		this.name = name;
	}

	public int hashCode() {
		return this.name.hashCode();
	}
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (null != o && o instanceof Student) {
			Student s = (Student) o;
			if (name.equals(s.name)) {
				return true;
			}
		}
		return false;
	}
}