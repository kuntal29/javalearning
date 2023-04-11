package com.java.learning;

public class ExceptionHandlingClass {

	public static void main(String[] args) {
		int i = 100;
		int j = 125;
		int k = 0;
		try {
			
			System.out.println(j / k);

		} catch (ArithmeticException e) {
			System.out.println(e);
			
		}
		
		System.out.println("code will continue");

		try {
			String s = null;
			System.out.println(s);
		} catch (NullPointerException e) {
			System.out.println(e);

		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Next statement continue");
		System.out.println(j / (j + 0));
	}

}
