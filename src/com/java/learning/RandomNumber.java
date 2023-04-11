package com.java.learning;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		System.out.println("Random number is " + Math.random());
		Random rendom = new Random();
		int a = rendom.nextInt(10);
		System.out.println(a);
	}

}
