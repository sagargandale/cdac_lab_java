//app for displaying Point 
public class PointApp
{
    public static void main(String []args)
    {
        Point p1=new Point();//default constructer
        p1.displayPoint();

        Point p2=new Point(1.5,4.5);//parameterised constructer
        p2.displayPoint();

        Point p3=new Point(p2);//copy constructer
        p3.displayPoint();
        
    }
}