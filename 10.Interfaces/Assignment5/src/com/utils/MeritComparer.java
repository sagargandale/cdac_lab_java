package com.utils;

public class MeritComparer {
	public boolean compare(Student temp1,Student temp2)
	{
		
		
		if(temp1.getMerits() > temp2.getMerits())
			return true;
		else
			return false;
			
	}

}
