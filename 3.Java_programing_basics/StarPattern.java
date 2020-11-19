public class StarPattern
{
    public static void main(String []args)
    {
        for(int i=1;i<=5;i++)
        {
            int temp=5;
            for(int j=1;j<=i;j++,temp--)
            {
                System.out.print(temp);
            } 
            System.out.println();
        } 
        
    }
}