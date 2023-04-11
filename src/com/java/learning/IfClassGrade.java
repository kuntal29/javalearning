package com.java.learning;

import java.util.Scanner;

public class IfClassGrade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		// int marks = 85;
		char grade;
		System.out.println("Enter Marks" + marks);
		if (marks >= 85 && marks <= 100) {
			System.out.println("Grade is B");
		} else if (marks >= 75 && marks <= 85) {
			System.out.println("Grade is B");
			// grade = B;
		}

		else if (marks >= 60 && marks <= 75) {
			System.out.println("Grade is C");

		} else {
			System.out.println("Grade is D");

		}
		int x = 20;
		int y = 10;
		if (x > y) {
			System.out.println("Bigger number");
		} else {
			System.out.println("Smaller number");
		}

	}

}
