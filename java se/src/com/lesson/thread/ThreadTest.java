package com.lesson.thread;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		ThreadPoolExecutor tpe = new ThreadPoolExecutor(0, 0, 0, null, null);
		Thread1 t1 = new Thread1("1");
		Thread2 t2 = new Thread2("2");
		
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread {
	
	public Thread1(String name) {
		System.out.println("hello thread1: " + name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}

class Thread2 extends Thread {
	
	public Thread2(String name) {
		System.out.println("haha thread2: " + name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		
	}
}
