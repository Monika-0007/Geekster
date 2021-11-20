package operators;

import java.util.Scanner;

public class relation {
	//**********Program to take two numbers as input and print their relationship*********

		public static void relate(int a,int b)
		{
			if(a==b)
			{
				System.out.println(a+" is equal to "+b);
			}
			else
			{
				System.out.print(a+" is not equal to "+b+" and ");
				if(a<b)
				{
				System.out.println(a+" is less than "+b);
			    }
			    else
			    {
			 	System.out.println(a+" is greater than "+b);	
			    }	
			}
		}
		//Main Method
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a,b;
			System.out.println("R E L A T I O N");
			System.out.println("Enter a and b :");
			a=sc.nextInt();
			b=sc.nextInt();
			relate(a,b);	
		}
}
