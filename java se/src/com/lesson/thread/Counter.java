package com.lesson.thread;

public class Counter {
	public static int count = 0;
	
	public static void inc() {
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count++;
		
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					Counter.inc();
				}
			});
			t.start();
			System.out.println(count);
		}
	}
}

