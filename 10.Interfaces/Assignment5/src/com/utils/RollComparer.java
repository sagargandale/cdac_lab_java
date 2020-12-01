package com.utils;

public class RollComparer implements IComparer {
	public boolean compare(Student temp1,Student temp2)
	{
		
		
		if(temp1.getRollNo() > temp2.getRollNo())
			return true;
		else
			return false;
			
	}

	
}
