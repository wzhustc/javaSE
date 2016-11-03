package com.io;

import java.io.FileInputStream;

public class FileInputStreamTest {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("test.txt");
		
		byte[] buffer = new byte[200];
		int length = 0;
		while (-1 != (length = fis.read(buffer, 0, 200))) {
			String str = new String(buffer, 0, length);
			System.out.println(str);
		}
		
		fis.close();
		
	}
}
