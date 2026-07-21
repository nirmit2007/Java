package Encapsulation2;

public class StudentTestApp1
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.setRno(1);
        s1.setName("Ganesh");
        s1.setStd(12);
        s1.setMarks(100);

        System.out.println("Roll No : " + s1.getRno());
        System.out.println("Name    : " + s1.getName());
        System.out.println("Std     : " + s1.getStd());
        System.out.println("Marks   : " + s1.getMarks());
    }
}
