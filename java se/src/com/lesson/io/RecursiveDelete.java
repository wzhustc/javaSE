package com.lesson.io;

import java.io.File;

public class RecursiveDelete {
	public static void main(String[] args) {
		File file = new File("c:/abc");
		delete(file);
	}

	public static void delete(File file) {
		if (file.isFile() || file.list().length == 0) {
			file.delete();
		} else {
			File[] files = file.listFiles();
			for (File fi : files) {
				delete(fi);
				fi.delete();
			}
		}
	}
}
