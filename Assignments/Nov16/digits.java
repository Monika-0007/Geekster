package classes;

import java.util.Scanner;

public class digits {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int m,digit;
		char ch;
		//Do while for taking continuous input
		do {
			digit=0;
		System.out.println("Enter the number:");
		m=sc.nextInt();
		//to count number of digits
		do
		{
			digit++;
			m/=10;
		}while(m!=0);
		if(digit==1)
		{
           System.out.println("The number is a one digit number");	
		}
		else if(digit==2)
		{
			System.out.println("The number is a two digit number");
		}
		else if(digit==3)
		{
			System.out.println("The number is a three digit number");
		}
		else
		{
			System.out.println("The number is too high");
		}
		
		System.out.println("Do you want to continue(y/n)");
		ch=sc.next().charAt(0);
	}while(ch=='y');

}
}
