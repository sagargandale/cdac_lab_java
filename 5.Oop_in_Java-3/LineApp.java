public class LineApp
{
    public static void main(String[]args)
    {
        // Line l1=new Line();
        // l1.displayLine();

        Line l2=new Line(1.0,1.0,4.0,4.0);
        l2.displayLine();
        double lenghtLine=l2.calLineLenght();
        System.out.println("\nLenght Of Line : "+lenghtLine);



    }
}