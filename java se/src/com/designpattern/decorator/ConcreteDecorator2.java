package com.designpattern.decorator;

public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component component) {
		super(component);
	}
	
	public void doSomething() {
		super.doSomething();
		this.doAnotherThing();
	}
	
	public void doAnotherThing() {
		System.out.println("Function C");
	}
}
