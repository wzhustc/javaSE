package com.lesson.io;

import java.io.File;
import java.util.ArrayList;

public class RecursiveTask {
	public static void main(String[] args) {
		File file = new File("D:/javaTest");
		display(file);
	}
	
	public static void display(File file) {
		
		if (file.isFile() || file.listFiles().length == 0) {
			return ;
		} else {
			File[] files = file.listFiles();
			for (File fi : files) {
				
				display(fi);
				System.out.println(fi.getName());
			}
		}
		
		
//		if (file.isDirectory()) {
//			File[] files = file.listFiles();
//			for(File fi : files) {
//				System.out.println("----" + fi.getName());
//			}
//		} else if (file.isFile()) {
//			System.out.println(file.getName());
//		}
	}
	
	//判断是文件还是文件夹，并先显示文件夹，再显示文件
	private static File[] tools(File[] file) {
		ArrayList<File> sorted = new ArrayList<File>();
		
		for(File file1 : file) {
			if (file1.isDirectory()) {
				sorted.add(file1);
			}
		}
		
		for(File file2 :file) {
			if (file2.isFile()) {
				sorted.add(file2);
			}
		}
		
		return sorted.toArray(new File[file.length]);
	}
	
	//判断有几层，需要几个tab键
	private static String getTabs(int level) {
		StringBuffer buffer = new StringBuffer();
		
		for (int i = 0; i < level; i++) {
			buffer.append("\t");
		}
		return buffer.toString();
	}
}
