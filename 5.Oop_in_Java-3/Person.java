public class Person
{
    //non static datamember
    private String name;
    private Date birthDate;
    //static data member
    private static int noOfObjects;
    
    static
    {
        noOfObjects=0;
       
    }
    
    //default constructer
    public Person(){noOfObjects++;}

    //parameterised constructer
    public Person(String name,Date tempDate)
    {
        noOfObjects++;
        this.name=name;
        birthDate=new Date(tempDate);
        


    }

    //copy constructer
    public Person(Person tempObj)
    {
        noOfObjects++;
        this.name=tempObj.name;
        birthDate=new Date(tempObj.birthDate);
    }

    //display method
    void display()
    {
        
        System.out.println("********************");

        System.out.println("Person Details");
        System.out.println("Name : "+name);
        System.out.print("Date : ");
        birthDate.showDate('-');

    }
    public static void noOfObjectsCreated()
    {
        System.out.print("No of objects created :"+Person.noOfObjects);

    }

}