import java.util.Scanner;

public class firstUpper 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		String str="";	
		System.out.println("Enter the sentence :");
		str=sc.nextLine();
		char[] arr=str.toCharArray();
		String s="";
		//To convert first character of the sentence to Upper Case
		s=s+arr[0];
		s=s.toUpperCase();
		//To covert first character of each word in a sentence to Upper Case
		for(int i=1;i<arr.length;i++)//i=1 as character at index 0 already converted to Upper case
		{
			if(arr[i]!=' ')
			{
				s=s+arr[i];
			}
			else if(arr[i]==' ')
			{
				String up="";
				up=up+arr[i+1];
				up=up.toUpperCase();
				s=s+" "+up;
				i++;
			}
		}
		System.out.println("Modified String :\n"+s);
	}
}
