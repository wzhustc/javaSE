package com.lesson.io;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest2 {
	public static void main(String[] args) {
		File file = new File("c:/abc/hello");
		String[] names = file.list();
		for (String string : names) {
			if (string.endsWith("java")) {
				System.out.println(string);
			}
		}
		System.out.println("------------------------");
		File file2 = new File("c:/abc/hello");
		
		String[] name = file2.list(new FilenameFilter()
				{
			@Override
			public boolean accept(File dir, String name) {
				if (name.endsWith(".java")) {
					return true;
				} 
				return false;
			}
				});
		
		for (String string : name) {
			System.out.println(string);
		}
				
		
	}
}
