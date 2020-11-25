package com.app;
import com.util.ColorPoint;
import java.util.Scanner;

public class ColorPointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the point :\nEnter x-coordinate:");
		double x=sc.nextDouble();
		System.out.println("\nEnter y-coordinate:");
		double y=sc.nextDouble();
		System.out.println("\nEnter the color:");
		String color=sc.next();
		ColorPoint p1=new ColorPoint(x, y, color);
		System.out.println(p1);
		
	
		sc.close();
		
		
	}

}
