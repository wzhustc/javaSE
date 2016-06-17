package com.designpattern.decorator;

public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component component) {
		super(component);
	}
	
	public void doSomething() {
		super.doSomething();
		this.doAnotherThing();
	}
	
	public void doAnotherThing() {
		System.out.println("Function B");
	}
}
