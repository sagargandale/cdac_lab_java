package com.util;

public class Ebook extends Book {
	private double discount;

	public Ebook() {
		super();
	}

	public Ebook(Book tempObj) {
		super(tempObj);
		// TODO Auto-generated constructor stub
	}

	public Ebook(String title, double price) {
		super(title, price);
		// TODO Auto-generated constructor stub
		if(price<=500)
			discount=2/100.0;
		else if(price>500 && price <=1000)
			discount=5/100.0;
		else
			discount=7/100.0;
	}
	
	public double calculateCost() {
		return super.calculateCost()-discount*super.calculateCost();
	}

	@Override
	public String toString() {
		return super.toString()+"\nEbook [discount=" + discount + ", Final Cost=" + calculateCost() + "]";
	}
	
	
	
	
	

}
