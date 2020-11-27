package com.staff;

public class Admin extends Emp {
	private double bonus;

	public Admin() {
		super();
	}

	public Admin(String name, int dd, int mm, int yy, int empid, double salary,double bonus) {
		super(name, dd, mm, yy, empid, salary);
		// TODO Auto-generated constructor stub
		this.bonus=bonus;
	}

	public double calSalary() {
		salary=salary+bonus;
		return salary;
	}

	@Override
	public String toString() {
		return super.toString()+"\nAdmin [bonus=" + bonus + ", Total Salary=" +salary + "]";
	}
	
	
	
	

}
