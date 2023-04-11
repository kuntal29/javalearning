package com.java.learning;

public class SUPERCLASS extends SUPER {

	String color = "Black";
	
	String color2 = "red";

	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	public SUPERCLASS(String color) {
		this.color = color;
		System.out.println(color);
		System.out.println(super.color2);
	}

	public static void main(String args[]) {
		SUPERCLASS obj = new SUPERCLASS("New colour");
		obj.printColor();
		

	}

}
