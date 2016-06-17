package com.lesson.thread;

public class HelloThread {
	public static void main(String[] args) {
		MyThreadd t1 = new MyThreadd("Hello Thread");
		t1.start();
		MyThreadd t2 = new MyThreadd("World Thread");
		t2.start();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}
}

class MyThreadd extends Thread {
	String name;
	
	public MyThreadd() {
	}
	public MyThreadd(String name) {
		super(name);
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("haha:" + i);
		}
	}
}

class MyThreadd2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("biu : " + i);
		}
	}
}