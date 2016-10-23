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
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread3: " + i);
		}
	}
}

class Thread4 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread4: " + i);
		}
	}
}