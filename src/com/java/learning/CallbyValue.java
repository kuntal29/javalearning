package com.java.learning;

class CallbyValue {

	int data = 50;
	int x = 50;

	void change(int data) {
		data = data + 100; // Local varibale , hence it will not be changed
	}

	void change(CallbyValue op) {
		op.x = op.x + 100;// changes will be in the instance variable
	}

	public static void main(String[] args) {
		CallbyValue test = new CallbyValue();
		CallbyValue op = new CallbyValue();
		System.out.println("Before change " + test.data);
		test.change(100);
		System.out.println("After change " + test.data);
		System.out.println(" by creating call by value referrence " + op.x);
		op.change(op);
		System.out.println("After change- call by value " + op.x);

	}

}
