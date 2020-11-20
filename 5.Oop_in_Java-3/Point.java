public class Point
{
    //data member
    private double x,y;
    //default constructer
    public Point()
    {
        x=0;
        y=0;
    }
    //parameterised constructer 
    public Point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    //copy constructer
    public Point(Point tempPoint)
    {
        x=tempPoint.x;
        y=tempPoint.y;
    }

    //method for displaying point
    void displayPoint()
    {
        System.out.print("["+x+","+y+"]");
    }
    //getter setter
    double getX()
    {
        return x;
    }
    double getY()
    {
        return y;
    }

}