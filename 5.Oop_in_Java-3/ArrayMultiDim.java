public class ArrayMultiDim
{
    public static void main(String [] args)
    {
        //way 1
        int [][] array=new int[3][3];
        int [] rowSum=new int[3];
        int [] colSum=new int[3];

        

        //way 2
        int [][] array2=
        {
            {10,12,45},
            {15,96,85},
            {85,32,96}
    
            
        };
        array[0][0]=41;
        array[0][1]=21;
        array[0][2]=7;
        array[1][0]=26;
        array[1][1]=10;
        array[1][2]=13;
        array[2][0]=96;
        array[2][1]=66;
        array[2][2]=05;

        int i=0;
        int j=0;
        colSum[i]=0;
        System.out.println("Array :");
        for( i=0;i<array2.length;i++)
        {
            rowSum[i]=0;
            for( j=0;j<array2.length;j++)
            {
                System.out.print(array2[i][j]);
                System.out.print(" ");
                rowSum[i]=rowSum[i]+array2[i][j];
                colSum[j]=colSum[j]+array2[i][j];


            }
                System.out.print("\n");

        }
        System.out.println("Row sum array :");

        for(i=0;i<rowSum.length;i++)
        {
            System.out.print(rowSum[i]+" ");
        }

        System.out.println("\nCol sum array :");

        for(i=0;i<rowSum.length;i++)
        {
            System.out.print(colSum[i]+" ");
        }
        


        
    }
}