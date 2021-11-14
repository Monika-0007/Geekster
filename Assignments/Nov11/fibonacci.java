package geekster;
import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a=0,b=1,sum,num;
		System.out.println("Enter the number of sequence :");
		num=sc.nextInt();
		System.out.print("Fibonacci Series: "+a+","+b);
		for(int i=2;i<num;i++)
		{
			sum=a+b;
			System.out.print(","+sum);
			a=b;
			b=sum;
		}
		/*
		 * int i=2; while(i<num) { sum=a+b; System.out.print(","+sum); a=b; b=sum; i++;
		 * }
		 */
	}
	
}
