package com.Core.Thread;

public class RunnableTest {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
	}
	
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= 4; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
