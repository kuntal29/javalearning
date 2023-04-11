package com.java.learning;

public class MethodOverride3 extends BANK {

	// Test class to create objects and call the methods
	public static void main(String args[]) {
		SBI rateofSBI = new SBI();
		ICICI rateofICIC= new ICICI();
		System.out.println("SBI ROI : " + rateofSBI.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + rateofICIC.getRateOfInterest());
	}
}
