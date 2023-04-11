package com.java.learning;

abstract // Abstract class with non abstract method and abstract method
class AbstractBike {

	AbstractBike() {
		System.out.println(" non abstract constructor in abstract class");
	}

	abstract void run();

	void gearChange() {
		System.out.println("Gear changed - non abstract method");
	}

}
