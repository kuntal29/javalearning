package com.java.learning;

public class ExceptionClass {

	public static void main(String[] args) {
		int i = 20;
		int j = 0;
		try {
			int k = i / j;
			System.out.println(k);
		} catch (ArithmeticException e) {
			System.out.println("Zero can not be devided by number");
		}
		int n = 0;
		int A[] = { 1, 2, 3, 4, 5 };
		try {
			System.out.println("Element: " + A[6]);
			double quotient = 234 / n;
			System.out.println("Quotient: " + quotient);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero has occurred" + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of bound index has occurred" +  e);
		} catch (Exception e) {
			System.out.println("Some other exception has occurred" + e);
		}
		System.out.println("last statmenet executed");
	}

}
