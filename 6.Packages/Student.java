package knowit.student;
public class Student
{
    //non static datamember
    private int rollNo;
    private String name;
    private int [] noOfSubjects;
    private int [] marks;

    //default constructer
    public Student(){};

    //parameterised constructer
    public Student(int rollNo,String name,int noOfSubjects,int [] marks)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.noOfSubjects=new int[noOfSubjects];
        for(int i=0;i<marks.length;i++)
        {
            this.noOfSubjects[i]=i;
        }
        this.marks=new int[marks.length];
        for(int i=0;i<marks.length;i++)
        {
            this.marks[i]=marks[i];
        }
    }

    //copy constructer
    public Student(Student tempObj)
    {
        this.rollNo=tempObj.rollNo;
        this.name=tempObj.name;
        this.noOfSubjects=new int[tempObj.noOfSubjects.length];
        for(int i=0;i<marks.length;i++)
        {
            this.noOfSubjects[i]=i;
        }
        this.marks=new int[tempObj.marks.length];

        for(int i=0;i<marks.length;i++)
        {
            this.marks[i]=marks[i];
        }
    }

    public void displayStudent()
    {
        double percentage=0;
        System.out.println("******************");
        System.out.println("Roll No : "+rollNo);
        System.out.println("Name : "+name);
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(noOfSubjects[i]);
            System.out.print(" ");

            System.out.print(marks[i]);
            System.out.print("\n");

            percentage=percentage+marks[i];


            
        }

        percentage=(percentage/(noOfSubjects.length*100))*100;
        System.out.println("Percentage : "+percentage);


    }


}