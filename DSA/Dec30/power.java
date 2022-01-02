class practice
{
	public static int power(int x,int y)
	{
		if(y==0)
			return 1;
		
		return x*power(x,y-1);
	}
	public static void main(String[] args) {
	System.out.println(power(2,5));
	}
}
