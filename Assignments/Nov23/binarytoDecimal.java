package arrays;

import java.util.Scanner;

public class dectobin {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number :");
		int num=sc.nextInt();
		int sum=0,i=0;
		while(num!=0)
	       {
	    	  sum+=(num%10)*Math.pow(2, i);
	    	  num=num/10;
	    	  i++;
	       }
	       System.out.println("Decimal Equivalent : "+sum);
	}
}

