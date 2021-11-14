package geekster;
import java.util.Scanner;

public class product {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sca = new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num=sca.nextInt();
		int tot=1;
		//for loop
		for(int i=1;i<=10;i++)
		{
			tot=num*i;
			System.out.println(num+" x "+i+" = "+tot);
		}
		//while loop
     	/*int j=1,tot=1;
		while(j<=10)
		{
			tot=num*j;
			System.out.println(num+" x "+j+" = "+tot);
			j++;
		}*/
		
}
}
