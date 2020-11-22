import knowit.utility.Date;
import knowit.student.Student;
public class PackageTask1
{
    public static void main(String [] args)
    {
        int [] marks={14,45,78,63,52};
        Student s=new Student(02,"sagar",5,marks);
        s.displayStudent();
        Date d=new Date(01,01,2020);
        d.showDate();
    }
}