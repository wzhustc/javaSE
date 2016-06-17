package com.io;

import java.io.File;

public class ListAllFile {
	public static void main(String[] args) {
		File file = new File("c:/aaa");
		
		if (!file.exists()) {
			System.out.println("file is not exists");
		}
		
		File[] fileList = file.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].isDirectory()) {
				System.out.println("directory : " + fileList[i].getName());
			}
			else 
				System.out.println("file : " + fileList[i].getName());
			
		}
	}
}
