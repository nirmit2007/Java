import java.util.Scanner;

public class IdentityMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int i,j;
        boolean identity = true;

        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
                System.out.print("Enter a["+i+"]["+j+"] : ");
                a[i][j] = sc.nextInt();
            }
        }

        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
                if(i == j)
                {
                    if(a[i][j] != 1)
                    {
                        identity = false;
                    }
                }
                else
                {
                    if(a[i][j] != 0)
                    {
                        identity = false;
                    }
                }

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        if(identity)
        {
            System.out.println("It is Identity Matrix");
        }
        else
        {
            System.out.println("It is Not Identity Matrix");
        }
    }
}
