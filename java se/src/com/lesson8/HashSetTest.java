package com.lesson8;

import java.util.HashSet;

public class HashSetTest {
	
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		/*set.add(new People("zhagsan"));
		set.add(new People("lisi"));
		
		System.out.println(set);*/
		/*
		 * 对于两个Object对象，使用Hashse的话，会首先调用其hashCode这个方法，
		 * 如果hashCode方法生成的hashCode值不一样，则直接加到set中，否则在比较equals方法
		 * equals方法如果不相等，那么加入到set集合中，否则两个对象就是一个对象，不加入到set中
		 */
		String str1 = new String("A");
		String str2 = new String("A");
		
		System.out.println("str1 hash code:" + str1.hashCode());
		System.out.println("str2 hash code:" + str2.hashCode());
		
		set.add(str1);
		set.add(str2);
		
		System.out.println(set);
		
	}
}

class People {
	public String name;
	
	public People(String name) {
		this.name = name;
	}
}