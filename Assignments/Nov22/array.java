package arrays;

import java.util.Scanner;

public class array {
	
	//Method to find sum of all elements in an array
	public void sum(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
		}
		System.out.println("Sum of all elements in the array : "+sum);
	}
	
	//Method to find middle element in an array
	public void midElement(int ar[])
	{
		int mid=(ar.length)/2;
		if(ar.length%2!=0)//Odd Number of elements in the array has one middle element
		{
			System.out.println("Middle Element in the array : "+ar[mid]);
		}
		else//Even Number of elements in the array has two two middle elements
		{
			System.out.println("Middle Elements in the array : "+ar[mid-1]+" & "+ar[mid]);
		}
	}
	
	//Method to print all positive elements in an array
	public void positive(int ar[])
	{
		String arr="";
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
			{
				arr=arr+" "+ar[i];
			}
		}
		System.out.println("Positive elements present in the array : "+arr);
	}
	
	//Main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []a = new int[10];
		
		System.out.println("Enter the 10 elements in the array:");
		// For loop to take user input of size 10
		for(int i=0;i<10;i++) 
		{
			a[i]=sc.nextInt();		
		}
		array arr=new array();//Object creation to invoke non-static methods
		arr.sum(a);
		arr.midElement(a);
		arr.positive(a);
		sc.close();
	}

}
