package com.lesson8;

import java.util.HashSet;

public class HashSetTest1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		/*
		 * 因为集合的元素具有唯一性，所以如果添加两个值一样的数据是不可行的。
		 */
		System.out.println(set.add("hello"));
		System.out.println(set.add("hello"));
		
		set.add("world");
		set.add("welcome");
		set.add("here");
		/*
		 * 因为集合是无序的，所以打印出来的值是无序的
		 */
		System.out.println(set);
		
	}
}
