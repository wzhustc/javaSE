package com.io;

import java.io.File;

public class IsDirectoryTest {
	public static void main(String[] args) {
		String filePath = "d:" + File.separator + "javaTest";
		
		File file = new File(filePath);
		if (file.isDirectory()) {
			System.out.println("It is a directory");
		}
		System.out.println("not");
	}
	
}
