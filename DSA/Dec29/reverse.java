class practice
{
	static int sum=0;
	public static int reverse(int num)
	{
		if(num==0)
			return sum;
		else {
			int rem=num%10;
			sum=sum*10+rem;
			reverse(num/10);
		}
		return sum;
	}
	public static void main(String[] args) {
	System.out.println(reverse(109));
	}
}
