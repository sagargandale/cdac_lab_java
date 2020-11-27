package com.shapes;
import com.shapes.IDrawable;

public class Rectangle implements IDrawable {

	private double height,width;
	
	
	
	public Rectangle() {
		super();
	}

	public Rectangle(double height,double width) {
		super();
		this.height = height;
		this.width=width;
	}

	public void drawShape()
	{
		System.out.println("\nRectangle drawn\n");
	}
	
	public double calculateArea()
	{
		return height*height*width*width;
	}
}
