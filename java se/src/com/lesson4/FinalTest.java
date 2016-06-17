package com.lesson4;

public class FinalTest {
	public static void main(String[] args) {
		People people = new People();
//		people.address = new Address();//error表示address是不能被改变的，但是address指向的内容可以改变
		String str = people.address.name = "shanghai";  //但是引用指向的对象的内容是可以被修改的
		System.out.println(str);
	}
}

class People {
	final Address address = new Address();  //final修饰address属性，表示引用（即地址）不能被修改
	
}

class Address {
	String name = "beijing";
}
