package com.java.learning;

public class NestedTryBlock {

	public static void main(String args[]) {
		// outer try block 1
		try {

			// Inner try block 2
			try {
				System.out.println("going to divide by 0");
				int i = 30;
				int j = i / 0;
			}
			// catch block of inner try block 2
			catch (ArithmeticException e) {
				System.out.println("Internal catch block" + e);
			}
			// nested try block
			try {
				int[] a = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Internal nested catch block" + e);
			}
			System.out.println("other statement");
		}
		// catch block of outer try block
		catch (Exception e) {
			System.out.println("Outer catch block of try" + e);
		}
		System.out.println("Last statmenet");

	}
}
