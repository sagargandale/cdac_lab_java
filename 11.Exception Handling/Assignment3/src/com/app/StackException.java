package com.app;

import java.util.Scanner;

import com.utils.Stack;

public class StackException {
	public static void main(String[] args) {
		int choice,data;
		Stack s=new Stack(5);
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter data:");
					data=sc.nextInt();
					s.push(data);
					break;
				case 2:
					System.out.print("Popped element:");
					System.out.print(s.pop());
					break;
				case 3:
					System.out.println(s);
					break;
				case 4:
					
					break;
				default:
					System.out.println("Enter correct choice");
			}
			
		}while(choice!=4);
		
		
		sc.close();
	}
}
