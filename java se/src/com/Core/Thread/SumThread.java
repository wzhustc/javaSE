package com.Core.Thread;
/**
 * 用Divide and Conquer写的求数组和的多线程程序
 * @author Administrator
 *
 */
public class SumThread extends Thread {
	
	private static final int THREASHOLD = 2;
	int lo; int hi; int arr[];
	int ans = 0;
	SumThread(int l, int h, int a[]) {
		this.lo = l;
		this.hi = h;
		this.arr = a;
	}
	
	@Override
	public void run() {
		if ((hi - lo) < THREASHOLD) {
			for (int i = lo; i < hi; i++) {
				ans += arr[i];
			}
		} else {
			SumThread left = new SumThread(lo, (lo + hi) / 2, arr);
			SumThread right = new SumThread((lo + hi) / 2, hi, arr);
			left.start();
			right.run();//这里不用right.start()是因为可以将分解后的父线程给子线程中的右边的线程，从而节省开销
			try {
				left.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ans = left.ans + right.ans;
		}
	}
	
	public int resultSum(int arr[]) {
		SumThread t = new SumThread(0, arr.length, arr);
		return t.ans;
	}
}
