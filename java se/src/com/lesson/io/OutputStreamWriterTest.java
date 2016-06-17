package com.lesson.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {
	public static void main(String[] args) throws Exception {
		//写字符串到file.txt文件中
		FileOutputStream os = new FileOutputStream("file.txt");
		//使用OutputStreamWriter，将字节流转换为字符流
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("http://www.google.com");
		bw.write("\n");
		bw.write("http://www.ustc.edu.cn");
		
		bw.close();
		
		
		//从file.txt文件中读取字符
		
		FileInputStream fis = new FileInputStream("file.txt");
		
		InputStreamReader isr = new InputStreamReader(fis);
		
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine();
		//这段代码在开发中经常会用到
		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}
		br.close();
	}
}
