package com.lesson6;

public class ArrayTest6 {
	public static void main(String[] args) {
		
		I[] i = new I[2];//数组要初始化长度，后面的2是必须的
		I j = null;
		
		i[0] = new B();
		i[1] = new B();
		
		int[] a = new int[]{1, 2, 3};//在这里直接赋值时不需要写出数组长度大小
		I[] k = new I[]{new B(), new B()};
	}
}

interface I {
	
}

class B implements I {
	
}