package com.util;

public class Point
{
    //data member
    private double x,y;
    //default constructor
    public Point()
    {
        x=0;
        y=0;
    }
    //Parameterized constructor 
    public Point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    //copy constructor
    public Point(Point tempPoint)
    {
        x=tempPoint.x;
        y=tempPoint.y;
    }
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	

    

}