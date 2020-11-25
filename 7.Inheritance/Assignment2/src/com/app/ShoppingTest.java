package com.app;
import java.util.Scanner;

import com.util.Customer;
import com.util.RegCustomer;

public class ShoppingTest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nAre you regular(R) or new customer (C)?");
		char choice=sc.next().charAt(0);
		System.out.println("\nEnter Shopping Cart value");
		Double price=sc.nextDouble();
		Customer c1=new Customer("sgandale9850@gmail.com", "sagar");
		RegCustomer rc1=new RegCustomer("iamregualar@gmail.com", "regular", 101);
		
		if (choice=='C') {
			c1.giveDiscount(price);
			
		}
		else
			rc1.giveDiscount(price);
		
		
		sc.close();
		
		
	}
	
	
}
