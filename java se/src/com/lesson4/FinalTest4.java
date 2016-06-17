package com.lesson4;

public class FinalTest4 {
	public static void main(String[] args) {
		Person p = new Person();
		//引用=地址，这个在final定义后是不能改变的，否则报错，而引用指向的内存的内容则是可以变化的，这里就是beijing变成了shanghai
		p.addr.name = "shanghai";
		System.out.println(p.addr.name);
	}
}

class Person {
	
	//person类有一个addr引用，是Addr类型的引用，引用指向Addr内存，这块内存有属性name=beijing
	final Addr addr = new Addr(); 
}

class Addr {
	String name = "beijing";
}