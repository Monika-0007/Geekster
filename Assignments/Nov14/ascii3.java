package geek1;

import java.util.Scanner;

public class ascii3 //ASCII value + 3 and display the character
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		char c;
		int ch,s;
		System.out.println("Enter the character :");
		c=sc.next().charAt(0);
		ch=(int)c;
		s=ch+3;
		System.out.println((char)s);
	}
}
