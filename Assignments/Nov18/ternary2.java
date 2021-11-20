package operators;

import java.util.Scanner;

//Program to find the greatest of two numbers using ternary operator
public class ternary2 

{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int a,b,max; 
		System.out.println("Enter a and b :");
		a=sc.nextInt();
		b=sc.nextInt();
		max=(a>b)?a:b;
		System.out.println("Max = "+max);	
	}
}
