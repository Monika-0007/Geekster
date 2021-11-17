package geek1;

public class twoNumbers {
	public static void main(String[] args) //Program to check maximum, minimum and average of two numbers
	{
		int n1=10,n2=15,max,min;
		double avg;
		System.out.println("The numbers are :"+n1+" & "+n2);
		max=Math.max(n1, n2);
		min=Math.min(n1,n2);
		avg=(n1+n2)/2;
		System.out.println("Maximum :"+max);
		System.out.println("Minimum :"+min);
		System.out.println("Average :"+avg);
	
	}

}
