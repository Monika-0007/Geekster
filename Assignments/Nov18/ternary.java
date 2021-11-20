package operators;

import java.util.Scanner;

public class ternary {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int a,b,c,max; 
		System.out.println("Enter a,b,c :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		max=(a>b)? (a>c)?a:c :(b>c)?b:c;
		System.out.println("Max = "+max);	
	}
}
