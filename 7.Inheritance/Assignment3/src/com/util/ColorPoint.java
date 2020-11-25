package com.util;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint() {
		super();
		// TODO Auto-generated constructor stub
		this.color="white";
	}

	public ColorPoint(double x, double y,String color) {
		super(x, y);
		// TODO Auto-generated constructor stub
		String [] tempColor= {"blue","yellow","red","purple","grey"};
		for(int i=0;i<tempColor.length;i++) {
			if(tempColor[i].equals(color)) {
				this.color=color;
			}
			
			
		}
		if(this.color==null)
		{
			this.color="white";
		}
		
	}
	
	



	public String toString() {
		return super.toString()+"\n"+color;
	}
	
	
	
	
	
}
