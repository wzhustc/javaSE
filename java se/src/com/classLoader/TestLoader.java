package com.classLoader;

import java.util.Hashtable;

public class TestLoader {
	public static void main(String[] args) {
		ClassLoader tl = TestLoader.class.getClassLoader();
		System.out.println(tl);
		
		String str = tl.getParent().getClass().getName();
		System.out.println(str);
		
		ClassLoader cl = tl.getParent();
		System.out.println(cl);
		
		ClassLoader cl2 = cl.getParent();
		System.out.println(cl2);
		
		Hashtable ht = new Hashtable();
		
		ht.put(null, "1");
		
	}
}
