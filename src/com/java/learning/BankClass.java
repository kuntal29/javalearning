package com.java.learning;

import java.util.Scanner;

public class BankClass {

	private String name;
	private int acc_number;
	private float balance;

	public void getData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name");
		name = scanner.nextLine();
		System.out.println("Enter the A/C Number");
		acc_number = scanner.nextInt();
		balance = 500000;
	}
	
	private void deposit(float amt) {
		balance += amt;
	}
	
	private float calculateAmount(float principal, float rate, int time) {
		float SI = (principal * rate * time) / 100;
		float amount = principal + SI;
		return amount;
	}
	
	public void displayData() {
		System.out.println("Name " + name);
		System.out.println("A/c Number" + acc_number);
		System.out.println("Balance = " + balance);
	}

	public static void main(String[] args) {
		BankClass obj = new BankClass();
		obj.getData();
		obj.deposit(25000);
		float amount = obj.calculateAmount(10, 20, 5);
		System.out.println("The amount calculated " + amount);
		obj.displayData();

	}

}
