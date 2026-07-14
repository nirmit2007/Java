import java.util.Scanner;

public class JaggedArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][];
        int i,j;
        a[0] = new int[2];
        a[1] = new int[3];
        a[2] = new int[4];

        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.println("Enter a["+i+"]["+j+"] : ");
                a[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
