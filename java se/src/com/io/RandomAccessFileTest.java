package com.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException {
		String filePath = "D:" + File.separator + "javaTest" + 
	File.separator + "hello.txt";
		
		File file = new File(filePath);
		
		RandomAccessFile demo = new RandomAccessFile(file, "rw");
		
		demo.write(122);
		demo.writeBytes("ssaassaa");
		demo.writeChar('h');
		demo.writeDouble(12.2);
		demo.writeInt(22);
		
		demo.close();
		
	}
}
