package classes;

public class maximum {
    
    //two integer arguments
	public static int maxi(int n1,int n2)
	{
		int m=Math.max(n1, n2);
		return m;
	}
	//three integer arguments
	public static int maxi(int n1,int n2,int n3)
	{
		int m=Math.max(Math.max(n1, n2),n3);
		return m;
	}
	//four integer arguments
	public static int maxi(int n1,int n2,int n3,int n4)
	{
		int m=Math.max(Math.max(Math.max(n1, n2),n3),n4);
		return m;
	}
	public static void main(String[] args) {
		int maximum;
		System.out.println("M A X I M U M\n");
		maximum=maxi(451,255);//change values to check different inputs
		System.out.println("Maximum = "+maximum);
	}

}
