package com.util;

public class Customer {
	private String emailId,name;

	public Customer() {
		super();
	}

	public Customer(String emailId, String name) {
		super();
		this.emailId = emailId;
		this.name = name;
	}
	
	public void giveDiscount(double price) {
		
		
		System.out.println("\nEmail id:"+emailId+"\nName:"+name+"\nTotal:"+price);
	}

	@Override
	public String toString() {
		return "\nEmail id:"+emailId+"\nName:"+name;
	}
	
	
	
}
