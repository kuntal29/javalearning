package com.java.learning;

public class ExceltionHandlingClass2 {
	
	//Null pointer exception

	public static void main(String[] args) {
		String s = null;
		
		try {
			System.out.println(s.length());
		}
		catch (ArithmeticException e) {
			System.out.println("Arith exception" + e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index bound " + e);
		}
		catch (NullPointerException e) {
			System.out.println("Null pointer " +  e);
		}
		catch (Exception e) {
			System.out.println("PAraent expccetion " +  e);
		}
		System.out.println("final code");

	}

}
