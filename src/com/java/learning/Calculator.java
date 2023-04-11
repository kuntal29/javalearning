package com.java.learning;

import java.util.Scanner;

public class Calculator {

	public int addition(int a, int b) {
		return  (a + b);
		 
	}

	public static int substraction(int a, int b) {
		int c = a - b;
		return c;
	}

	public static int multiply(int a, int b) {
		int c = a * b;
		return c;
	}

	public static int division(int a, int b) {
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Printer number 1");
		int a = sc.nextInt();
		System.out.println("Printer number 2");
		int b = sc.nextInt();
		Calculator obj = new Calculator();
		int sum = obj.addition(10, 20);
		System.out.println(sum);

	}

}
