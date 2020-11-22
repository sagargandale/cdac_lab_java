public class StudentApp
{
    public static void main(String[]args)
    {
        int [] marks=new int[5];
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=(int)Math.round(Math.random()*((100-35)+1))+35;

        }
        Student s1=new Student(10,"sagar",5,marks);
        s1.displayStudent();
    }
}