package Constructor;

public class ThisConst
{
    private int rno;
    private String name;
    private int std;
    private int marks;

    // Default Constructor
    public ThisConst()
    {
        System.out.println("===== START : DEFAULT Constructor =====");

        rno = 0;
        name = "NULL";
        std = 0;
        marks = 0;
    }

    // Two Parameter Constructor
    ThisConst(int rno, String name)
    {
        this();

        System.out.println("===== START : PARA-TWO Constructor =====");

        this.rno = rno;
        this.name = name;
    }

    // Three Parameter Constructor
    ThisConst(int rno, String name, int std)
    {
        this(rno, name);

        System.out.println("===== START : PARA-THREE Constructor =====");

        this.std = std;
    }

    // Four Parameter Constructor
    ThisConst(int rno, String name, int std, int marks)
    {
        this(rno, name, std);

        System.out.println("===== START : PARA-FOUR Constructor =====");

        this.marks = marks;
    }

    void display()
    {
        System.out.println("\n----- Student Details -----");
        System.out.println("Roll No : " + rno);
        System.out.println("Name    : " + name);
        System.out.println("Std     : " + std);
        System.out.println("Marks   : " + marks);
    }

    public static void main(String[] args)
    {
        ThisConst s1 = new ThisConst();
        s1.display();

        System.out.println("\n----------------------------");

        ThisConst s2 = new ThisConst(101, "Nirmit");
        s2.display();

        System.out.println("\n----------------------------");

        ThisConst s3 = new ThisConst(102, "Rahul", 12);
        s3.display();

        System.out.println("\n----------------------------");

        ThisConst s4 = new ThisConst(103, "Amit", 10, 95);
        s4.display();
    }
}
