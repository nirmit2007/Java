package Constructor;

public class OverloadingConst
{
    private int id;
    private String name;
    private int salary;

    //Default Constructor
    OverloadingConst()
    {
        id = 0;
        name = "Unknown";
        salary = 0;
    }

    //Parameterized Constructor
    OverloadingConst(int id , String name , int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //Single Parameter Constructor
    OverloadingConst(int id)
    {
        this.id = id;
        name = "Nirmit";
    }

    void display()
    {
        System.out.println("Id   : " + id);
        System.out.println("Name : " + name);
    }
    public static void main(String[] args)
    {
        OverloadingConst c1 = new OverloadingConst();
        OverloadingConst c2 = new OverloadingConst(100);
        OverloadingConst c3 = new OverloadingConst(100,"Ram",50000);

        c1.display();
        c2.display();
        c3.display();
    }
}
