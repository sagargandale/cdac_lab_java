//App for checking whether number prime or not
public class PrimeNumChecker
{
    public static void main(String []args)
    {
        int num=11;
        boolean flag;
        
        flag=primeNumCheck(num);
        if(flag==true)
        {
            System.out.println(num+" is Prime Number");
        }
        else
        {
            System.out.println(num+" is Not Prime Number");

        }
    }
    static boolean primeNumCheck(int number)
    {
        boolean flag=true;
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                flag=false;
            }
        }
        return flag;
    }
}