public class BookApp
{
    public static void main(String[]args)
    {
        Book b1=new Book();
        b1.displayBook();

        Book b2=new Book("Programing in Java",1200);
        b2.displayBook();

        Book b3=new Book(b2);
        b3.displayBook();
    }
}