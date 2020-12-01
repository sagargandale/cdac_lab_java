package com.app;


import com.utils.*;
import java.util.Scanner;


public class StudentCompareTest {
	public static void main(String[] args) {
		
		RollComparer rc=new RollComparer();
		MeritComparer mc=new MeritComparer();
		NameComparer nc=new NameComparer();
		
		Student [] student=new Student[5];
		student[0]=new Student("Baban",98.99);
		student[1]=new Student("Suresh",85.41);
		student[2]=new Student("Gandale",75.41);
		student[3]=new Student("Xavier",95.41);
		student[4]=new Student("Akash",35.41);
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("\nEnter your choice to sort by\n1.Sort by rollno\n2.Sort by Merit\n3.Sort by name");
		int choice=sc.nextInt();
		if(choice==1)
		{
			int n = student.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	            {
	            	if (rc.compare(student[j],student[j+1]) )
	    	                { 
	    	                	Student temp=student[j+1];
	    	                    student[j+1]=student[j];
	    	                    student[j]=temp;
	    	                    
	    	                } 
	            }
		}
		else if(choice==2)
		{
			int n = student.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	            {
	            	if (mc.compare(student[j],student[j+1]) )
	    	                { 
	    	                	Student temp=student[j+1];
	    	                    student[j+1]=student[j];
	    	                    student[j]=temp;
	    	                    
	    	                } 
	            }
	
		}
		else if(choice==3)
		{
			int n = student.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	            {
	            	if (nc.compare(student[j],student[j+1]) )
	    	                { 
	    	                	Student temp=student[j+1];
	    	                    student[j+1]=student[j];
	    	                    student[j]=temp;
	    	                    
	    	                } 
	            }
		}
		else
		{
			System.out.println("Enter correct choice");
		}
		 
	                
		
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i]);
		}
		
		sc.close();
	}
		
}
