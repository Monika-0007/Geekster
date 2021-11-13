package patterns;

public class pattern8 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++)
			{
				int k=i+1;
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
