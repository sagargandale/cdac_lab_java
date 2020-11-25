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


	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", salary=" + salary + "]"+"\n"+super.toString();
	}
	
	public double calSalary()
	{
		return salary;
	}
	
	
	
	
	

}
