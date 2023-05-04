package com.ciq.exceptiondemo;

import java.io.File;

public class FileDemo {
	static final String PATH = "D:\\createiq_meterials\\create IQ\\Hibernate";

	public static void main(String[] args) {

		File file = new File(PATH);
		String[] listOfFiles = file.list();
		for (String fileName : listOfFiles) {
			System.out.println(fileName);
		}
	}

}
