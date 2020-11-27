package com.mywrapper;
import com.util.*;
public class MyNumber implements IIntOperations {
	private int number;
	
	public MyNumber() {
		super();
	}

	public MyNumber(int number) {
		super();
		this.number = number;
	}
	
	public boolean isEven(int num)
	{
		if(num%2==0)
			return true;
		else
			return false;
	}
	public boolean isOdd(int num)
	{
		if(num%2==0)
			return false;
		else
			return true;
	}
	public boolean isPrime(int num)
	{
		boolean checkPrime=false;
		for (int i = 2; i <= num/2; i++) {
			if (num%i==0) {
				checkPrime=false;
			}
			else {
				checkPrime=true;
			}
		}
		return checkPrime;
	}
	public double calFactorial(int num)
	{
		int fact=1;
		for (int i = 1; i <= num; i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public String toString()
	{
		return ""+number;
	}
	

}
