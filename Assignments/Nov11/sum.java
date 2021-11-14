package geekster;
import java.util.Scanner;

public class sum {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int sum=0,num;
		System.out.println("Enter the number :");
		num=sc.nextInt();
		for(int i=num;i>=1;i--)
		{
			sum=sum+i;
		}
		/*int i=num;//while loop
		 * while(i>=1)
		 * {
		 * sum=sum*i;
		 * i--;
		 * }
		 */
		System.out.print(sum);
	}

}

