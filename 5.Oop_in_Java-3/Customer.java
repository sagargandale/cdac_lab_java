public class Customer
{
    //data member
    String emailId;
    Address address;

    //default constructer
    public Customer(){}

    //parameterised constructer
    public Customer(String emailId,String area,String city,String pincode)
    {
        this.emailId=emailId;
        address=new Address(area,city,pincode);
    }
    //copy constructer
    public Customer(Customer tempObj)
    {
        this.emailId=tempObj.emailId;
        address=new Address(tempObj.address);
    }

    //method for displaying customer
    public void displayCustomer()
    {
        if(address!=null)
        {
            System.out.println("*****************************");

            System.out.println("Person Details :");
            System.out.println("\nEmail :"+emailId);
            address.displayAddress();



        }
        
    }
}