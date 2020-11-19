public class FactorialOfNumber
{
    public static void main(String []args)
    {
        int factorial,number=3;
        factorial=calculateFactorial(number);
        System.out.println("Factorial of "+number+":"+factorial);
    }
    static int calculateFactorial(int number)
    {
        int factorial=1;
        for(int i=1;i<=number;i++)
        {
            factorial=factorial*i;
        }
        return factorial;
    }
}