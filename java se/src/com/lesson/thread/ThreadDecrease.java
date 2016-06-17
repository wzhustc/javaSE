package com.lesson.thread;

public class ThreadDecrease extends Thread {
	
	private Sample2 sample2;
	
	public ThreadDecrease(Sample2 sample2) {
		this.sample2 = sample2;
	}
	
	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep((long)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sample2.decrease();
		}
	}
}
