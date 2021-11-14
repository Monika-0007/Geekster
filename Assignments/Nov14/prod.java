package geek1;

import java.util.Scanner;

public class prod//program to program to print the product of the decimal and int numbers
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		double n1,pro;
		int n2;
		System.out.println("Enter the decimal number :");
		n1=sc.nextDouble();
		System.out.println("Enter the integer number :");
		n2=sc.nextInt();
		pro=n1*n2;
		//double p=Math.round(pro);
		System.out.println(n1+"*"+n2+"="+pro);
	}

}
