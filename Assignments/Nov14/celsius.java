package geek1;

import java.util.Scanner;

public class celsius 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		double f,c;
		System.out.println("Enter the temperature in degree Fahrenheit:");
		f=sc.nextDouble();
		c=((f-32)*5)/9;
		System.out.println(c);
	}

}
