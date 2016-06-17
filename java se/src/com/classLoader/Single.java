package com.classLoader;

public class Single {
//	private static Single single = new Single();
	
	private Single() {
		
	}
	
	public static Single getInstance() {
		return B.single;
	}
	
	private static class B{
		static Single single = new Single();
	}
}
