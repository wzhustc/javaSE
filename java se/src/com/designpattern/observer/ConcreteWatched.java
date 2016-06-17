package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWatched implements Watched {

	List<Watcher> list = new ArrayList<Watcher>();
	
	@Override
	public void add(Watcher watcher) {
		list.add(watcher);
		System.out.println("add an watcher!");
	}

	@Override
	public void remove(Watcher watcher) {
		list.remove(watcher);
		System.out.println("remove a watcher!");
	}

	@Override
	public void notify(String state) {
		for(Watcher watchers : list) {
			watchers.update(state);
		}
	}
}
