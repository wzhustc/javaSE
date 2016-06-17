package com.lesson.thread.proandcon;

public class Test {
	public static void main(String[] args) {
		Base base = new Base(30);
		Thread p1 = new Producer(base, 20);
		Thread p2 = new Producer(base, 20);
		Thread p3 = new Producer(base, 40);
		Thread c1 = new Consumer(base, 10);
		Thread c2 = new Consumer(base, 10);
		Thread c3 = new Consumer(base, 50);
//		Thread c4 = new Consumer(base, 50);
		
		p1.start();
		p2.start();
		p3.start();
		c1.start();
		c2.start();
		c3.start();
//		c4.start();
	}
}
