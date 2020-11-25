package com.staff;


import com.utility.Person;

public abstract class Emp extends Person {
	private int empid;
	protected double salary;
	int x=55;
	public Emp() {
		super();
	}
	
	
	public Emp(String name, int dd, int mm, int yy,int empid,double salary) {
		super(name, dd, mm, yy);
		// TODO Auto-generated constructor stub
		this.empid=empid;
		this.salary=salary;
	}


	@Override
	public String toString() {
		return "Emp [empid=" + empid +"]\n"+super.toString();
	}
	
	public abstract double calSalary();
	
	
	
	
	

}
