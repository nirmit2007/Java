import java.lang.classfile.attribute.SourceFileAttribute;
import java.util.Scanner;

public class MatrixSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[5][6];
        int i,j,sum = 0;

        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length-1;j++)
            {
                a[i][j] = sc.nextInt();
                sum += a[i][j];
            }
            a[i][a.length-1] = sum;
        }

        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
