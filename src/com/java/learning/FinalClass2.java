package com.java.learning;

public class FinalClass2 extends FinalClass {

	void run() {
		System.out.println("The speed in child class is 60kmph");
	}

	public static void main(String[] args) {
		FinalClass2 obj = new FinalClass2();
		FinalClass obj2 = new FinalClass();
		obj.run();
		obj2.run();

	}

}
