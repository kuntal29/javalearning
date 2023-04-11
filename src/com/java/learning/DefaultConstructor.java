package com.java.learning;

public class DefaultConstructor {
	
	private String name;
	private int ac_number;
	private float balance;
	//default constructor
	public DefaultConstructor() {
		name = null;
		ac_number = 00000;
		balance = 0;
	}
	 /* Parameterized constructor 1 with an extra variable to avoid confusion between the two parameterized constructors */
    public DefaultConstructor(String n, int acc, float b, float amt) { 
    	 name = n;
         ac_number = acc;
         balance = b;
     }
     
     // Parameterized constructor 2 using this keyword
     public DefaultConstructor(String name, int account_no, float balance) {
         this.name = name;
         this.ac_number = account_no;
         this.balance = balance;
     }
     // Copy constructor
     public DefaultConstructor(DefaultConstructor B) {
         name = B.name;
         ac_number = B.ac_number;
         balance = B.balance;
     }
     private void deposit(float amt) {
         balance += amt; //balance = balance + amt
     }
     private float calculateAmount(float principal, float rate, int time) {
         float simpleInterest = (principal * rate * time) / 100;
         float amount = principal + simpleInterest;
         return amount;
     }
     public void displayData() {
         System.out.println("Name: " + name);
         System.out.println("Account number: " + ac_number);
         System.out.println("Balance: " + balance);
     }
     public static void main (String args[]) {
    	 DefaultConstructor obj1 = new DefaultConstructor();
    	 DefaultConstructor obj2 = new DefaultConstructor("Tom", 12345, 1000, 500);
    	 DefaultConstructor obj3 = new DefaultConstructor("Harry", 98765, 2000);
    	 DefaultConstructor obj4 = new DefaultConstructor(obj2);
         obj1.deposit(1500);
         float amount = obj1.calculateAmount(300, 4, 2);
         System.out.println("Amount calculated for Rs 300/- at a rate of 4.5% for 2 years is: " + amount);
         obj1.displayData();
         obj2.displayData();
         obj3.displayData();
         obj4.displayData();
     }
 }
