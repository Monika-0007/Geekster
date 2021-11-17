package classes;

import java.util.Scanner;

public class multiply1 {
    //Function 	Overloading
	public static int pro(int n1,int n2)
	{
		int res=n1*n2;
		return res;
	}
	public static float pro(float n1,float n2)
	{
		float res=n1*n2;
		return res;
	}
	public static long pro(long n1,long n2)
	{
		long res=n1*n2;
		return res;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int i1,i2,resi;
		float f1,f2,resf;
		long l1,l2,resl;
		System.out.println("M U L T I P L I C A T I O N\n");
		//Integer
		System.out.println("Enter the integer numbers :");
		i1=sc.nextInt();
		i2=sc.nextInt();
		resi=pro(i1,i2);
		System.out.println("Answer ="+resi);
		//Float
		System.out.println("Enter the float numbers :");
		f1=sc.nextFloat();
		f2=sc.nextFloat();
		resf=pro(f1,f2);
		System.out.println("Answer ="+resf);
		//Long
		System.out.println("Enter the long numbers :");
		l1=sc.nextLong();
		l2=sc.nextLong();
		resl=pro(l1,l2);
		System.out.println("Answer ="+resl);
	}

}
