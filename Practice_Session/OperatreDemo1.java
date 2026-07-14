import java.util.Scanner;

public class OperatreDemo1 {
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter 3 numbers : ");

        int no1 = n.nextInt();
        int no2 = n.nextInt();
        int no3 = n.nextInt();

        int res = (no1 * no2 * no3) / 10;

        System.out.println("Answer  : " + res);

    }
}
