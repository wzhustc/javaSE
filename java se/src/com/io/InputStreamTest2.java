package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest2 {
	public static void main(String[] args) throws IOException {
		String filePath = "d:" + File.separator + "javaTest" + File.separator +
				"hello.txt";
		File file = new File(filePath);
		
		InputStream in = new FileInputStream(file);
		
		byte[] b = new byte[(int)file.length()];
		
		int count = 0;
		
		while (in.read(b) != -1) {
			b[count++] = (byte) in.read(b);
		}
		in.close();
		System.out.println(new String(b));
	}
}
