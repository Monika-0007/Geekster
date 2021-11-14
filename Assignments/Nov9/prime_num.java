package geekster;

import java.util.Scanner;

public class prime_num////displays prime numbers till the specified range
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the range : (n1,n2)");
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0)
				{
					count++;
			    }
			}
			if(count==2)
			{
				System.out.println(i);		
		    }
		}
	}

}
