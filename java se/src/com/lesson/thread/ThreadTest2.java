package com.lesson.thread;

public class ThreadTest2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread3());
		t1.start();
		Thread t2 = new Thread(new Thread4());
		t2.start();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}
}

class Thread3 implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("hello " + i);
		}
	}
}

class Thread4 implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("world " + i);
		}
	}
}