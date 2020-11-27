package com.app;


import com.shapes.*;
public class DrawShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDrawable [] shape= new IDrawable[3];
		shape[0]=new Circle(10);
		shape[1]=new Rectangle(41,6.5);
		shape[2]=new Triangle(4,5.6);
		for (int i = 0; i < shape.length; i++) {
			shape[i].drawShape();
			System.out.println(shape[i].calculateArea());
		}

	}

}
