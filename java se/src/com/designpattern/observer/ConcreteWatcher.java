package com.designpattern.observer;

public class ConcreteWatcher implements Watcher{

	@Override
	public void update(String state) {
		System.out.println(state);
	}
}
