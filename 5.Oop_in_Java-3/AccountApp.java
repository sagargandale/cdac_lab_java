public class AccountApp
{
    public static void main(String [] args)
    {
        Account a1=new Account();
        a1.displayAccount();

        Account a2=new Account(101,2000.23,"sagar gandale");
        a2.displayAccount();
        a2.calculateBalance();
        a2.displayAccount();

        Account.updateIntRate(9.0);
        a2.calculateBalance();
        a2.displayAccount();

    }
}