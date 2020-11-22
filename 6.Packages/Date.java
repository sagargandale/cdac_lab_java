package knowit.utility;
public class Date
{
    //data member
    private int dd,mm,yy;
    //constructers
    //default constructer
    public Date()
    {
        dd=0;
        mm=0;
        yy=0;
    }
    //parameterized constructer
    public Date(int dd,int mm,int yy)
    {
        this.dd=dd;
        this.mm=mm;
        this.yy=yy;
    }
    //copy constructer
    public Date(Date d)
    {
        dd=d.dd;
        mm=d.mm;
        yy=d.yy;
    }
    //method for displaying date
    public void showDate()
    {
        System.out.println(dd+"/"+mm+"/"+yy);
    }
}