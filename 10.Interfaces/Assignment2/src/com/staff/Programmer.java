package com.staff;
import com.utility.*;

public class Programmer extends Emp implements ITraveller {
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
		salary=salary+extra_hours*charges_hours;
		return salary;
	}

	@Override
	public String toString() {
		return super.toString()+"\nProgrammer [extra_hours=" + extra_hours + ", charges_hours=" + charges_hours + ", Total Salary="
				+ salary + "]";
	}
	
	public double calculateTA()
	{
		return getSalary()*(da/100.0);
	}

}
