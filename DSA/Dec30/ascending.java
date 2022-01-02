class practice
{
	public static void main(String[] args) {
		String str="eDefSR";
		int [] low_freq=new int[26];
		int [] up_freq=new int[26];
		for(int i=0;i<str.length();i++)
		{
			if (Character.isLowerCase(str.charAt(i)))
				low_freq[str.charAt(i)-'a']++;
			else if (Character.isUpperCase(str.charAt(i)))
				up_freq[str.charAt(i)-'A']++;
		}
		int i = 0, j = 0;
		char str1[]=str.toCharArray();
		while (i < 26 && low_freq[i] == 0)
		    i++;

		while (j < 26 && up_freq[j] == 0)
		    j++;
		for (int k=0;k<str.length();k++)
		{
		    if (Character.isLowerCase(str.charAt(k)))
		    {
		        while (low_freq[i] == 0)
		            i++;
		        str1[k]=(char) (i + 'a');
		        low_freq[i]--;
		    } 
		    else if (Character.isUpperCase(str.charAt(k)))
		    {
		        while (up_freq[j] == 0)
		            j++;
		        str1[k]=(char) (j + 'A');
		        up_freq[j]--;
		    }
		}
		for(int a=0;a<str1.length;a++)
		{
		System.out.print(str1[a]);
		}
	}
}
