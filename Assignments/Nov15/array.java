package classes;

import java.util.Scanner;

public class array {
    
	public static int addValue(int k[])
	{
		int s=0;
		int n=k.length;
		for(int i=0;i<n;i++)
		{
			s=s+k[i];
		}
		return s;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int n,i,sum;
        System.out.println("Enter the number of elements :");
		n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elements :");
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		sum=addValue(ar);
		System.out.println("Sum of array = "+sum);
	}
}
