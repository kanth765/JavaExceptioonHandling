package com.ciq.exceptiondemo;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		System.out.println("statement1");
		System.out.println("statement2");
//		try {
//		System.out.println(10/0);
//		}catch(ArithmeticException ae) {
//			System.out.println("please provide aleternate number, zero can't divided by any number ");
//		}
		try {
		String s1="abc";
		System.out.println(Integer.parseInt(s1));
		}catch(NumberFormatException ne) {
			System.out.println(" A string can't convert into a number");
		}
		
		System.out.println("statement4");
		System.out.println("statement5");
		System.out.println("statement6");
	}

}
