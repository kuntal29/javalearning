package com.java.learning;

public class ThisVariable {

	int id;
	String name;
	int fee;

	ThisVariable(int id, String name, int fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(id + " " + name + " " + fee);
	}

	public static void main(String args[]) {
		ThisVariable s1 = new ThisVariable(123, "raj", 5847);
		s1.display();

	}

}
