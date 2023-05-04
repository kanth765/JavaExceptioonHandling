package com.ciq.exceptiondemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFileDemo {
	static final String PATH = "D:\\New folder";

	public static void main(String[] args) throws IOException {
		File file = new File(PATH + "message.txt");
		FileInputStream fis=new FileInputStream(file);
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		

	}

}
