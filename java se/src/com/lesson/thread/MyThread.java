package com.lesson.thread;

public class MyThread  {
	public static void main(String[] args) {
		Thread t1 = new Thread(new TestThread());
		t1.start();
		
		Thread t2 = new Thread(new TestThread2());
		t2.start();
		
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 55; i++) {
					System.out.println("hellooo worldddd" + i);
				}
			}
		});
		t3.start();
	}
}

class TestThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello:" + i);
		}
	}
}

class TestThread2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("world:" + i);
		}
	}
}
