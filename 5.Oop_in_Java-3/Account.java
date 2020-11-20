public class Account
{
    //data member
    private int accNo;
    private double accBalance;
    private String accHoldName;

    static double int_rate;

    static
    {
        int_rate=7.8;
    }

    //default constructer
    public Account(){}

    //paramertrised constructer
    public Account(int accNo,double accBalance,String accHoldName)
    {
        this.accNo=accNo;
        this.accBalance=accBalance;
        this.accHoldName=accHoldName;
    }

    //copy constructer
    public Account(Account tempObj)
    {
        this.accNo=tempObj.accNo;
        this.accBalance=tempObj.accBalance;
        this.accHoldName=tempObj.accHoldName;
    }
    
    //method for displaying account info
    void displayAccount()
    {
        if(accHoldName!=null)
        {
            System.out.println("\n*********************");
            System.out.println("\nAccount Info:");
            System.out.println("\nName:"+accHoldName);
            System.out.println("\nAccount Number:"+accNo);
            System.out.println("\nBalance:"+accBalance);
        }
        
    }
    //method for calculating balance after adding interest rate
    public double calculateBalance()
    {
        accBalance=accBalance+(accBalance*int_rate/100);
        return accBalance;
    }

    public static void updateIntRate(double rate)
    {
        int_rate=rate;
    }

}