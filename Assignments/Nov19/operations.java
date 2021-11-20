package operators;

import java.util.Scanner;

public class operations {
	//Method to perform different arithmetic operations
	
	public static double operations(int a,int b,char c)//CONSTRUCTOR 
	//"Method having same name as that of the class"
	{
		double res=0;
		if(c == '+')
		{
			res=a+b;
		}
		else if(c == '-')
		{
			res=a-b;
		}
		else if(c == '*')
		{
			res=a*b;
		}
		else if(c == '/')
		{
			res=((float)a)/b;
		}
		else
		{
			System.out.println("Wrong operator");
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		int a,b;
		double res;
		System.out.println("\tO P E R A T I O N S\t");
		System.out.println("1. Enter '+' for addition\n2. Enter '-' for subtration\n3. Enter '*' for multiplication\n4. Enter '/' for division");
		System.out.println("Enter your choice :");
		c = sc.next().charAt(0);
		System.out.println("Enter the two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		res=operations(a,b,c);
		System.out.println(a+" "+c+" "+b+" = "+res);
	}

}
