package com.lesson.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class BufferedOutputStreamTest1 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("test.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		bos.write("www.google.com".getBytes());
		
		bos.close();
		os.close();
	}
}
