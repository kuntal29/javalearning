package com.java.learning;

public class EMP {
	
	int id;
	String name;
	Address address;
	
	public EMP(int id, String name, Address address) {
		this.id = id;
		this.name= name;
		this.address = address;
	}
	
	void display() {
		System.out.println(id+" "+name);  
		System.out.println(address.city + address.country + address.state);
	}

	public static void main(String[] args) {
		Address address1 = new Address("Delhi", "M.P", "Indore");
		Address address2 = new Address("Delhi", "M.P", "Indore");
		EMP obj = new EMP(12345, "kuntal", address1);
		EMP obj2 = new EMP(12345, "kuntal", address2);
		obj.display();
		obj2.display();

	}

}
