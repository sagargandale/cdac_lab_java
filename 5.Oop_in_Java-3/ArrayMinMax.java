public class ArrayMinMax
{
    public static void main(String[]args)
    {
        int [] array;//way 2 int [] array={15,45,7,96,74};
        array=new int[5];
        array[0]=15;
        array[1]=45;
        array[2]=7; //way 1 For initilising array
        array[3]=96;
        array[4]=74;

        int min=array[0],max=array[0],average=0;

        for(int i=0;i<array.length;i++)
        {
            average=average+array[i];
            if(array[i]<min)
            {
                min=array[i];
            }
            if(array[i]>max)
            {
                max=array[i];
            }
            
        }

        System.out.print("Array : ");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.print("\nMin : "+min);
        System.out.print("\nMax : "+max);



    }
}