import java.util.Scanner;

public class RowColSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int rsum=0,csum=0;

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.println("Enter a["+i+"]["+j+"] : ");
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.println(a[i][j]);
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                rsum += a[i][j];
            }
        }

        for(int j=0;j<a.length;j++)
        {
            for(int i=0;i<a.length;i++)
            {
                csum += a[i][j];
            }
        }
        System.out.println("Row Sum : " + rsum);
        System.out.println("Row Sum : " + csum);
    }
}
