package Constructor;

public class DefaultDemo
{
    private int rno;
    private String name;
    private int std;
    private int marks;

    DefaultDemo()  // Default Constructor (Same name as Class)
    {
        System.out.println("Before : "+rno+" "+name+" "+std+" "+marks);
        rno = 16;
        name = "Nirmit";
        std = 12;
        marks = 100;
        System.out.println("After : "+rno+" "+name+" "+std+" "+marks);
    }
    public static void main(String[] args)
    {
        DefaultDemo d1 = new DefaultDemo();
    }
}
