import java.util.Scanner;

public class MatrixDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print("Enter element [" + i + "][" + j + "] : ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}