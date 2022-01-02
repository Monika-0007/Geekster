class practice
{
	public static double avg(int a[],int i,int n)
	{
		if (i == n-1)
	        return a[i];
		if (i == 0)
	        return ((a[i] + avg(a, i+1, n))/n);
		
		return (a[i] + avg(a, i+1, n));
	}
	static double average(int a[], int n)
	{
	     return avg(a, 0, n);
	}
	public static void main(String[] args) {
		int arr []= {1,2,3,4,5};
		int n=arr.length;
	System.out.println(average(arr,n));
	}
}
