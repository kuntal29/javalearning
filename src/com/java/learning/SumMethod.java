package com.java.learning;

public class SumMethod {

	public static void main(String[] args) {
		int s = sum(20, 20);
		System.out.println(s);
		double d = sum(20.20, 30.25);
		System.out.println(d);
		//SumMethod obj = new SumMethod();
		//obj.display(); // creating the object and calling the method
		display(); //calling the method using default construcutor

	}

	public static int sum(int a, int b) {
		return (a + b);

	}

	public static double sum(double a, double b) {
		return (a + b);
	}
	
	public static void display() {
		System.out.println("No retrun type method");
	}

}
