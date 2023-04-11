package com.java.learning;



public class InheritanceClass extends ClassEmployee {
	
	void display1() {
		System.out.println("For multiple inheritance");
	}

	public static void main(String args[]) {
		ClassEmployee obj = new ClassEmployee();
		obj.display();
		System.out.println("Salary" + obj.salary);
	}

}
