package com.lesson.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterTest1 {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("c:/11.txt",true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		String str = "if you see this, it means you hava success!";
		
		bw.write(str);
		bw.write("\n");
		
		bw.close();
	}
}
