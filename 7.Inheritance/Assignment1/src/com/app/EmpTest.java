package com.app;
import com.utility.Person;
import com.staff.Emp;

public class EmpTest {
	public static void main(String[] args) {
		Emp e1=new Emp("sagar suresh gandale",01,01,2020,101,20000);
		e1.display();
		
		Person p1=new Person("suresh ganpat gandale",02,01,2020);
		p1.display();
	}
}
