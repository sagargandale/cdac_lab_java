package com.utility;

public class Person {
	private String name;
	private Date birthDate;
	
	public Person() {
		super();
	}
	
	
	
	
	public Person(String name,int dd,int mm,int yy) {
		super();
		birthDate=new Date(dd,mm,yy);
		this.name = name;
	}




	public void display() {
		System.out.print("\nName:"+name+"\nBirth date:");
		birthDate.showDate();
	}
	
	
	
	
	
	
	
}
