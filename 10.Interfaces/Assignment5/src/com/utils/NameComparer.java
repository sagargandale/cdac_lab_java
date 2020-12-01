package com.utils;

public class NameComparer {
	public boolean compare(Student temp1,Student temp2)
	{
		
		String s1=temp1.getName();
		String s2=temp2.getName();
		if(s1.compareTo(s2)>0) //if s2 is lexically first
			return true;
		else if(s1.compareTo(s2)==0)
			return false;
		else
			return false;
			
	}

}
