package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
	public static void main(String[] args) throws IOException {
		String filePath = "d:" + File.separator + "javaTest" + File.separator +
				"hello.txt";
		
		File file = new File(filePath);
		
		InputStream in = new FileInputStream(file);
		
		byte[] b = new byte[(int) file.length()];
		
		in.read(b);
		in.close();
		System.out.println("length : " + file.length());
		System.out.println(new String(b));
	}
}
