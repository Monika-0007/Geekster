package classes;

import java.util.Scanner;

public class oddeven {
	//function to check if the number is odd or even
	public static void check(int n)
	{
		if (n%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		check(num);
	}

}
