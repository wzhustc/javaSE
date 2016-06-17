package com.Core.reflection;

public class Test3 {
	public static void main(String[] args) throws Exception {
		Class<?> demo = null;
		
		demo = Class.forName("com.Core.reflection.Person3");
		
		Class<?>[] inter = demo.getInterfaces();
		
		for (int i = 0; i < inter.length; i++) {
			System.out.println("实现的接口：" + inter[i].getName());
		}
	}
}
