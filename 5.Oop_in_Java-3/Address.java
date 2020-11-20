public class Address
{
    //data member
    private String area,city,pincode;

    //default constructer
    public Address(){}

    //parameterised constructer
    public Address(String area,String city,String pincode)
    {
        this.area=area;
        this.city=city;
        this.pincode=pincode;
    }
    //copy constructer
    public Address(Address tempObj)
    {
        this.area=tempObj.area;
        this.pincode=tempObj.pincode;
        this.city=tempObj.city;
    }

    //method for displaying address
    void displayAddress()
    {
        System.out.println("Address : "+area+" "+city+" "+pincode);
    }
}