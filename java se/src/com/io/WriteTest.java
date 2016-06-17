package com.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriteTest {
	public static void main(String[] args) throws IOException {
		String filePath = "d:" + File.separator + "javaTest" + File.separator +
				"hello.txt";
		File file = new File(filePath);
		
		Writer wr = new FileWriter(file, true);
		
		String str = "welcome";
		
		wr.write(str);
		wr.flush();
		wr.close();
		
		Reader read = new FileReader(file);
		char[] b = new char[(int) file.length()];
		
		int leng = read.read(b);
		
		System.out.println("length is : " + leng);
		System.out.println("content is :" + new String(b));
		read.close();
		
	}
}
