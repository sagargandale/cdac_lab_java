package com.shapes;
import com.shapes.*;

public class Circle implements IDrawable {

	private double radius;
	
	
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public void drawShape()
	{
		System.out.println("\nCircle drawn\n");
	}
	
	public double calculateArea()
	{
		return pi*radius*radius;
	}
}
