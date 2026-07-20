import java.util.Scanner;

public class SpiralMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int i,j;

        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
                System.out.print("Enter a["+i+"]["+j+"] : ");
                a[i][j] = sc.nextInt();
            }
        }
        int top = 0;
        int bottom = a.length - 1;
        int left = 0;
        int right = a.length - 1;

        while(top <= bottom && left <= right)
        {
            for (j = left; j <= right; j++)
            {
                System.out.println(a[top][j] + "\t");
            }
            top++;
        }



    }
}
