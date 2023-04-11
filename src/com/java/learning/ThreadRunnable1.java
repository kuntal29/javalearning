package com.java.learning;

public class ThreadRunnable1 implements Runnable {

	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String args[]) {
		
		ThreadRunnable1 t1 = new ThreadRunnable1();
		Thread t2 = new Thread(t1);
		t2.start();
		

	}

}
