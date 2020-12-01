package com.app;
import java.util.Scanner;

import com.util.BubbleSort;
import com.util.Sorter;
import com.util.SelectionSort;

public class SortTest {
	public static void main(String[] args) {
		int [] arr= {4,6,8,2,7};
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your choice BubbleSort(B) or SelectionSort(S)?");
		char choice=scan.next().charAt(0);
		Sorter s1=null;
		int [] test = null;
		if(choice == 'B' )
		{
			s1=new BubbleSort();
			test=s1.sort(arr);
			displayArray(test);
			
		}
		else if(choice == 'S')
		{
			s1=new SelectionSort();
			test=s1.sort(arr);
			displayArray(test);
		}
		else
			System.out.println("Enter correct choice");
		
		
		
		scan.close();
	}
	public static void displayArray(int [] array)
	{
		for(int i:array)
		{
			System.out.print(i+" ");
		}
	}
	
}
