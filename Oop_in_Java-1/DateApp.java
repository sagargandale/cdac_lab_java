//App for creating and displaying date
public class DateApp {
    public static void main(String []args)
    {
        Date d1=new Date();//creating object with default constructer
        d1.showDate();

        Date d2;
        d2=new Date(01,01,2020);//object create parametrised constructer
        d2.showDate();

        Date d3;//object create copy constructr
        d3=new Date(d2);
        d3.showDate();

    }
}
