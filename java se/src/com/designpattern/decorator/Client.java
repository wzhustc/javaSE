package com.designpattern.decorator;

public class Client {
	public static void main(String[] args) {
		
		Component c = new ConcreteComponent();
		
		Decorator d1 = new ConcreteDecorator1(c);
		
		Decorator d2 = new ConcreteDecorator2(d1);
		//等价于：Decorator d2 = new ConcreteDecorator2(new ConcreteDecorator1(new ConcreteComponent()))
		
		d1.doSomething();
		System.out.println("-----------");
		d2.doSomething();
	}
}
