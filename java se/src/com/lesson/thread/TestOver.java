package com.lesson.thread;

public class TestOver {
	public static void main(String[] args) {
		
		Sample2 sample2 = new Sample2();
		
		Thread t1 = new ThreadIncrease(sample2);
		Thread t2 = new ThreadDecrease(sample2);
		Thread t3 = new ThreadIncrease(sample2);
		Thread t4 = new ThreadIncrease(sample2);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
