public class PersonApp
{
    public static void main(String [] args)
    {
       
        Date d1=new Date(1,1,2020);
        Person p1=new Person("sagar",d1);
        p1.display();

        Person p2=new Person("akshay",d1);
        p2.display();

        Person p3=new Person(p2);
        p2.display();
        Person.noOfObjectsCreated();
    }
}