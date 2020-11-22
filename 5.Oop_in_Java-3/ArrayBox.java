public class ArrayBox
{
    public static void main(String[]args)
    {
        Box [] boxArray=new Box[3];
        boxArray[0]=new Box(10,45,12);
        boxArray[1]=new Box(74,14,36);
        boxArray[2]=new Box(7,12,63);

        for(int i=0;i<boxArray.length;i++)
        {
            System.out.println(boxArray[i].calculateVolume());
        }


    }
}