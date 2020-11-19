public class Box
{
    //data members for Box entity
    private double height,width,depth;
    //default constructer
    public Box()
    {
        height=width=depth=0.0;
    }
    //parameterised constructer
    public Box(double height,double width,double depth)
    {
       this.height=height;
       this.width=width;
       this.depth=depth;
    }
    //copy construter
    public Box(Box tempObject)
    {
        height=tempObject.height;
        width=tempObject.width;
        depth=tempObject.depth;
    }

    //method for calculate volume of Box
    double calculateVolume()
    {
        double volume;
        volume=height*width*depth;
        return volume;
    }
   

}