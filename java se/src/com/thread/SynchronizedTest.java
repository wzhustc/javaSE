package com.thread;

public class SynchronizedTest {
	public static void main(String[] args) {
		Counter counter = new Counter();
		ThreadCounter tc = new ThreadCounter(counter);
		ThreadCounter tc1 = new ThreadCounter(counter);
		tc.start();
		tc1.start();
	}
}

class Counter {
	long count = 0;
	
	public synchronized void add(long count) {
		this.count += count;
		System.out.println("count=" + this.count + "----" 
		+ Thread.currentThread().getName());
	}
}

class ThreadCounter extends Thread {
	
	private Counter counter = null;
	
	public ThreadCounter(Counter counter){
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			counter.add(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
