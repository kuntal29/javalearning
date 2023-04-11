package com.java.learning;

public class MethodOvereide2 extends MethodOverride {
	
	void run() {
		System.out.println("Methodoveride child class");
	}


	public static void main(String[] args) {
		MethodOvereide2 obj = new MethodOvereide2();
		obj.run();
	}

}
