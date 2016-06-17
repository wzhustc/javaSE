package com.io;

import java.io.File;

public class CreateNewFile {
	public static void main(String[] args) {
		//这是在windows下用\来表示分隔符，但是最好采用下面的那种写法，从跨平台来考虑
		File file = new File("D:\\javaTest\\hello.txt");
		try {
			file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		File file1 = new File("D:" + File.separator + "javaTest" + File.separator + "hello1.txt");
		try {
			file1.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
