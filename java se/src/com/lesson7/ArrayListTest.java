package com.lesson7;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("welcome");
		
		String s1 = (String)arrayList.get(0);
		String s2 = (String)arrayList.get(1);
		String s3 = (String)arrayList.get(2); 
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("---------------");
		arrayList.remove(2);
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		arrayList.clear();
		System.out.println(arrayList.isEmpty());
		System.out.println("---------------");
		
		
		arrayList.add(s1);
		arrayList.add(s2);
		//以数组的形式输出ArrayList的全部元素
		System.out.println(arrayList);
		
		arrayList.add(0, "String");
		System.out.println(arrayList.contains("String"));
		System.out.println(arrayList);
		arrayList.remove("hello");
		System.out.println(arrayList);
		System.out.println("---------------------------------");
		//set方法是把指定下标的元素给覆盖了，而不像add那样，增加，老的元素往后挪
		arrayList.set(0, "zhangdaxia");
		arrayList.set(1, "好帅");
		System.out.println(arrayList);
		
		System.out.println("----------------------------");
		arrayList.add(0, "来自安徽合肥的");
		arrayList.set(1, "张伟");
		arrayList.add(2, "张大侠");
		System.out.println(arrayList.indexOf("张大侠"));
		
		System.out.println(arrayList);
		
	}
	
	
}
