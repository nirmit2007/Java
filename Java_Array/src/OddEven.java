import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        int a[] = new int[10];
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++)
        {
            System.out.println("Enter a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        for(int i=0;i<10;i++)
        {
            if(a[i]%2==0)
            {
                sum = sum + a[i];
            }else
            {
                System.out.println("a["+i+"] : " + a[i]);
            }
        }
        System.out.println("Sum = " + sum);
    }
}
