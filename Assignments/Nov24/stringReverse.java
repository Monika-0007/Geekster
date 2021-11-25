import java.util.Scanner;

public class reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		String str="";	
		System.out.println("Enter the word :");
		str=sc.nextLine();
		char[] arr=str.toCharArray();
	
    //Variable to store the reversed String
		String s="";
    
    //To reverse the given String
		for(int i=(arr.length)-1;i>=0;i--)
		{
			s=s+arr[i];
		}
		System.out.println("Reversed String : "+s);
    
		//To check if the string is palindrome or not
		if(str.equalsIgnoreCase(s))//Ignores the Case
			System.out.println(str+" - is a palindrome!!");
		else
			System.out.println(str+" - is not a palindrome!!");
	}
}

