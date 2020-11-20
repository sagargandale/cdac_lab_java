public class Line
{
    //data member 
    private Point startPoint;
    private Point endPoint;

    //default constructer
    public Line(){};
    
    //parametersied constructer
    public Line(double x1,double y1,double x2,double y2)
    {
        startPoint=new Point(x1,y1);
        endPoint=new Point(x2,y2);

    }
    //copy constructer
    public Line(Line tempObj)
    {
        startPoint=new Point(tempObj.startPoint);
        endPoint=new Point(tempObj.endPoint);
    }

    //display line method
    void displayLine()
    {
       
            System.out.print("Line :");
            startPoint.displayPoint();
            System.out.print(" , ");
            endPoint.displayPoint();
        
        
    }
    //method for calculating line lenght
    double calLineLenght()
    {
        Double lenght;
        lenght=Math.sqrt((endPoint.getY()-startPoint.getY())*(endPoint.getY()-startPoint.getY())+(endPoint.getX()-startPoint.getX())*(endPoint.getX()-startPoint.getX()));
        return lenght;
    }


}