package com.lesson7;

import java.util.ArrayList;

public class ArrayListTest3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		
		int sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			int value = ((Integer)list.get(i)).intValue();
			
			sum += value;
		}
		System.out.println(sum);
		//使用toArray()方法
		/*
		 * 不能将Object[]数组->Integer[]数组，因为Object[]数组里面什么都能放，但是Integer[]数组只能放整形的，所以错了啊
		 * 但是我们前面学过Object类型可以转换为Integer类型
		 */
		Object[] obj = list.toArray();
		
		for (int i = 0; i < obj.length; i++) {
			System.out.println(((Integer)obj[i]).intValue());
			
		}
		
		
	}
}
