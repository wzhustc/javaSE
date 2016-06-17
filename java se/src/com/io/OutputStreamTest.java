package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {
	public static void main(String[] args) throws IOException {
		String filePath = "d:" + File.separator + "javaTest" + File.separator +
				"hello.txt";
		String filePath1 = "d:" + File.separator + "javaTest" + File.separator +
				"hello1.txt";
		
		File file = new File(filePath);
		File file1 = new File(filePath1);
		
		OutputStream out = new FileOutputStream(file,true);
		OutputStream out1 = new FileOutputStream(file1,true);
			
		String str = "wo shi laoda";
		String str1 = "Hello world";
		
		byte[] b = str.getBytes();
		byte[] b1 = str1.getBytes();
		
		for (int i = 0; i < b.length; i++) {
			out.write(b[i]);
		}
		out1.write(b1);
		
		out.close();
		out1.close();
	}
}
