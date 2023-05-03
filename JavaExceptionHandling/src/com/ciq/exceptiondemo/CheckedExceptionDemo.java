package com.ciq.exceptiondemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException {
		String messages = "What is a Checked Exception in Java ? Checked exceptions are the ones that are checked during compilation time. If a code within a method throws a checked exception, then it should either be handled by a method or specify it using the throws keyword.";
		String msg = null;
		File file = new File("");
		FileOutputStream fos = new FileOutputStream(file);
		byte[] bytes = messages.getBytes();
		fos.write(bytes);
		fos.close();

	}

}
