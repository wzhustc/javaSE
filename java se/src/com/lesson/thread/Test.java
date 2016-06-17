package com.lesson.thread;

public class Test {
	public static void main(String[] args) {
		
		Storage storage = new Storage();
		
		Producer p1 = new Producer(storage);
		Producer p2 = new Producer(storage);
		Producer p3 = new Producer(storage);
		Producer p4 = new Producer(storage);
		
		p1.setNum(10);
		p2.setNum(10);
		p3.setNum(10);
		p4.setNum(10);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		Consumer c1 = new Consumer(storage);
		Consumer c2 = new Consumer(storage);
		Consumer c3 = new Consumer(storage);
		Consumer c4 = new Consumer(storage);
		
		c1.setNum(15);
		c2.setNum(15);
		c3.setNum(5);
		c4.setNum(5);
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}
}
