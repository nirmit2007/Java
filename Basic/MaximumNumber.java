import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1,n2,n3;
		
		System.out.println("Enter No1 : ");
		n1 = sc.nextInt();
		
		System.out.println("Enter No2 : ");
		n2 = sc.nextInt();
		
		System.out.println("Enter No3 : ");
		n3 = sc.nextInt();
		
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println("Max = " + n1);
			}else
			{
				System.out.println("Max = " + n3);
			}
		}else
		{
			if(n2>n3)
			{
				System.out.println("Max = " + n2);
			}else
			{
				System.out.println("Max = " + n3);
			}
		}
    }
}
