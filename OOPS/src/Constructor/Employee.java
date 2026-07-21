public class Employee
{
    private int id;
    private String name;
    private double salary;
    private String dsgn;
    private String orgName;

    // 1. Default Constructor
    Employee()
    {
        System.out.println("===== DEFAULT Constructor =====");

        id = 0;
        name = "NULL";
        salary = 0;
        dsgn = "NULL";
        orgName = "NULL";
    }

    Employee(int id, String name)
    {
        this();

        System.out.println("===== TWO Parameter Constructor =====");

        this.id = id;
        this.name = name;
    }

    Employee(int id, String name, double salary)
    {
        this(id, name);

        System.out.println("===== THREE Parameter Constructor =====");

        this.salary = salary;
    }

    Employee(int id, String name, double salary, String dsgn)
    {
        this(id, name, salary);

        System.out.println("===== FOUR Parameter Constructor =====");

        this.dsgn = dsgn;
    }

    Employee(int id, String name, double salary, String dsgn, String orgName)
    {
        this(id, name, salary, dsgn);

        System.out.println("===== FIVE Parameter Constructor =====");

        this.orgName = orgName;
    }

    void display()
    {
        System.out.println("\nEmployee Details");
        System.out.println("-------------------------");
        System.out.println("ID       : " + id);
        System.out.println("Name     : " + name);
        System.out.println("Salary   : " + salary);
        System.out.println("Designation : " + dsgn);
        System.out.println("Organization: " + orgName);
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.display();

        System.out.println("\n---------------------------");

        Employee e2 = new Employee(101, "Nirmit");
        e2.display();

        System.out.println("\n---------------------------");

        Employee e3 = new Employee(102, "Rahul", 45000);
        e3.display();

        System.out.println("\n---------------------------");

        Employee e4 = new Employee(103, "Amit", 55000, "Developer");
        e4.display();

        System.out.println("\n---------------------------");

        Employee e5 = new Employee(104, "Priya", 70000, "Manager", "OpenAI");
        e5.display();
    }
}