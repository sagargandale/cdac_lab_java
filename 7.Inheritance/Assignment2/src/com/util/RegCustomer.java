package com.util;

public class RegCustomer extends Customer {
	private int regNo;

	public RegCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegCustomer(String emailId, String name,int regNo) {
		super(emailId, name);
		// TODO Auto-generated constructor stub
		this.regNo=regNo;
	}

	public void giveDiscount(double price) {
		price=price-(5/100.0)*price;
		System.out.println("Reg No:"+regNo);
		System.out.println(super.toString());
		System.out.println("\nTotal:"+price);
	}

	@Override
	public String toString() {
		return super.toString()+"\nregNo=" + regNo;
	}
	
	

}
