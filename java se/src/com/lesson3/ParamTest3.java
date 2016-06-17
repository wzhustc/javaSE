package com.lesson3;

public class ParamTest3 {
	public void change(Person person, Person person2) {
		person.name = "lisi";
		person2.name = "wangwu";
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "zhangsan";
		Person person2 = new Person();
//		Person person2 = person;
		
		ParamTest3 test = new ParamTest3();
		test.change(person, person2);
		System.out.println(person.name); //wangwu     //lisi 这里的person.name指的是不是形参，而是main函数的person引用
		System.out.println(person2.name);  //wangwu    //wangwu
	}
}

class Person {
	String name;
}
