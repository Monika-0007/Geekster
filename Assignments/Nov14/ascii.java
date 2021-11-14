package geek1;

import java.util.Scanner;

public class ascii //ASCII value of any given character 
{

	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		char c;
		System.out.println("Enter the character :");
		c=sc.next().charAt(0);
		int ch=(int)c;
		System.out.println(ch);
	}
}
