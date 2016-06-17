package com.designpattern.observer;

public class Client {

	public static void main(String[] args) {
		Watched girl = new ConcreteWatched();
		
		Watcher watcher1 = new ConcreteWatcher();
		Watcher watcher2 = new ConcreteWatcher();
		Watcher watcher3 = new ConcreteWatcher();
		
		girl.add(watcher1);
		girl.add(watcher2);
		girl.add(watcher3);
		
		girl.notify("I have 3 watcher , happy");
		
		girl.remove(watcher3);
		
		girl.notify("watcher3 removed, unhappy");
		
		girl.remove(watcher2);
		
		girl.notify("watcher2 also removed , crying....");
		
	}
}
