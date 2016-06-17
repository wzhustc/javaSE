package com.lesson.thread;

public class ThreadTest {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1("1");
		Thread2 t2 = new Thread2("2");
		
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread {
	
	public Thread1(String name) {
		System.out.println("hello thread: " + name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello " + i);
		}
	}
}

class Thread2 extends Thread {
	
	public Thread2(String name) {
		System.out.println("haha thread: " + name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("world " + i);
		}
		
	}
}
