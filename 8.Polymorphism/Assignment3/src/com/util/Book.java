package com.util;

public class Book
{
    //non static data member
    private int bookId;
    private String title;
    private double price;

    //static data member
    private static int cnt;

    //static block for initialing static data member
    static
    {
        cnt=100;
    }
    //block for incrementing counter
    {
        bookId=cnt++;
    }


    //default constructor
    public Book(){}

    //Parameterized constructor
    public Book(String title,double price)
    {
        this.title=title;
        this.price=price;
    }

    //copy constructor
    public Book(Book tempObj)
    {
        this.title=tempObj.title;
        this.price=tempObj.price;
    }

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + "]";
	}

    //method for displaying book info
   
	public double calculateCost() {
		return price;
	}


    

}
