import java.util.Scanner;
class practice {
    public static void even(int n)
    {
    	if(n>0)
    	{    
    		if(n%2==0) {
    			System.out.print(n+" ");
    	    	even(n-2);
    		}
    	}
    }
    public static void main(String args[])
    {
    	Scanner sc  = new Scanner(System.in);
    	int n=sc.nextInt();
    	even(n);        
    }
}
