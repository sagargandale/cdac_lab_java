package com.util;

public class PaperBook extends Book {
	private double deliveryCharges;

	
	public PaperBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaperBook(Book tempObj) {
		super(tempObj);
		// TODO Auto-generated constructor stub
	}

	public PaperBook(String title, double price) {
		super(title, price);
		// TODO Auto-generated constructor stub
		if(price<=500)
			deliveryCharges=2/100.0;
		else if(price>500 && price <=1000)
			deliveryCharges=5/100.0;
		else
			deliveryCharges=7/100.0;
		
	}
	
	public double calculateCost() {
		return super.calculateCost()+deliveryCharges*super.calculateCost();
	}

	@Override
	public String toString() {
		return super.toString()+"\nPaperBook [deliveryCharges=" + deliveryCharges + ", Total Cost=" + calculateCost() + "]";
	}
	
	
	
}
