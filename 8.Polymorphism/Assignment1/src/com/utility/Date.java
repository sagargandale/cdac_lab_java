package com.utility;
public class Date
{
    //data member
    private int dd,mm,yy;
    //Constructors
    //default constructor
    public Date()
    {
        dd=0;
        mm=0;
        yy=0;
    }
    //parameterized constructed
    public Date(int dd,int mm,int yy)
    {
        this.dd=dd;
        this.mm=mm;
        this.yy=yy;
    }
    //copy constructor
    public Date(Date d)
    {
        dd=d.dd;
        mm=d.mm;
        yy=d.yy;
    }
    //method for displaying date
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
   
}