package com.designpattern.decorator;

public class Decorator implements Component {
	Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	public void doSomething() {
		component.doSomething();
	}
}
