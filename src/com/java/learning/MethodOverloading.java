package com.java.learning;

public class MethodOverloading {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static double add(int a, double b, double c) {
		return a+b+c;
	}
	
	public static void main(String args[]) {
		MethodOverloading obj = new MethodOverloading();
		int addition = obj.add(5, 10);
		int addition2 = obj.add(10, 20, 30);
		double addition3 = obj.add(10, 20, 30);
		System.out.println("Two number addition =" + addition + " " + "Three number addition = " + addition2 );
		System.out.println("double data type number addition =" + addition3 );
		System.out.println(MethodOverloading.add(10, 20));
		System.out.println(MethodOverloading.add(20, 20.20, 30));
	}

}
