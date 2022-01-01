import java.util.Scanner;

public class practice {
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[][]=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("SPIRAL MATRIX");
		int w=0;
		int x=a-1;
		int y=0;
		int z=b-1;
		while(w<=x && y<=z) 
		{
		for(int i=w;i<=z;i++) 
		{
			System.out.print(arr[w][i]+" ");
		}
		for(int i=w+1;i<=x;i++) {
			System.out.print(arr[i][z]+" ");
		}
		if(w+1 <= x)
		{
			for(int i=z-1;i>=y;i--) {
				System.out.print(arr[x][i]+" ");
			}
		}
		if(y+1 <= z)
		{
			for(int i=x-1;i>w;i--) {
				System.out.print(arr[i][y]+" ");
			}
		}
		w++;
		x--;
		y++;
		z--;
		}
	}
}
