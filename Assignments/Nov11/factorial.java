package geekster;
import java.util.Scanner;

public class factorial {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int fact=1,num;
		System.out.println("Enter the number :");
		num=sc.nextInt();
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		/*int i=num;//while loop
		 * while(i>=1)
		 * {
		 * fact=fact*i;
		 * i--;
		 * }
		 */
		System.out.print(num+"!= "+fact);
	}

}
