package com.io;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		//下面的javaTest1是文件夹名，要求在和其相同目录下不能有相同的名字，否则创建时失败的
		String filePath = "d:" + File.separator + "javaTest" + File.separator +
				"subJavaTest";
		File file = new File(filePath);
		boolean boo = file.mkdir();
		System.out.println("directory create success, true or false? ");
		System.out.println(boo);
	}
}
