class practice
{
	public static void main(String[] args) {
		String str="qwertyuiopasdfghjklzxcvbnm";
		int [] freq=new int[26];
		for(int i=0;i<str.length();i++)
		{
			freq[str.charAt(i)-'a']++;
			
		}
		for(int i=26-1;i>=0;i--)
		{
			for(int j=0;j<freq[i];j++)
			{
				System.out.print((char) ('a' + i));
			}
		}
	}
}
