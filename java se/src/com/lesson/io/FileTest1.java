package com.lesson.io;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:/test1.txt");
		System.out.println(file.createNewFile());
//		file.delete();
		
		File file2 = new File("c:" + File.separator + "abc", "test1.txt");
		System.out.println(file2.createNewFile());
//		file2.delete();
		
		File file3 = new File("c:/abc/hello");
		System.out.println(file3.mkdir());
		
		File file4 = new File("c:/aaa/hahaha/hello");
		System.out.println(file4.mkdirs());
		
		File file5 = new File("C:/Program Files");
		String[] list = file5.list();
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("-----------------------");
		File file6 = new File("C:/Program Files");
		File[] files = file6.listFiles();
		for (File filename : files) {
			System.out.println(filename.getName());
		}
	}
}
