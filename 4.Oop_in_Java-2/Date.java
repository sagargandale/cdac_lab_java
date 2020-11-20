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
    //equals method for comparing object
    boolean equals(Date tempDate)
    {
        if(dd==tempDate.dd && mm==tempDate.mm && yy==tempDate.yy)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //method for displaying date
    void showDate(char ch)
    {
        System.out.println(dd+Character.toString(ch)+mm+Character.toString(ch)+yy);
    }
}