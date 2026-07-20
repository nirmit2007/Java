package Constructor;

public class ParaConst
{
    private int id;
    private String name;
    private int salary;

    ParaConst(int id , String name , int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;

        System.out.println(this.id+" "+this.name+" "+this.salary);
    }

    public static void main(String[] args)
    {
        ParaConst p1 = new ParaConst(100,"Nirmit",10000);
    }
}
