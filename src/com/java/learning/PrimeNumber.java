package com.java.learning;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i;
		int m = 0;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to identigy prime");
		int n = sc.nextInt();
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println("Number is not prime");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println("Number is not prime");
					flag = 1;
					break;

				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		}

	}

}
