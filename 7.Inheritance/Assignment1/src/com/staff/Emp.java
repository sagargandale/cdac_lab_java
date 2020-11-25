package com.staff;


import com.utility.Person;

public class Emp extends Person {
	private int empid;
	private double salary;
	public Emp() {
		super();
	}
	
	
	public Emp(String name, int dd, int mm, int yy,int empid,double salary) {
		super(name, dd, mm, yy);
		// TODO Auto-generated constructor stub
		this.empid=empid;
		this.salary=salary;
	}
	
	public void display() {
		super.display();
		System.out.println("\nEmp Id:"+empid+"\nSalary:"+salary);
	}
	
	
	

}
