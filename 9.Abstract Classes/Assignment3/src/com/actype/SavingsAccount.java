package com.actype;

public class SavingsAccount extends Account 
{
	private static float int_rate;
	
	static
	{
		int_rate = 4.5f;
	}

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int accno, String name, double balance) {
		super(accno, name, balance);
		
	}
	
	public void display()
	{
		super.display();
		System.out.println("Balance with interest : "+calBalance());
	}
		
	@Override
	public String toString() {
		return super.toString()+"\nBalance with interest : "+calBalance();
	}

	@Override
	public void withdraw(double amt)
	{
		if(amt < (balance - 1000))
		{
			super.updateBalance(balance - amt);
			System.out.println("Amt is successfully withdrawn");
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	
	public double calBalance()
	{
		double bal = balance + balance*int_rate/100;
		this.updateBalance(bal);
		return bal;
	}
	
}
