package com.java.learning;

public class AreaOfCircle {

	public static void main(String[] args) {
		double Area = areaOfCircle(20.20);
		double pi = 3.14;
		System.out.println("Area of cirlce " + Area * pi);

	}
	public static double areaOfCircle(double r) {
		return (r * r);

	}


}
