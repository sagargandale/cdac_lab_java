package com.app;

import java.util.Scanner;

public class ArrayExceptionTest {
	public static void main(String[] args) {
		String [] names ;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the size of array :");
			
			int size=sc.nextInt();
			names=new String[size];
			System.out.println("Enter strings");
			for(int i=0;i<names.length;i++)
			{
				names[i]=sc.next();
			}
			System.out.println("Enter the index to string:");
			int index=sc.nextInt();
			System.out.print("String :");
			System.out.print(names[index-1]);
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
		
	}
}
