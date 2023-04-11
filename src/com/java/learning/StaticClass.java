package com.java.learning;

import java.awt.DisplayMode;

class StaticClass {

	String student;
	int rollNum;
	String college;

	// Creating constructor
	StaticClass(String stu, int rolnum, String clg) {
		student = stu;
		rollNum = rolnum;
		college = clg;
	}
	
	void display() {
		System.out.println("Student " + "=" + student + " Rolnumer " + "=" + rollNum + " College " + "=" + college);
	}
	
	int display(int i) {
		System.out.println(i);
		return i;
		
	}

	public static void main(String[] args) {
		StaticClass obj = new StaticClass("Raj", 123456, "VITS");
		StaticClass obj1 = new StaticClass("kunal", 5884, "JIT");
		obj.display();
		obj1.display();
		obj.display(20);
		obj1.display(90);
		

	}

}
