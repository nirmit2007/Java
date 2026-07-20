package Constructor;

public class CopyConst
{
    private int rno;
    private String name;
    private int std;
    private int marks;

    CopyConst(int rno , String name , int std , int marks)
    {
        this.rno = rno;
        this.name = name;
        this.std = std;
        this.marks = marks;
    }

    CopyConst(CopyConst c)
    {
        System.out.println("---- Start Copy Const ---- ");
        System.out.println(this.rno+" "+this.name+" "+this.std+" "+this.marks);
        this.rno = c.rno;
        this.name = c.name;
        this.std = c.std;
        this.marks = c.marks;
        System.out.println("---- End Copy Const ---- ");
        System.out.println(this.rno+" "+this.name+" "+this.std+" "+this.marks);
    }

    void display()
    {
        System.out.println(rno + " " + name + " " + std + " " + marks+" "+this);
    }

    public static void main(String[] args)
    {
        CopyConst c1 = new CopyConst(1,"Nirmit",12,100);
        CopyConst c2 = new CopyConst(c1);
        c1.display();
        c2.display();
    }
}
