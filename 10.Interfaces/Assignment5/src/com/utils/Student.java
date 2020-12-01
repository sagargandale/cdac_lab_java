package com.utils;
public class Student
{
    
    private int rollNo=cnt++;
    private String name;
    private double merits;
    private static int cnt;
    static
    {
    	cnt=0;
    }
    

    
    public Student(){};

    
    public Student(String name,double merits)
    {
        
        this.name=name;
        this.merits=merits;
        
        
    }

    public String toString()
    {
    	return "\n********Student*********"+"\nRoll No :"+rollNo+"\nName :"+name+"\nMerits :"+merits;
    }


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMerits() {
		return merits;
	}


	public void setMerits(double merits) {
		this.merits = merits;
	}
    
    
   


}