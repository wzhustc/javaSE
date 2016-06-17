package com.designpattern.abstractFactoryMethod2;

public class COS {
	
	public void cookSomething(AbstractFactory af) {
		af.cookFish();
		System.out.println("Client A need a fish");
	}
}
