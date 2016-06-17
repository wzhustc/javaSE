package com.io;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		String filePath = "d:" + File.separator + "javaTest" + File.separator + "hello.txt";
		
		File file = new File(filePath);
		
		if (file.exists()) {
			file.delete();
			System.out.println("file already deleted...");
		} else {
			System.out.println("file do not exist...");
		}
	}
}
