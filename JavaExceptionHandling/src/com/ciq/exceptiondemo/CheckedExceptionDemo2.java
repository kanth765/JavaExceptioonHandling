package com.ciq.exceptiondemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CheckedExceptionDemo2 {

	public static void main(String[] args) {
		String messages = "What is a Checked Exception in Java ? Checked exceptions are the ones that are checked during compilation time. If a code within a method throws a checked exception, then it should either be handled by a method or specify it using the throws keyword.";
//		String msg = null;
		File file = new File(" ");
		FileOutputStream fos = null;

		try {
//			fos = new FileOutputStream(file);
			byte[] bytes = messages.getBytes();
			fos.write(bytes);
			System.out.println("success");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("for cleanup activities");
				if (fos != null)
					System.out.println("for cleanup activities2");
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
