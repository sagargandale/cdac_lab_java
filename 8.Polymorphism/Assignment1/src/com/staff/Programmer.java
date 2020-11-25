package com.staff;

public class Programmer extends Emp {
	private double extra_hours,charges_hours;
	
	public Programmer() {
		super();
	}
	
	public Programmer(String name,int dd,int mm,int yy,int empid,double salary,double extra_hours,double charges_hours) {
		super(name,dd,mm,yy,empid,salary);
		this.extra_hours=extra_hours;
		this.charges_hours=charges_hours;
	}
	
	public double calSalary() {
		return super.calSalary()+extra_hours*charges_hours;
	}

	@Override
	public String toString() {
		return super.toString()+"\nProgrammer [extra_hours=" + extra_hours + ", charges_hours=" + charges_hours + ", Total Salary="
				+ calSalary() + "]";
	}
	
	

}
