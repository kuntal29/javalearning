package com.java.learning;

public class JumpClassContinue {

	public static void display() {
		try {
			for (int j = 0; j <= 10; j++) {
				System.out.println(j);
				if (j == 5) {
					break;
				}
			}
		}
		catch (ArithmeticException e) {
			System.out.println("some execption occurred");
		}
	}

	public static void main(String[] args) {
		int x = 0;
		for (x = 1; x <= 10; x++) {
			//if (x % 5 == 0)
			if (x == 0)
				continue;
			System.out.println(x);
		}
		display();

	}

}
