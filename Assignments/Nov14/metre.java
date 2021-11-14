package geek1;

import java.util.Scanner;

public class metre {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		double i,m;
		System.out.println("Enter the length in inches:");
		i=sc.nextDouble();
	    m=i*0.0254;
		System.out.println(m+"m");
	}

}
