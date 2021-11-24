package arrays;

import java.util.Scanner;

public class diffofarrays {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.println("Enter the array size:");
		n=sc.nextInt();
		int ar1[] = new int[n];//ARRAY 1
		int ar2[] = new int[n];//ARRAY 2
		int sum[] = new int[n];//RESULTANT ARRAY
		System.out.println("Enter elements of 1st array :");
		for(int i=0;i<n;i++)
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of 2nd array :");
		for(int i=0;i<n;i++)
		{
			ar2[i]=sc.nextInt();
		}
		System.out.println("Sum of two array elements :");
		for(int i=0;i<n;i++)
		{
			sum[i]=ar1[i]-ar2[i];
			System.out.println(sum[i]);
		}
	}
}
