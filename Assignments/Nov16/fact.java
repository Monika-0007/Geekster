package classes;

import java.util.Scanner;

public class fact {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int m;
		long fact;
		char ch;
		//Do while for taking continuous input
		do {
			fact=1;
		System.out.println("Enter the number:");
		m=sc.nextInt();
		//to find factorial of a number
		for(int i=1;i<=m;i++)
		{
			fact=fact*i;
		}
		System.out.println(m+"!="+fact);
		System.out.println("Do you want to continue(y/n)");
		ch=sc.next().charAt(0);
	}while(ch=='y');

}
}
