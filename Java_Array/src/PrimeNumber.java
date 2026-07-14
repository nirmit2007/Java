import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int a[] = new int[10];
        int count = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter a["+i+"] : ");
            a[i] = sc.nextInt();
        }

        for(int i=0;i<a.length;i++)
        {
            count = 0;
            for(int j=1;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println("Prime Number : "+a[i]);
            }
        }

    }
}
