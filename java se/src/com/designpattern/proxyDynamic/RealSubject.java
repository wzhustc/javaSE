package com.designpattern.proxyDynamic;

public class RealSubject implements Subject {

	@Override
	public void rentHouse() {
		System.out.println("I want to rent my house");
	}

	@Override
	public void sayHello(String str) {
		System.out.println("Hello :" + str);
	}

}
