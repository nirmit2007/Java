package Encapsulation;

import java.util.Scanner;

/*
        Pure Encapsulation
            1.Data Members -> private
            2.Member Function -> public
 */
public class Employee
{
    private int id;
    private String name;
    private float salary;

    public void scanData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Salary : ");
        salary = sc.nextFloat();
    }
    public void displayData()
    {
        System.out.println(id + "\t" + name + "\t" + salary);
    }
}
