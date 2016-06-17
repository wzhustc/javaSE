package com.lesson.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("c:/test11.txt",true);
		String str = "ni shibushi dashabi";
		String str2 = "aaa";
		//getBytes()代表将str的字符转换为字节，存到byte数组中
		byte[] buffer = str.getBytes();
		fos.write(buffer);
		
		
		fos.close();
	}
}
