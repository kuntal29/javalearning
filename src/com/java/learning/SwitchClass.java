package com.java.learning;

import java.util.Scanner;

public class SwitchClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number");
		int num = sc.nextInt();
		switch(num) {
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("mmonday");
		break;
		case 3: System.out.println("tuesday");
		break;
		case 4: System.out.println("wednesday");
		break;
		case 5: System.out.println("thrusday");
		break;
		case 6: System.out.println("friday");
		break;
		default:System.out.println("Invalid choice");
		
		}

	}

}
