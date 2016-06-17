package com.lesson.io;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamTest {
	public static void main(String[] args) throws Exception {
		String str = "AbCdEfGhIjKlMn";
		byte[] buffer = str.getBytes();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
		
		for (int i = 0; i < 3; i++) {
			int c;
			while (-1 != (c = bais.read())) {
				if (0 == i) {
					System.out.print((char)c);
				} else if (1 == i){
					System.out.print(Character.toUpperCase((char)c));
				} else if (2 == i) {
					System.out.print(Character.toLowerCase((char)c));
				}
			}
			bais.reset();
		}
		
		bais.close();
	}
}
