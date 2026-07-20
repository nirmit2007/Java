import java.util.Scanner;

public class StudentDemo1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Student obj = new Student();
        Student obj1 = new Student();
        Student obj2 = new Student();
        // obj --> Reference Variable
        // new - JVM --> Create Object
        // Student --> Type Create Object

        System.out.println("Obj : "+obj);

        System.out.println("Enter Roll No 1 : ");
        obj.rno = sc.nextInt();
        sc.nextLine();          // Consume leftover newline
        System.out.println("Enter Name S1 : ");
        obj.name = sc.nextLine();
        System.out.println("Enter Std S1 : ");
        obj.std = sc.nextInt();
        System.out.println("Enter Marks S1 : ");
        obj.marks = sc.nextInt();

        System.out.println("Obj1 : "+obj1);

        System.out.println("Enter Roll No S2: ");
        obj1.rno = sc.nextInt();
        sc.nextLine();          // Consume leftover newline
        System.out.println("Enter Name S2 : ");
        obj1.name = sc.nextLine();
        System.out.println("Enter Std S2 : ");
        obj1.std = sc.nextInt();
        System.out.println("Enter Marks S2 : ");
        obj1.marks = sc.nextInt();

        System.out.println("Obj2 : "+obj2);

        System.out.println("Enter Roll No S3 : ");
        obj2.rno = sc.nextInt();
        sc.nextLine();          // Consume leftover newline
        System.out.println("Enter Name S3 : ");
        obj2.name = sc.nextLine();
        System.out.println("Enter Std S3 : ");
        obj2.std = sc.nextInt();
        System.out.println("Enter Marks S3: ");
        obj2.marks = sc.nextInt();

        System.out.println("Student 1 Information : ");
        System.out.println("Name    : " +obj.name);
        System.out.println("Std     : " +obj.std);
        System.out.println("Roll No : " +obj.rno);
        System.out.println("Marks   : " +obj.marks);

        System.out.println("\nStudent 2 Information : ");
        System.out.println("Name    : " +obj1.name);
        System.out.println("Std     : " +obj1.std);
        System.out.println("Roll No : " +obj1.rno);
        System.out.println("Marks   : " +obj1.marks);

        System.out.println("\nStudent 3 Information : ");
        System.out.println("Name    : " +obj2.name);
        System.out.println("Std     : " +obj2.std);
        System.out.println("Roll No : " +obj2.rno);
        System.out.println("Marks   : " +obj2.marks);
    }
}
