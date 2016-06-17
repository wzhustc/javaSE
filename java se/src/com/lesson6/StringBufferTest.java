package com.lesson6;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		
		String result = str.append("hello").append(" world").append(" " +100).toString();
		System.out.println(result);
	}
}
