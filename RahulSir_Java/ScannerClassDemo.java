import java.util.Scanner;

public class ScannerClassDemo{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in); // scan variable through object 

        float n1,n2,ans;

        System.out.println("Enter No1 : ");
        n1 = s.nextFloat();

        System.out.println("Enter No2 : ");
        n2 = s.nextFloat();

        ans = n1 + n2;

        System.out.println("No1 : " + n1);
        System.out.println("No2 : " + n2);
        System.out.println("Ans : " + ans);
    }
}
