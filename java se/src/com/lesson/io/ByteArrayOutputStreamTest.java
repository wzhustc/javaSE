package com.lesson.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamTest {
	public static void main(String[] args) throws Exception {
		String str = "hello world welcome";
		byte[] buffer = str.getBytes();
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		baos.write(buffer);
		
		byte[] result = baos.toByteArray();
		
		for(int i = 0; i < result.length; i++)
		{
			System.out.print((char)result[i]);
		}
		
		FileOutputStream fos = new FileOutputStream("c:/tesst.txt");
		
		baos.writeTo(fos);
		
		fos.close();
		baos.close();
	}
}
