public class DivisorOfNumber
{
    public static void main(String []args)
    {
        int num=100;
        divisorOfNumber(num);
        

    }
    static void divisorOfNumber(int number)
    {
        int size=0;
        System.out.print("Divisor of "+number+" : ");
        for(int i=1;i<=number/2;i++)
        {
            if(number%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}