public class Book
{
    //non static data member
    private int bookId;
    private String title;
    private double price;

    //static data member
    private static int cnt;

    //static block for initialsing static data member
    static
    {
        cnt=100;
    }
    //block for incrementing counter
    {
        bookId=cnt++;
    }


    //default constructer
    public Book(){}

    //parameterised constructer
    public Book(String title,double price)
    {
        this.title=title;
        this.price=price;
    }

    //copy constructer
    public Book(Book tempObj)
    {
        this.title=tempObj.title;
        this.price=tempObj.price;
    }

    //method for displaying book info
    public void displayBook()
    {
        if(title!=null)
        {
            System.out.println("*******************");
            System.out.println("Book Info : ");
            System.out.println("Id : "+bookId);
            System.out.println("Title : "+title);
            System.out.println("Price : "+price);
        }
        



    }

}