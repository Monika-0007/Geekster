package classes;

import java.util.Scanner;

public class multiply {
	public static int pro(int n1,int n2)
	{
		int res=n1*n2;
		return res;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int num1,num2,res;
		System.out.println("Enter the numbers :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		res=pro(num1,num2);
		System.out.println(num1+"*"+num2+"="+res);

	}
}

