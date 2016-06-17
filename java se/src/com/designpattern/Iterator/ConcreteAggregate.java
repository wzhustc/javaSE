package com.designpattern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {

	private List<Object> items = new ArrayList<Object>();
			
	public void set(int index, Object element) {
		items.set(index, element);
	}
	
	public void add(Object element) {
		items.add(element);
	}
	
	@Override
	public Iterator CreateIterator() {
		return new ConcreteIterator(this);
	}
	
	public Object get(int i) {
		return items.get(i);
	}
	
	public int size() {
		return items.size();
	}
	
}
