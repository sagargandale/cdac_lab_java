public class DateApp
{
    public static void main(String[]args)
    {
        Date d1=new Date(2,11,2020);
        d1.showDate('-');

        Date d2=new Date(3,05,1996);
        if(d2.equals(d1))
        {
            System.out.println("Dates are equal");
        }
        else
        {
            System.out.println("Dates are not equal");
        }
    }
}