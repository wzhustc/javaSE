package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileTest {
	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.out.println("args length is wrong");
			System.exit(1);
		}
		
		if (args[0] == null) {
			System.out.println("not Exists");
			System.exit(1);
		}
		
		File file1 = new File(args[0]);
		File file2 = new File(args[1]);
		
		InputStream input = new FileInputStream(file1);
		OutputStream output = new FileOutputStream(file2);
		
		int temp = 0;
		temp = input.read();
		while ((temp != -1)) {
			output.write(temp);
		}
		
		output.close();
		input.close();
	}
}
