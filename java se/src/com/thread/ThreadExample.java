package com.thread;

public class ThreadExample {
	public static void main(String[] args) {
		System.out.println(new Thread().currentThread().getName());
		
		for (int i = 0; i < 10; i++) {
			new Thread("" + i) {
				public void run() {
					System.out.println("Thread " + getName() + " is running");
				};
			}.start();
		}
	}

	StringBuilder sb = new StringBuilder();
	public ThreadExample(String text) {
		this.sb.append(text);
	}
}
