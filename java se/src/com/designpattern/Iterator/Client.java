package com.designpattern.Iterator;

public class Client {
	public static void main(String[] args) {
		ConcreteAggregate aggregate = new ConcreteAggregate();
		aggregate.add("张三");
		aggregate.add("李四");
		aggregate.add("王五");
		aggregate.add("赵六");
		
		
		Iterator iter = new ConcreteIterator(aggregate);
		Object item = iter.first();
		System.out.println("第一个人是 ： " + item);
		
		System.out.println("所有人是 ：");
		while (!iter.isDone()) {
			System.out.println(iter.currentItem());
			iter.next();
		}
		
		
	}
}
