package com.io;

import java.io.File;

public class Search {
	public static void main(String[] args) {
		String filePath = "d:" + File.separator + "javaTest" + File.separator;
		
		File file = new File(filePath);
		
		print(file);
		
	}

	public static void print(File file) {
		if (file != null) {
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				if (files != null) {
					for (int i = 0; i < files.length; i++) {
						print(files[i]);
					}
				} 
			}else {
				System.out.println(file);
			}
		} 
	}
	
	
}
