package com.java.learning;

abstract class AbstractClass {
	public abstract void eats();

}

class Dog extends AbstractClass {

	public void eats() {
		System.out.println("Dog eats meat");
	}

	class Cats extends AbstractClass {
		public void eats() {
			System.out.println("Cat eats meat");
		}
	}

	public static class Abstractdemo {
		public static void main(String args[]) {
			Dog obj = new Dog();
			Cats obj1 = new Cats();
			obj.eats();
			obj1.eats();

		}
	}
}