package com.lesson3;
/**
 * �����еģ�����Ҳ�У�����û�еģ�����������ӣ������еģ�������Ըı�
 * @author Administrator
 *
 */
public class InheritenceTest {

	public static void main(String[] args) {
		Apple apple = new Apple();
		System.out.println(apple.name);
	}
}

class Fruit {
	String name = "fruit";
}

class Apple extends Fruit {
	String name = "apple";
}