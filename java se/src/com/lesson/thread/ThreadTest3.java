package com.lesson.thread;

public class ThreadTest3 {
	public static void main(String[] args) {
		Runnable r = new HelloThread1();
		Thread t1 = new Thread(r);
		
		t1.start();
		r = new HelloThread1();//对于成员变量i来说,在new出两个对象后，每个对象都会持有一个i，所以会出现100次交替执行
//		Runnable r1 = new HelloThread2();
		Thread t2 = new Thread(r);
		t2.start();
	}
}

class HelloThread1 implements Runnable {
	int i;//这里的i是成员变量，在内存中共享。两个线程对象访问的是同一个i，所以是同一个i在++,最后两个一起加，到50停止，共50次
	
	@Override
	public void run() {
		int i = 0;//这是局部变量，每个线程对象都有一份，所以在每个线程对象内，都在++各自的i，而时间上有不分前后的加，所以是交替在++，每个++自己的i到50，共100次
		
		while (true) {
			
			System.out.println("world:" + i++);//这里的this指代当前的成员变量i
			
			try {
				Thread.sleep((long)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (50 == i) {
				break;
			}
		}
	}
}


class HelloThread2 implements Runnable {
	@Override
	public void run() {
		
		int i = 0;
		while(true) {
			System.out.println("Too young:" + i++);
			
			try {
				Thread.sleep((long)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(30 == i) {
				break;
			}
		}
	}
}