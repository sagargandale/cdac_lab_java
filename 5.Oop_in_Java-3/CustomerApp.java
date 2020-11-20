public class CustomerApp
{
    public static void main(String[]args)
    {
        Customer c1=new Customer();
        c1.displayCustomer();

        Customer c2=new Customer("sgandale9850@gmail.com","wadgaon","pune","411041");
        c2.displayCustomer();

        Customer c3=new Customer(c2);
        c3.displayCustomer();
    }
}