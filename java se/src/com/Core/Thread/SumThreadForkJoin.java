package com.Core.Thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumThreadForkJoin extends RecursiveTask<Integer> {
	
	private static final long serialVersionUID = 1L;

	private static final int THREASHOLD = 2;
	
	int lo; int hi; int arr[];
	
	public SumThreadForkJoin(int l, int h, int a[]) {
		this.lo = l;
		this.hi = h;
		this.arr = a;
	}
	
	@Override
	protected Integer compute() {
		if (hi -lo < THREASHOLD) {
			int ans = 0;
			for (int i = 0; i < arr.length; i++) {
				ans += arr[i];
			}
			return ans;
		} else {
			SumThreadForkJoin left = new SumThreadForkJoin(lo, (lo+hi)/2, arr);
			SumThreadForkJoin right = new SumThreadForkJoin((lo+hi)/2, hi, arr);
			left.fork();
			int rightComp = right.compute();
			int leftJoin = left.join();
			
			return rightComp + leftJoin;
		}
	}
	
	static final ForkJoinPool fjPool = new ForkJoinPool();
	
	int sum(int arr[]) {
		return fjPool.invoke(new SumThreadForkJoin(lo, hi, arr));
	}
}





