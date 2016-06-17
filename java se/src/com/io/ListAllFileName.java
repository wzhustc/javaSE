package com.io;

import java.io.File;

public class ListAllFileName {
	public static void main(String[] args) {
		String filePath = "d:" + File.separator;
		File file = new File(filePath);
		String[] lists = file.list();
		
		//如果想打印数组的每个具体的名字，就用lists[i]，如果你用lists的话，输出的是lists的hashCode值
		for (int i = 0; i < lists.length; i++) {
			System.out.println(lists[i]);
		}
		
		System.out.println("----------------------------");
		//下面是列出详细的文件夹信息
		File[] file1 = file.listFiles();
		for (int i = 0; i < file1.length; i++) {
			System.out.println(file1[i]);
		}
		
	}
}
