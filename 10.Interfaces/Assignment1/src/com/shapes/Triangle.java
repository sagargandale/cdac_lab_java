package com.shapes;
import com.shapes.IDrawable;

public class Triangle implements IDrawable {

	private double height,base;
	
	
	
	public Triangle() {
		super();
	}

	public Triangle(double height,double base) {
		super();
		this.height = height;
		this.base=base;
	}

	public void drawShape()
	{
		System.out.println("\nTriangle drawn\n");
	}
	
	public double calculateArea()
	{
		return (1/2.0)*height*base;
	}
}
