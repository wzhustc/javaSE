package com.InnerClass;

import java.util.Date;

public class AnonymousInnerClassTest {
	public static void main(String[] args) {
		AnonymousInnerClassTest test = new AnonymousInnerClassTest();
//		String str = test.getString(new Date());
//		System.out.println(str);
		
		String str = test.getString(new Date(){
			@Override
			public String toLocaleString() {
				return "the time is " + new Date().toLocaleString();
			}
		});
		
		System.out.println(str);
		
	}
	
	@SuppressWarnings("deprecation")
	public String getString(Date date) {
		return date.toLocaleString();
	}
}
