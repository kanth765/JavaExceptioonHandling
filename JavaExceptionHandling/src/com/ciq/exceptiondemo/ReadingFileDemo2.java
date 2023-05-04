package com.ciq.exceptiondemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFileDemo2 {
	static final String PATH = "D:\\New folder\\";

	public static void main(String[] args) {
		File file = new File(PATH + "message.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			System.out.println("success");
			fis.close();

		} catch (FileNotFoundException fe) {
//			fe.printStackTrace();
			System.err.println(fe.getMessage());
//			System.out.println(fe.getMessage());
//			System.out.println(fe.getCause());
//			System.out.println(fe.getStackTrace());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("cleanup resource...");
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
