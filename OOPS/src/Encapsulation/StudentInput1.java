package Encapsulation;

import java.util.Scanner;

public class StudentInput1
{
    int rno;
    String name;
    int std;
    int marks;

    void scanData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll No : ");
        rno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Std : ");
        std = sc.nextInt();
        System.out.println("Enter Marks : ");
        marks = sc.nextInt();
    }
    void displayData()
    {
        System.out.println(rno + "\t" + name + "\t" + std + "\t" + marks);
    }
}


