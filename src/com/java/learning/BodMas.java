package com.java.learning;

import java.util.Scanner;

public class BodMas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a");
		int a = sc.nextInt();
		System.out.println("Enter number b");
		int b = sc.nextInt();
		int d = sum(a, b);
		System.out.println("Sum of A and B" + d);
		int x = sub(a, b);
		System.out.println("Sum of A and B" + x);
		int y = multiply(a, b);
		System.out.println("Sum of A and B" + y);
		int z = div(a, b);
		System.out.println("Sum of A and B" + z);

	}

	public static int sum(int a, int b) {
		return (a + b);

	}

	public static int sub(int a, int b) {
		return (a - b);
	}

	public static int multiply(int a, int b) {
		return (a * b);
	}

	public static int div(int a, int b) {
		return (a / b);
	}

}
