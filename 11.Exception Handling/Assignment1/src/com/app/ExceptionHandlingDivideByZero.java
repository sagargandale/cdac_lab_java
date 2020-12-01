package com.app;

public class ExceptionHandlingDivideByZero {
	public static void main(String[] args) {
		
			try
			{
				int number1=Integer.parseInt(args[0]),number2=Integer.parseInt(args[1]);
				if(args.length==1 || args.length>2)
					throw new Exception("Insufficient arguments");
				System.out.println("Division:"+divide(number1,number2));
				
					

			}
			catch(Exception e)
			{
				String [] ok= {"2","3"};
				main(ok);
				e.printStackTrace();
			}
			
		
		
	}
	public static double divide(int number1,int number2)
	{
		return number1/number2;
	}
}
