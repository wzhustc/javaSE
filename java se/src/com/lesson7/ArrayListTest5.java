package com.lesson7;

import java.util.ArrayList;
/**
 * 泛型让apple容器只能容纳apple类型的对象
 * @author ZhangWei
 *
 */
public class ArrayListTest5 {
	public static void main(String[] args) {
		ArrayList<Apple> array = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++) {
			array.add(new Apple());
		}
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		System.out.println("-------------------");
		for  (Apple apple : array) {
			System.out.println(apple);
		}
	}
}

class Apple {
	
}

class Orange {
	
}
