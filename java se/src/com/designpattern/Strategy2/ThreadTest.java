package com.designpattern.Strategy2;

public class ThreadTest {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
	}
	
}

class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("hello world : "+ i);
		}
	}
}