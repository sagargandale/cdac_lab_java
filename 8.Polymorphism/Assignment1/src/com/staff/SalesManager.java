package com.staff;

public class SalesManager extends Emp {
	private double target,incentive;
	
	public SalesManager() {
		super();
	}
	
	public SalesManager(String name,int dd,int mm,int yy,int empid,double salary,double target,double incentive) {
		super(name,dd,mm,yy,empid,salary);
		this.target=target;
		this.incentive=incentive;
		
		
	}
	
	public double calsalary() {
		return super.calSalary()+(incentive/100)*target;
		
	}

	@Override
	public String toString() {
		return super.toString()+"\nSalesManager [target=" + target + ", incentive=" + incentive + ", Total Salary=" + calsalary() + "]";
	}

	
	
	

}
