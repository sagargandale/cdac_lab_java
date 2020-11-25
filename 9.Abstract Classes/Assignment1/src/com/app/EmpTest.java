package com.app;
import com.utility.Person;
import com.staff.*;


public class EmpTest {
	public static void main(String[] args) {
		Emp [] employee=new Emp[3];
		employee[0]=new SalesManager("sagar",01,01,2020,100,10000,55000,2.3);
		employee[1]=new Programmer("chintuWhiteJr", 01, 01, 2020, 101, 0, 0, 0);
		employee[2]=new Admin("srininas",6,3,1989,103,100000,20000);
		
		for (int i = 0; i < employee.length; i++) {
			employee[i].calSalary();
			System.out.println(employee[i].toString());
			System.out.println("**************************************");
		}
	}
}
