package com.designpattern.abstractFactoryMethod2;

public class Client {

	public static void main(String[] args) {
		COS cos = new COS();
		AbstractFactory af = new ZhangSanFactory();
		cos.cookSomething(af);
	}
}
