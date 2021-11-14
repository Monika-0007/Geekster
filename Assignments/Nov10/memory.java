package geekster;

public class memory {

	public static void main(String[] args) {
		//Primitive Data Types
		int a=10;
		float f=250.56785f;
		double d=1256.15426456;
		char c='M';
		boolean b=true;
		System.out.println("P R I M I T I V E  D A T A  T Y P E S");
		System.out.println("Integer value : "+a);
		System.out.println("Float value : "+f);
		System.out.println("Double value : "+d);
		System.out.println("Character value : "+c);
		System.out.println("Boolean value : "+b+"\n");
		//Non-Primitive Data Types
		System.out.println("N O N - P R I M I T I V E  D A T A  T Y P E S");
		String name="MONIKA";
		System.out.println("String value : "+name);
		int arr[]= {1,2,3,4,5};
		int val,val1;
		//Memory Allocation
		val=addValuenum(a);
		System.out.println("Modified Value: "+val);
		val1=addValuearr(arr);
		System.out.println("Modified Array Value: "+val1);	
	}
	public static int addValuenum(int a)
	{
	a=a+10;
	return a;
	}
	public static int addValuearr(int arr[])
	{
	arr[3]=arr[3]+5;
	return arr[3];
	}
}


