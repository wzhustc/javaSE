package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) throws IOException {
		try {
			System.out.println("input : ");
			int count, n = 512;
			byte[] Buffer = new byte[n];
			count = System.in.read(Buffer);
			
			FileOutputStream wf = new FileOutputStream("1.txt");
			wf.write(Buffer, 0, count);
			wf.close();
			System.out.println("over");
		} catch (FileNotFoundException e) {
			System.out.println("File Write Error!"); 
			e.printStackTrace();
		}
	}
}
