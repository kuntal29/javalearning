package com.java.learning;

public class TestFinallyBlock {

	public static void main(String[] args) {
		try {
			int i = 25 / 0;
			System.out.println(i);
		} catch (NullPointerException e) {
			System.out.println(e);
		} 
		catch (Exception e) {
			System.out.println("parent class exception " +  e);
		}
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("The final code and execution");
	}

}
