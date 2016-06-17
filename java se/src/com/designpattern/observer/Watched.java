package com.designpattern.observer;

public interface Watched {
	
	public void add(Watcher watcher);
	
	public void remove(Watcher watcher);
	
	public void notify(String state);
}
