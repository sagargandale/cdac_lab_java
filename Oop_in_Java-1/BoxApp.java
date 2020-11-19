//app for calculating volume of Box
public class BoxApp
{
    public static void main(String[]args)
    {
        double volume;
        Box b1=new Box();//default constructer
        volume=b1.calculateVolume();
        System.out.println("\nVolume of Box: "+volume);

        Box b2=new Box(12.02,10.03,8);//parameterised constructer
        volume=b2.calculateVolume();
        System.out.println("\nVolume of Box: "+volume);

        Box b3;
        b3=new Box(b2);//copy constructer
        volume=b3.calculateVolume();
        System.out.println("\nVolume of Box: "+volume);





    }
}